package com.company;

public class Roguelike implements Dev{
    @Override
    public void description() {
        System.out.println("Rogue-like genre based game");
    }

    @Override
    public void ageRestriction() {
        System.out.println("PEGI 12. 12 years or older");
    }
}
