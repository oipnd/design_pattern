package com.pattern.creational.builder;

public class GameCompany {


    //注入gamebuilder抽象类
    private GameBuilder gameBuilder;

    public void setGameBuilder(GameBuilder gameBuilder) {
        this.gameBuilder = gameBuilder;
    }

    public Game developGame(String gameRoles,
                            String gameStories,
                            String gameStages,
                            String gameMusic,
                            String gameDirector){
        this.gameBuilder.buildgameDirector(gameDirector);
        this.gameBuilder.buildgameMusic(gameMusic);
        this.gameBuilder.buildGameRoles(gameRoles);
        this.gameBuilder.buildgameStages(gameStages);
        this.gameBuilder.buildgameStories(gameStories);

        return this.gameBuilder.developGame();

    }
}
