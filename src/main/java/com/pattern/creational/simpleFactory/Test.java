package com.pattern.creational.simpleFactory;

public class Test {

    public static void main(String[] args) {

        //v1 实现类通过继承抽象类
        //Game game=new LeagueGame();
        //game.play();
        //game=new CsGame();
        //game.play();

        //v2 通过传入的name参数，工厂类返回具体的实现类,
        //GameFactory gameFactory=new GameFactory();
        //Game game=gameFactory.getGame("league");
        //game.play();
        //game=gameFactory.getGame("cs");
        //game.play();

        //v3 通过反射，直接传入class，
        GameFactory gameFactory=new GameFactory();
        Game game=gameFactory.getGame(LeagueGame.class);
        game.play();
        game=gameFactory.getGame(CsGame.class);
        game.play();


    }

}
