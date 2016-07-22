package io.github.tjzilla.rustvilla.world;


import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;

//Owns a registry of levels and allows loading of them.
public class LevelManager {
    private BiMap<String, TiledMap> maps;

    public LevelManager() {
        maps = HashBiMap.create();
    }

    //Add the level to the list of levels
    public void addLevel(String levelName) {
        if(!containsKey(levelName)) {
            maps.put(levelName,  new TmxMapLoader().load(levelName + ".tmx"));
        } else {
            System.out.println("The world " + levelName + " has been registered or the name is already in use");
        }
    }

    //Load a level by it's string key
    public TiledMap loadLevel(String levelName) {
        if (containsKey(levelName)) {
            System.out.println("Loading map: " + levelName);
            return maps.get(levelName);
        }
        return null;
    }

    //Check if the level is already been added to the game
    private boolean containsKey(String levelName) {
        if (maps.containsKey(levelName)) {
            return true;
        }
        return false;
    }

}
