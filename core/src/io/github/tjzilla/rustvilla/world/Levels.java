package io.github.tjzilla.rustvilla.world;

import com.badlogic.gdx.maps.tiled.TiledMap;

/**
 * Created by TJ on 7/21/2016.
 */
public class Levels {
    private LevelManager levelManager;
    public TiledMap test;

    public Levels() {
        registerLevels();
        getLevels();
        test.getLayers().get("collsion");
    }

    private void registerLevels() {
        levelManager.addLevel("test");
    }

    private void getLevels() {
        test = levelManager.loadLevel("test");
    }

}
