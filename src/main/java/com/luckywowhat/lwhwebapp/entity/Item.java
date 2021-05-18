package com.luckywowhat.lwhwebapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {

    @Id
    @Column(name="id")
    private int id;

    @Column(name="link")
    private String link;

    @Column(name="ilvl")
    private int ilvl;

    @Column(name="type")
    private String type;

    @Column(name="slot")
    private String slot;

    @Column(name="armor")
    private int armor;

    @Column(name="intellect")
    private int intellect;

    @Column(name="agility")
    private int agility;

    @Column(name="strength")
    private int strength;

    @Column(name="stamina")
    private int stamina;

    @Column(name="crit")
    private int crit;

    @Column(name="haste")
    private int haste;

    @Column(name="versatility")
    private int versatility;

    @Column(name="mastery")
    private int mastery;

    public Item() {
    }

    public Item(int id, int ilvl) {
        this.id = id;
        this.ilvl = ilvl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getIlvl() {
        return ilvl;
    }

    public void setIlvl(int ilvl) {
        this.ilvl = ilvl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

    public int getHaste() {
        return haste;
    }

    public void setHaste(int haste) {
        this.haste = haste;
    }

    public int getVersatility() {
        return versatility;
    }

    public void setVersatility(int versatility) {
        this.versatility = versatility;
    }

    public int getMastery() {
        return mastery;
    }

    public void setMastery(int mastery) {
        this.mastery = mastery;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", link='" + link + '\'' +
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
