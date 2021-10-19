package com.company;

public class Sandbox implements Dev{
    @Override
    public void description() {
        System.out.println("Sandbox genre based game");
    }

    @Override
    public void ageRestriction() {
        System.out.println("PEGI 3. Suitable for all age groups");
    }
}
