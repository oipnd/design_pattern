package com.pattern.creational.builder;

public class Test {
    public static void main(String[] args) {
        GameBuilder gameBuilder=new GameActualBulider();
        GameCompany gameCompany=new GameCompany();

        gameCompany.setGameBuilder(gameBuilder);

        Game game=gameCompany.developGame("Death Kinght", "Warcraft", "Stage1", "Death music", "Blizzard");
        System.out.println(game);
    }
}

