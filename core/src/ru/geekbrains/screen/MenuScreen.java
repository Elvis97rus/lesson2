package ru.geekbrains.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.base.Base2DScreen;


public class MenuScreen extends Base2DScreen {
   private SpriteBatch batch;
   private Texture img,img2;

   private Vector2 pos,posSpace;
   private Vector2 v;


    @Override
    public void show() {
        super.show();
        batch = new SpriteBatch();
        img = new Texture("badlogic.jpg");
        img2 = new Texture("space.png");
        pos = new Vector2(0,0);
        posSpace = new Vector2(0,0);
        v = new Vector2(-0.2f,0);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        Gdx.gl.glClearColor(0.128f, 0.53f, 0.9f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.setColor(1, 1, 1, 1);
        batch.draw(img, pos.x, pos.y);
        batch.draw(img2, posSpace.x, posSpace.y);
        batch.end();

        pos.add(v);

    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        System.out.println("touchDown screenX = " + screenX + " screenY = " + screenY);

        return false;
    }
    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        System.out.println("touchDragged screenX = " + screenX + " screenY = " + screenY);
        posSpace.x = (Gdx.graphics.getWidth() - screenX);
        posSpace.y = ( Gdx.graphics.getHeight() - screenY);
        return false;
    }

    @Override
    public void resize(int width, int height) {
        super.resize();
    }

    @Override
    public void pause() {
        super.pause();    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public void hide() {
        super.hide();
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
        super.dispose();

    }
}
