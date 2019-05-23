package com.pattern.creational.abstactFactory;

public class CsGameFactory implements GameFactory {

    public Game getGame() {
        return new CsGame();
    }

    public Article getArticle() {
        return new CsGameArticle();
    }

}
