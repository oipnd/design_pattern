package com.pattern.creational.factoryMethod;

public class CsGameFactory extends GameFactory {
    public Game getGame(Class clazz) {
        return new CsGame();
    }
}
