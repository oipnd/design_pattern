package com.pattern.creational.builder;

import java.util.Dictionary;

public class GameActualBulider extends GameBuilder {

    //private权限，开闭原则
    private Game game=new Game();


    public void buildGameRoles(String roles) {
        game.setGameRoles(roles);
    }

    public void buildgameStories(String stories) {
        game.setGameStories(stories);
    }

    public void buildgameStages(String stages) {
        game.setGameStages(stages);
    }

    public void buildgameMusic(String music) {
        game.setGameMusic(music);
    }

    public void buildgameDirector(String director) {
        game.setGameDirector(director);
    }

    public Game developGame() {
        return game;
    }


}
