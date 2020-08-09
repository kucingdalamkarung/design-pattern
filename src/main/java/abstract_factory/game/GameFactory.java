package abstract_factory.game;

import abstract_factory.Enemy.Enemy;
import abstract_factory.arena.Arena;
import abstract_factory.level.Level;

public interface GameFactory {
    Level createLevel();
    Arena createArena();
    Enemy createEnemy();
}
