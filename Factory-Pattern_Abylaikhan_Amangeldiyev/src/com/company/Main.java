package com.company;

public class Main {

    public static void main(String[] args) {
        //using game dev factory to generate game objects
        GameDevFactory gameFactory = new GameDevFactory();


        //getting sandbox genre game and its methods
        Dev minecraft = gameFactory.devGame("Sandbox");
        minecraft.description();
        minecraft.ageRestriction();

        //getting RPG genre game and its methods
        Dev diablo = gameFactory.devGame("RPG");
        diablo.description();
        diablo.ageRestriction();

        //getting Shooter genre game and its methods
        Dev battlefield = gameFactory.devGame("Shooter");
        battlefield.description();
        battlefield.ageRestriction();

    }
}
