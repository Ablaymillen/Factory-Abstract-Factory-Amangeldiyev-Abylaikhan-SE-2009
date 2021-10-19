package com.company;

//factory class for getting concrete class passing genres of the games

public class GameDevFactory {

    public Dev devGame(String genre){
        if(genre == null){
            return null;
        }
        if(genre.equalsIgnoreCase("RPG")){
            return new RPG();
        }
        if(genre.equalsIgnoreCase("Roguelike")){
            return new Roguelike();
        }
        if(genre.equalsIgnoreCase("Sandbox")){
            return new Sandbox();
        }
        if(genre.equalsIgnoreCase("Shooter")){
            return new Shooter();
        }
        return null;
    }

}
