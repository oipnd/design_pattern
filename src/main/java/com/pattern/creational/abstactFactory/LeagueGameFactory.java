package com.pattern.creational.abstactFactory;

public class LeagueGameFactory implements GameFactory {

    public Game getGame() {
        return new LeagueGame();
    }

    public Article getArticle() {
        return new LeagueGameArticle();
    }
}
