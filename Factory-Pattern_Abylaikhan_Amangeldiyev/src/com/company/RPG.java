package com.company;

public class RPG implements Dev{

    @Override
    public void description() {
        System.out.println("The RPG genre based game");
    }

    @Override
    public void ageRestriction() {
        System.out.println("PEGI 12. 12 years or older");
    }
}
