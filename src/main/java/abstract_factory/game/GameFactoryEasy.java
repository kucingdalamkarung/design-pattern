package abstract_factory.game;

import abstract_factory.Enemy.Enemy;
import abstract_factory.arena.Arena;
import abstract_factory.level.Easy;
import abstract_factory.level.Level;

public class GameFactoryEasy implements GameFactory {
    @Override
    public Level createLevel() {
        return new Easy();
    }

    @Override
    public Arena createArena() {
        return new abstract_factory.arena.Easy();
    }

    @Override
    public Enemy createEnemy() {
        return new abstract_factory.Enemy.Easy();
    }
}
