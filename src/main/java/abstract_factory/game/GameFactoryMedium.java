package abstract_factory.game;

import abstract_factory.Enemy.Enemy;
import abstract_factory.arena.Arena;
import abstract_factory.level.Level;
import abstract_factory.level.Medium;

public class GameFactoryMedium implements GameFactory {
    @Override
    public Level createLevel() {
        return new Medium();
    }

    @Override
    public Arena createArena() {
        return new abstract_factory.arena.Medium();
    }

    @Override
    public Enemy createEnemy() {
        return new abstract_factory.Enemy.Medium();
    }
}
