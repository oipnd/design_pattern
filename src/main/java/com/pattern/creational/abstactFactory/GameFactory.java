package com.pattern.creational.abstactFactory;

public interface GameFactory {

    //v2 工厂类包含具体实现逻辑，不符合开闭原则，因为不具备扩展性，主要原因在于需要依赖于其它类。
    //public Game getGame(String gameName) {
    //   if ("League".equalsIgnoreCase(gameName)){
    //       return new LeagueGame();
    //   } else if ("Cs".equalsIgnoreCase(gameName)) {
    //       return new CsGame();
    //   }
    //   return null;

    //v3
    Game getGame();

    Article getArticle();
}

