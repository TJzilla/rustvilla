package io.github.tjzilla.rustvilla;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import io.github.tjzilla.rustvilla.world.LevelRenderer;
import io.github.tjzilla.rustvilla.world.Levels;

public class Rustvilla extends ApplicationAdapter {
	private SpriteBatch batch;
	private BitmapFont font;

	private OrthographicCamera camera;

    private Levels levels;
    private LevelRenderer levelRenderer;

	@Override
	public void create () {
		float width = Gdx.graphics.getWidth();
		float height = Gdx.graphics.getHeight();

		camera = new OrthographicCamera();
		camera.setToOrtho(false, width, height);
		camera.update();

        levels = new Levels();

        levelRenderer = new LevelRenderer(levels.test);

		batch = new SpriteBatch();
		font = new BitmapFont();
		font.setColor(Color.GREEN);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glEnable(GL20.GL_BLEND);
        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		camera.update();
        levelRenderer.getRenderedLevel(camera);

		batch.begin();
		font.draw(batch, "FPS: " + Gdx.graphics.getFramesPerSecond(), 25, Gdx.graphics.getHeight() - 1);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		font.dispose();
	}
}