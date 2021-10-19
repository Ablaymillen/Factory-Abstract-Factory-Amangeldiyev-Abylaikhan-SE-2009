package com.company;

public class Shooter implements Dev{
    @Override
    public void description() {
        System.out.println("Shooter genre based game");
    }

    @Override
    public void ageRestriction() {
        System.out.println("PEGI 16. 16 years or older");
    }
}
