package za.co.geoffrey;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import za.co.geoffrey.screens.GameScreen;

import javax.inject.Inject;


public class FirstGame extends Game {

    private final MessageService messageService;

    private SpriteBatch spriteBatch;

    @Inject
    public FirstGame(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void create() {
        spriteBatch = new SpriteBatch();
        setScreen(new GameScreen(this));
    }


    @Override
    public void render() {
        clearScreen();
        super.render();
    }

    private void clearScreen() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void dispose() {
        super.dispose();
        spriteBatch.dispose();
    }

    public SpriteBatch getBatch() {
        return spriteBatch;
    }


//    private void drawMonster() {
//        font.draw(batch, this.monster.getName(), 200, 500);
//    }



}
