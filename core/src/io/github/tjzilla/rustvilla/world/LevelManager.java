package io.github.tjzilla.rustvilla.world;


import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;

public class LevelManager {
    private static final BiMap<String, TiledMap> maps = HashBiMap.create();

    public static void addLevel(String levelName) {
        if(!containsKey(levelName)) {
            maps.put(levelName,  new TmxMapLoader().load(levelName + ".tmx"));
        } else {
            System.out.println("The world " + levelName + " has been registered or the name is already in use");
        }
    }
    
    public static TiledMap loadLevel(String levelName) {
        if (containsKey(levelName)) {
            System.out.println("Loading map: " + levelName);
            return maps.get(levelName);
        }
        return null;
    }


    private static boolean containsKey(String levelName) {
        if (maps.containsKey(levelName)) {
            return true;
        }
        return false;
    }

}
