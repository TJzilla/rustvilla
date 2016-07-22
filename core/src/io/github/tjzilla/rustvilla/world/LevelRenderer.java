package io.github.tjzilla.rustvilla.world;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.renderers.OrthoCachedTiledMapRenderer;

/**
 * Created by TJ on 7/20/2016.
 */
public class LevelRenderer {
    private TiledMapRenderer tiledMapRenderer;

    public LevelRenderer(TiledMap tiledMap) {
        tiledMapRenderer = new OrthoCachedTiledMapRenderer(tiledMap, 2, 5460);
    }

    public void getRenderedLevel(OrthographicCamera camera) {
        tiledMapRenderer.setView(camera);
        tiledMapRenderer.render();
    }

    public void changeRenderedLevel(TiledMap tiledMap) {
        tiledMapRenderer = new OrthoCachedTiledMapRenderer(tiledMap, 2, 5460);
    }


}
