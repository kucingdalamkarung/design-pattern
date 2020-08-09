package abstract_factory;

import abstract_factory.arena.Arena;
import abstract_factory.game.Game;
import abstract_factory.game.GameFactoryEasy;
import abstract_factory.level.Easy;
import abstract_factory.level.Level;

public class App {
    public static void main(String[] args) {
        Game easyGame = new Game(new GameFactoryEasy());
        easyGame.start();
    }
}
