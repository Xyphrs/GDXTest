package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GlobosMain extends ApplicationAdapter {
	SpriteBatch batch;
	Imagen imagen;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		imagen = new Imagen();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		imagen.update();

		batch.begin();
		imagen.render(batch);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		imagen.dispose();
	}
}
