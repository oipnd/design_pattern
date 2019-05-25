package com.pattern.creational.builder;

public class Game {
    private String gameRoles;
    private String gameStories;
    private String gameStages;
    private String gameMusic;

    private String gameDirector;

    public String getGameRoles() {
        return gameRoles;
    }

    public void setGameRoles(String gameRoles) {
        this.gameRoles = gameRoles;
    }

    public String getGameStories() {
        return gameStories;
    }

    public void setGameStories(String gameStories) {
        this.gameStories = gameStories;
    }

    public String getGameStages() {
        return gameStages;
    }

    public void setGameStages(String gameStages) {
        this.gameStages = gameStages;
    }

    public String getGameMusic() {
        return gameMusic;
    }

    public void setGameMusic(String gameMusic) {
        this.gameMusic = gameMusic;
    }

    public String getGameDirector() {
        return gameDirector;
    }

    public void setGameDirector(String gameDirector) {
        this.gameDirector = gameDirector;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameRoles='" + gameRoles + '\'' +
                ", gameStories='" + gameStories + '\'' +
                ", gameStages='" + gameStages + '\'' +
                ", gameMusic='" + gameMusic + '\'' +
                ", gameDirector='" + gameDirector + '\'' +
                '}';
    }
}
