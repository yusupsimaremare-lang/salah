package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        // Membuat 3 karakter
        Character hero1 = new Character(
            "Arthur", CharacterType.WARRIOR
        );

        Character hero2 = new Character(
            "Merlin", CharacterType.MAGE, 5
        );

        Character hero3 = new Character(
            "Robin", CharacterType.ARCHER, 3
        );

        // Menampilkan data karakter
        System.out.println("===== DATA KARAKTER =====");

        System.out.println(hero1);
        System.out.println(hero2);
        System.out.println(hero3);

        // Demo level up
        System.out.println("\n===== DEMO LEVEL UP =====");

        hero1.setLevel(2);

        System.out.println("Arthur naik ke level 2!");
        System.out.println(hero1);

        // Mini Challenge
        System.out.println("\n===== MINI CHALLENGE =====");

        Character hero4 = new Character(
            "Shadow", CharacterType.ROGUE, 4
        );

        // Mengatur mana
        hero4.setMana(100);

        System.out.println(hero4);

        // Memeriksa kondisi karakter
        System.out.println(
            "Apakah Shadow masih hidup? "
            + hero4.isAlive()
        );
    }
}