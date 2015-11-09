package com.mygdx.platfd;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

public class platfdmc extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Table container;

	@Override
	public void create () {
		container = new Table();
		batch = new SpriteBatch();
		img = new Texture("lala.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0,1,0,1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		batch.draw(img, 17, 100);
		batch.end();
	}
}
