package com.unpri.charactermanager.model;

public class Character {

    // Atribut private
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;
    private int mana;

    // Constructor pertama
    public Character(String name, CharacterType type) {
        this(name, type, 1);
    }

    // Constructor kedua
    public Character(String name, CharacterType type, int level) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.mana = 0;

        recalculateStats();
    }

    // Getter
    public String getName() {
        return name;
    }

    public CharacterType getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getMana() {
        return mana;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setType(CharacterType type) {
        this.type = type;
        recalculateStats();
    }

    public void setLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException(
                "Level minimal 1"
            );
        }

        this.level = level;
        recalculateStats();
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException(
                "Mana tidak boleh negatif"
            );
        }

        this.mana = mana;
    }

    // Menghitung ulang statistik karakter
    private void recalculateStats() {

        switch (type) {

            case WARRIOR:
                hitPoints = 120 * level;
                attackPower = 15 * level;
                break;

            case MAGE:
                hitPoints = 80 * level;
                attackPower = 20 * level;
                break;

            case ARCHER:
                hitPoints = 100 * level;
                attackPower = 18 * level;
                break;

            case ROGUE:
                hitPoints = 90 * level;
                attackPower = 22 * level;
                break;
        }
    }

    // Memeriksa apakah karakter masih hidup
    public boolean isAlive() {
        return hitPoints > 0;
    }

    // Menampilkan informasi karakter
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", level=" + level +
                ", hitPoints=" + hitPoints +
                ", attackPower=" + attackPower +
                ", mana=" + mana +
                '}';
    }
}