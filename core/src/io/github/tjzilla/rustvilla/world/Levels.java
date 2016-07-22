package io.github.tjzilla.rustvilla.world;

import com.badlogic.gdx.maps.tiled.TiledMap;

/**
 * Created by TJ on 7/21/2016.
 */

//Makes using the level manager easier to use
public class Levels {
    private LevelManager levelManager;
    public TiledMap test;

    public Levels() {
        levelManager = new LevelManager();
        registerLevels();
        getLevels();
        test.getLayers().get("collsion");
    }

    //Register levels by their strings
    private void registerLevels() {
        levelManager.addLevel("test");
    }

    //Get the current levels by their string and bind it to an ease of access variable
    private void getLevels() {
        test = levelManager.loadLevel("test");
    }

}
