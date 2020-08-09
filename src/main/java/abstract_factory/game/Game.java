package abstract_factory.game;

import abstract_factory.Enemy.Enemy;
import abstract_factory.arena.Arena;
import abstract_factory.level.Level;

public class Game {
    private Level level;
    private Arena arena;
    private Enemy enemy;

    public Game(GameFactory game) {
        this.level = game.createLevel();
        this.arena = game.createArena();
        enemy = game.createEnemy();
    }

    public void start() {
        this.level.start();
        this.arena.start();
    }
}
