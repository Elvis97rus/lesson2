package ru.geekbrains;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class StarGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img,img2;
	TextureRegion region;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		//img2 = new Texture("badlogic1.jpg");
		region = new TextureRegion(img,4, 20, 900, 900);


		Vector2 v1 = new Vector2(2,3);
		Vector2 v2 = new Vector2(0,-1);
		v1.add(v2);
		System.out.println("v1.x = "+ v1.x + "v1.y = " +v1.y);

		v1.set(3,2);
		v2.set(1,1);
		Vector2 v3 = v1.cpy().sub(v2);
		v1.sub(v2);

		System.out.println("v3.x = "+ v3.x + "v3.y = " +v3.y);
		System.out.println("v1.x = "+ v1.x + "v1.y = " +v1.y);

		v1.set(43,51);
		v1.scl(0.9f);

		System.out.println("v1.x = "+ v1.x + "v1.y = " +v1.y);
		System.out.println("v1.len = "+ v1.len());

		v1.nor();
		System.out.println("v1.len = "+ v1.len());



	}

	public void moveImg() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0.128f, 0.53f, 0.9f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.setColor(1, 1, 1, 1);
		batch.draw(img, 100, 100);
		batch.setColor(0, 1, 0, 1);
		batch.draw(region, 0,0);
		batch.end();

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
