package za.co.geoffrey;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import za.co.geoffrey.screens.MainGameScreen;

import javax.inject.Inject;


public class FirstGame extends Game {

    private final MessageService messageService;
    private final MainGameScreen _mainGameScreen;

    private SpriteBatch spriteBatch;

    @Inject
    public FirstGame(MessageService messageService, MainGameScreen mainGameScreen) {
        this.messageService = messageService;
        this._mainGameScreen = mainGameScreen;
    }

    @Override
    public void create() {
        setScreen(_mainGameScreen);
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
        _mainGameScreen.dispose();
    }

    public SpriteBatch getBatch() {
        return spriteBatch;
    }
}
