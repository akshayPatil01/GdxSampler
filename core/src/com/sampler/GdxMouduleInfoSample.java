package com.sampler;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Logger;

public class GdxMouduleInfoSample implements ApplicationListener {

	private static final Logger log = new Logger(GdxMouduleInfoSample.class.getName(), Logger.DEBUG);
	private boolean renderInterrrupted = true;

	@Override
	public void create() {
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
		log.debug("create()");
	}

	@Override
	public void resize(int width, int height) {
		 log.debug("resize() width= "+ width + " height= " + height);
	}

	@Override
	public void render() {
		if(renderInterrrupted)
		{
			log.debug("render()");
			renderInterrrupted=false;
		}
	}

	@Override
	public void pause() {
		log.debug("pause()");
		renderInterrrupted = true;
	}

	@Override
	public void resume() {
		log.debug("resume()");
		renderInterrrupted = false;
	}

	@Override
	public void dispose() {
		log.debug("dispose()");

	}
}
