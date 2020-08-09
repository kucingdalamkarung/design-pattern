package abstract_factory.game;

import abstract_factory.Enemy.Enemy;
import abstract_factory.arena.Arena;
import abstract_factory.arena.Hard;
import abstract_factory.level.Easy;
import abstract_factory.level.Level;

public class GameFactoryHard implements GameFactory {
    @Override
    public Level createLevel() {
        return (Level) new Hard();
    }

    @Override
    public Arena createArena() {
        return new Hard();
    }

    @Override
    public Enemy createEnemy() {
        return new abstract_factory.Enemy.Hard();
    }
}
