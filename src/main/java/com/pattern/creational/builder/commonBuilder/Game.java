package com.pattern.creational.builder.commonBuilder;

public class Game {
    private String gameRoles;
    private String gameStories;
    private String gameStages;
    private String gameMusic;

    private String gameDirector;

    public Game(GameBuilder gameBuilder) {
        this.gameDirector=gameBuilder.gameDirector;
        this.gameMusic=gameBuilder.gameMusic;
        this.gameRoles=gameBuilder.gameRoles;
        this.gameStages=gameBuilder.gameStages;
        this.gameStories=gameBuilder.gameStories;
    }

    //静态内部类当做builder
    public static class GameBuilder {
        private String gameRoles;
        private String gameStories;
        private String gameStages;
        private String gameMusic;

        private String gameDirector;


        //链式调用
        public GameBuilder buildGameRoles(String roles) {
            this.gameRoles = roles;
            return this;
        }


        public GameBuilder buildgameStories(String stories) {
            this.gameStories = stories;
            return this;
        }

        public GameBuilder buildgameStages(String stages) {
            this.gameStages = stages;
            return this;
        }

        public GameBuilder buildgameMusic(String music) {
            this.gameMusic = music;
            return this;
        }

        public GameBuilder buildgameDirector(String director) {
            this.gameDirector = director;
            return this;
        }

        public Game developGame() {

            return new Game(this);

        }


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
