package za.co.geoffrey;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import dagger.Component;

import javax.inject.Inject;
import javax.inject.Singleton;


public class FirstGame extends ApplicationAdapter {
    SpriteBatch batch;
    Texture img;
    private BitmapFont font;

    private final MessageService messageService;

    @Inject
    public FirstGame(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void create() {
        batch = new SpriteBatch();
        img = new Texture("badlogic.jpg");
        font = new BitmapFont();

    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, 0, 0);
        font.draw(batch, messageService.getMessage(), 500, 200);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }
}
