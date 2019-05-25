package com.pattern.creational.builder.commonBuilder;

public class Test {
    public static void main(String[] args) {
        Game game = new Game.GameBuilder().buildgameDirector("Blizzard").
                buildgameMusic("Death").
                buildGameRoles("Death Knight").
                buildgameStages("Stage1").
                buildGameRoles("Death").
                buildgameStories("Warcraft").developGame();

        System.out.println(game);
    }
}
