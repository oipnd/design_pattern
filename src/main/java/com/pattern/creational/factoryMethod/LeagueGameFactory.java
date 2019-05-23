package com.pattern.creational.factoryMethod;

public class LeagueGameFactory extends GameFactory {

    public Game getGame(Class clazz) {
        return new LeagueGame();
    }
}
