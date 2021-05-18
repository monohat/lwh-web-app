package com.luckywowhat.lwhwebapp.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemParser {

    private int id;
    private String link;

    private int ilvl;
    private String type;
    private String slot;
    private int armor;
    private int intellect;
    private int agility;
    private int strength;
    private int stamina;
    private int crit;
    private int haste;
    private int versatility;
    private int mastery;

    public ItemParser(int id, int iLvl) {
        this.id = id;
        this.ilvl = iLvl;

        parse();
    }

    public int getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

    public int getiLvl() {
        return ilvl;
    }

    public String getType() {
        return type;
    }

    public String getSlot() {
        return slot;
    }

    public int getArmor() {
        return armor;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public int getStamina() {
        return stamina;
    }

    public int getCrit() {
        return crit;
    }

    public int getHaste() {
        return haste;
    }

    public int getVersatility() {
        return versatility;
    }

    public int getMastery() {
        return mastery;
    }

    private void parse() {
        List<String> allStats = new ArrayList();

        String url = "https://www.wowhead.com/item=" + Integer.toString(id)
                // specific item level
                + "?ilvl=" + Integer.toString(ilvl);
        link = url;
        String statsCssQuery = "span:contains(+):not(.q0)";
        String typeCssQuery = "span.q1";
        String armorCssQuery = "span:contains(Armor)";
        String slotCssQuery = "td";

        Document doc;

        try {
            doc = Jsoup.connect(url).get();

            // select item stats
            Elements stats = doc.select(statsCssQuery);
            for(int i = 0; i < stats.size(); i++) {
                allStats.add(stats.get(i).text());
            }
            // select item type
            Elements itemType = doc.select(typeCssQuery);
            type = itemType.text();
            // select armor
            Elements itemArmor = doc.select(armorCssQuery);
            armor = parsedToStat(itemArmor.text());
            // select slot
            Elements itemSlot = doc.select(slotCssQuery);
            slot = itemSlot.get(7).text();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> statsName = new ArrayList();
        statsName.add("Intellect");
        statsName.add("Agility");
        statsName.add("Strength");
        statsName.add("Stamina");
        statsName.add("Critical Strike");
        statsName.add("Haste");
        statsName.add("Versatility");
        statsName.add("Mastery");

        for (int i = 0; i < statsName.size(); i++) {
            for (int j = 0; j < allStats.size(); j++) {
                if (allStats.get(j).contains(statsName.get(i))) {
                    switch (i) {
                        case 0:
                            intellect = parsedToStat(allStats.get(j));
                            break;
                        case 1:
                            agility = parsedToStat(allStats.get(j));
                            break;
                        case 2:
                            strength = parsedToStat(allStats.get(j));
                            break;
                        case 3:
                            stamina = parsedToStat(allStats.get(j));
                            break;
                        case 4:
                            crit = parsedToStat(allStats.get(j));
                            break;
                        case 5:
                            haste = parsedToStat(allStats.get(j));
                            break;
                        case 6:
                            versatility = parsedToStat(allStats.get(j));
                            break;
                        case 7:
                            mastery = parsedToStat(allStats.get(j));
                            break;
                    }
                }
            }
        }

    }

    int parsedToStat(String parsedStat) {
        int stat = 0;

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(parsedStat);
        while(m.find()) {
            stat = Integer.parseInt(m.group());
        }

        return stat;
    }

    @Override
    public String toString() {
        return "ItemParser{" +
                "id=" + id +
                ", link=" + link +
                ", iLvl=" + ilvl +
                ", type='" + type + '\'' +
                ", slot='" + slot +
                ", armor=" + armor +
                ", intellect=" + intellect +
                ", agility=" + agility +
                ", strength=" + strength +
                ", stamina=" + stamina +
                ", crit=" + crit +
                ", haste=" + haste +
                ", versatility=" + versatility +
                ", mastery=" + mastery +
                '}';
    }
}
