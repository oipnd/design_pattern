package com.pattern.creational.simpleFactory;

import java.lang.reflect.InvocationTargetException;

public class GameFactory {

    //v2 工厂类包含具体实现逻辑，不符合开闭原则，因为不具备扩展性，主要原因在于需要依赖于其它类。
    //public Game getGame(String gameName) {
    //   if ("League".equalsIgnoreCase(gameName)){
    //       return new LeagueGame();
    //   } else if ("Cs".equalsIgnoreCase(gameName)) {
    //       return new CsGame();
    //   }
    //   return null;

    //v3
    public Game getGame(Class clazz) {
        Game game = null;
        try {
            // java 9中newinstance被替代为下面这个
            game = (Game) clazz.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return game;

    }
}

