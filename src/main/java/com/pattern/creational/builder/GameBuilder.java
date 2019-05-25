package com.pattern.creational.builder;

public abstract class GameBuilder {


    public abstract void buildGameRoles(String roles);
    public abstract void buildgameStories(String stories);
    public abstract void buildgameStages(String stages);
    public abstract void buildgameMusic( String music);
    public abstract void buildgameDirector(String director);

    public abstract Game developGame();

}
