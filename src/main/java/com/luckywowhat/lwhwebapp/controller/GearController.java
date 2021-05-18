package com.luckywowhat.lwhwebapp.controller;

import com.luckywowhat.lwhwebapp.entity.Item;
import com.luckywowhat.lwhwebapp.parser.ItemParser;
import com.luckywowhat.lwhwebapp.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Locale;

@Controller
public class GearController {

    private ItemService itemService;

    public GearController(ItemService theItemService) {
        this.itemService = theItemService;
    }

    @GetMapping("/gear")
    public String gear(Model theModel, @RequestParam("filterType") String filterType,
                       @RequestParam(value="Head", required = false) Integer head,
                       @RequestParam(value="Neck", required = false) Integer neck,
                       @RequestParam(value="Shoulder", required = false) Integer shoulder,
                       @RequestParam(value="Back", required = false) Integer back,
                       @RequestParam(value="Chest", required = false) Integer chest,
                       @RequestParam(value="Wrist", required = false) Integer wrist,
                       @RequestParam(value="Hands", required = false) Integer hands,
                       @RequestParam(value="Waist", required = false) Integer waist,
                       @RequestParam(value="Legs", required = false) Integer legs,
                       @RequestParam(value="Feet", required = false) Integer feet,
                       @RequestParam(value="RingFirst", required = false) Integer ringFirst,
                       @RequestParam(value="RingSecond", required = false) Integer ringSecond,
                       @RequestParam(value="TrinketFirst", required = false) Integer trinketFirst,
                       @RequestParam(value="TrinketSecond", required = false) Integer trinketSecond) {

        int armor = 0, intellect = 0, agility = 0, strength = 0,stamina = 0,
                crit = 0, haste = 0, versatility = 0, mastery = 0;

        Item itemHead;
        if (head != null) {
            itemHead = itemService.findById(head);

            armor += itemHead.getArmor();
            intellect += itemHead.getIntellect();
            agility += itemHead.getAgility();
            strength += itemHead.getStrength();
            stamina += itemHead.getStamina();
            crit += itemHead.getCrit();
            haste += itemHead.getHaste();
            versatility += itemHead.getVersatility();
            mastery += itemHead.getMastery();

            theModel.addAttribute("head", itemHead);
        } else {
            theModel.addAttribute("head", new Item());
        }

        Item itemNeck;
        if (neck != null) {
            itemNeck = itemService.findById(neck);

            armor += itemNeck.getArmor();
            intellect += itemNeck.getIntellect();
            agility += itemNeck.getAgility();
            strength += itemNeck.getStrength();
            stamina += itemNeck.getStamina();
            crit += itemNeck.getCrit();
            haste += itemNeck.getHaste();
            versatility += itemNeck.getVersatility();
            mastery += itemNeck.getMastery();

            theModel.addAttribute("neck", itemNeck);
        } else {
            theModel.addAttribute("neck", new Item());
        }

        Item itemShoulder;
        if (shoulder != null) {
            itemShoulder = itemService.findById(shoulder);

            armor += itemShoulder.getArmor();
            intellect += itemShoulder.getIntellect();
            agility += itemShoulder.getAgility();
            strength += itemShoulder.getStrength();
            stamina += itemShoulder.getStamina();
            crit += itemShoulder.getCrit();
            haste += itemShoulder.getHaste();
            versatility += itemShoulder.getVersatility();
            mastery += itemShoulder.getMastery();

            theModel.addAttribute("shoulder", itemShoulder);
        } else {
            theModel.addAttribute("shoulder", new Item());
        }

        Item itemBack;
        if (back != null) {
            itemBack = itemService.findById(back);

            armor += itemBack.getArmor();
            intellect += itemBack.getIntellect();
            agility += itemBack.getAgility();
            strength += itemBack.getStrength();
            stamina += itemBack.getStamina();
            crit += itemBack.getCrit();
            haste += itemBack.getHaste();
            versatility += itemBack.getVersatility();
            mastery += itemBack.getMastery();

            theModel.addAttribute("back", itemBack);
        } else {
            theModel.addAttribute("back", new Item());
        }

        Item itemChest;
        if (chest != null) {
            itemChest = itemService.findById(chest);

            armor += itemChest.getArmor();
            intellect += itemChest.getIntellect();
            agility += itemChest.getAgility();
            strength += itemChest.getStrength();
            stamina += itemChest.getStamina();
            crit += itemChest.getCrit();
            haste += itemChest.getHaste();
            versatility += itemChest.getVersatility();
            mastery += itemChest.getMastery();

            theModel.addAttribute("chest", itemChest);
        } else {
            theModel.addAttribute("chest", new Item());
        }

        Item itemWrist;
        if (wrist != null) {
            itemWrist = itemService.findById(wrist);

            armor += itemWrist.getArmor();
            intellect += itemWrist.getIntellect();
            agility += itemWrist.getAgility();
            strength += itemWrist.getStrength();
            stamina += itemWrist.getStamina();
            crit += itemWrist.getCrit();
            haste += itemWrist.getHaste();
            versatility += itemWrist.getVersatility();
            mastery += itemWrist.getMastery();

            theModel.addAttribute("wrist", itemWrist);
        } else  {
            theModel.addAttribute("wrist", new Item());
        }

        Item itemHands;
        if (hands != null) {
            itemHands = itemService.findById(hands);

            armor += itemHands.getArmor();
            intellect += itemHands.getIntellect();
            agility += itemHands.getAgility();
            strength += itemHands.getStrength();
            stamina += itemHands.getStamina();
            crit += itemHands.getCrit();
            haste += itemHands.getHaste();
            versatility += itemHands.getVersatility();
            mastery += itemHands.getMastery();

            theModel.addAttribute("hands", itemHands);
        } else {
            theModel.addAttribute("hands", new Item());
        }

        Item itemWaist;
        if (waist != null) {
            itemWaist = itemService.findById(waist);

            armor += itemWaist.getArmor();
            intellect += itemWaist.getIntellect();
            agility += itemWaist.getAgility();
            strength += itemWaist.getStrength();
            stamina += itemWaist.getStamina();
            crit += itemWaist.getCrit();
            haste += itemWaist.getHaste();
            versatility += itemWaist.getVersatility();
            mastery += itemWaist.getMastery();

            theModel.addAttribute("waist", itemWaist);
        } else {
            theModel.addAttribute("waist", new Item());
        }

        Item itemLegs;
        if (legs != null) {
            itemLegs = itemService.findById(legs);

            armor += itemLegs.getArmor();
            intellect += itemLegs.getIntellect();
            agility += itemLegs.getAgility();
            strength += itemLegs.getStrength();
            stamina += itemLegs.getStamina();
            crit += itemLegs.getCrit();
            haste += itemLegs.getHaste();
            versatility += itemLegs.getVersatility();
            mastery += itemLegs.getMastery();

            theModel.addAttribute("legs", itemLegs);
        } else {
            theModel.addAttribute("legs", new Item());
        }

        Item itemFeet;
        if (feet != null) {
            itemFeet = itemService.findById(feet);

            armor += itemFeet.getArmor();
            intellect += itemFeet.getIntellect();
            agility += itemFeet.getAgility();
            strength += itemFeet.getStrength();
            stamina += itemFeet.getStamina();
            crit += itemFeet.getCrit();
            haste += itemFeet.getHaste();
            versatility += itemFeet.getVersatility();
            mastery += itemFeet.getMastery();

            theModel.addAttribute("feet", itemFeet);
        } else {
            theModel.addAttribute("feet", new Item());
        }

        Item itemRingFirst;
        if (ringFirst != null) {
            itemRingFirst = itemService.findById(ringFirst);

            armor += itemRingFirst.getArmor();
            intellect += itemRingFirst.getIntellect();
            agility += itemRingFirst.getAgility();
            strength += itemRingFirst.getStrength();
            stamina += itemRingFirst.getStamina();
            crit += itemRingFirst.getCrit();
            haste += itemRingFirst.getHaste();
            versatility += itemRingFirst.getVersatility();
            mastery += itemRingFirst.getMastery();

            theModel.addAttribute("ringFirst", itemRingFirst);
        } else {
            theModel.addAttribute("ringFirst", new Item());
        }

        Item itemRingSecond;
        if (ringSecond != null) {
            itemRingSecond = itemService.findById(ringSecond);

            armor += itemRingSecond.getArmor();
            intellect += itemRingSecond.getIntellect();
            agility += itemRingSecond.getAgility();
            strength += itemRingSecond.getStrength();
            stamina += itemRingSecond.getStamina();
            crit += itemRingSecond.getCrit();
            haste += itemRingSecond.getHaste();
            versatility += itemRingSecond.getVersatility();
            mastery += itemRingSecond.getMastery();

            theModel.addAttribute("ringSecond", itemRingSecond);
        } else {
            theModel.addAttribute("ringSecond", new Item());
        }

        Item itemTrinketFirst;
        if (trinketFirst != null) {
            itemTrinketFirst = itemService.findById(trinketFirst);

            armor += itemTrinketFirst.getArmor();
            intellect += itemTrinketFirst.getIntellect();
            agility += itemTrinketFirst.getAgility();
            strength += itemTrinketFirst.getStrength();
            stamina += itemTrinketFirst.getStamina();
            crit += itemTrinketFirst.getCrit();
            haste += itemTrinketFirst.getHaste();
            versatility += itemTrinketFirst.getVersatility();
            mastery += itemTrinketFirst.getMastery();

            theModel.addAttribute("trinketFirst", itemTrinketFirst);
        } else {
            theModel.addAttribute("trinketFirst", new Item());
        }

        Item itemTrinketSecond;
        if (trinketSecond != null) {
            itemTrinketSecond = itemService.findById(trinketSecond);

            armor += itemTrinketSecond.getArmor();
            intellect += itemTrinketSecond.getIntellect();
            agility += itemTrinketSecond.getAgility();
            strength += itemTrinketSecond.getStrength();
            stamina += itemTrinketSecond.getStamina();
            crit += itemTrinketSecond.getCrit();
            haste += itemTrinketSecond.getHaste();
            versatility += itemTrinketSecond.getVersatility();
            mastery += itemTrinketSecond.getMastery();

            theModel.addAttribute("trinketSecond", itemTrinketSecond);
        } else {
            theModel.addAttribute("trinketSecond", new Item());
        }

        theModel.addAttribute("armor", armor);
        theModel.addAttribute("intellect", intellect);
        theModel.addAttribute("agility", agility);
        theModel.addAttribute("strength", strength);
        theModel.addAttribute("stamina", stamina);
        theModel.addAttribute("crit", crit);
        theModel.addAttribute("haste", haste);
        theModel.addAttribute("versatility", versatility);
        theModel.addAttribute("mastery", mastery);

        List<Item> theItems;

        switch (filterType) {
            case "Leather":
                theItems = itemService.findByType("Leather");
                break;
            case "Mail":
                theItems = itemService.findByType("Mail");
                break;
            case "Plate":
                theItems = itemService.findByType("Plate");
                break;
            default:
                theItems = itemService.findByType("Cloth");
                break;
        }

        theModel.addAttribute("items", theItems);

        return "gear";
    }

    @GetMapping("/gear/new")
    public String gearForm(Model theModel) {

        Item theItem = new Item();

        theModel.addAttribute("item", theItem);

        return "gear-form";
    }

    @PostMapping("/gear/save")
    public String saveItem(@ModelAttribute("item") Item theItem) {

        ItemParser itemParser = new ItemParser(theItem.getId(), theItem.getIlvl());

        theItem.setLink(itemParser.getLink());
        theItem.setType(itemParser.getType());
        theItem.setSlot(itemParser.getSlot());
        theItem.setArmor(itemParser.getArmor());
        theItem.setIntellect(itemParser.getIntellect());
        theItem.setAgility(itemParser.getAgility());
        theItem.setStrength(itemParser.getStrength());
        theItem.setStamina(itemParser.getStamina());
        theItem.setCrit(itemParser.getCrit());
        theItem.setHaste(itemParser.getHaste());
        theItem.setVersatility(itemParser.getVersatility());
        theItem.setMastery(itemParser.getMastery());

        itemService.save(theItem);

        return "redirect:/gear?filterType=" + theItem.getType().toLowerCase(Locale.ROOT);
    }

}
