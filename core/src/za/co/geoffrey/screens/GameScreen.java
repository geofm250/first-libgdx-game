package za.co.geoffrey.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import za.co.geoffrey.FirstGame;
import za.co.geoffrey.combat.Monster;
import za.co.geoffrey.combat.Player;
import za.co.geoffrey.sprites.PlayerSprite;

public class GameScreen implements Screen {
    private FirstGame firstGame;

    private Monster monster;
    private PlayerSprite playerSprite;
    private SpriteBatch batch;

    public GameScreen(FirstGame firstGame) {
        this.firstGame = firstGame;
    }

    @Override
    public void show() {
        batch = firstGame.getBatch();
        this.playerSprite = new PlayerSprite(batch);
        this.playerSprite.show();
        this.monster = Monster.builder()
                .name("Wild Boar")
                .attack(50)
                .defense(20)
                .hitPoints(200)
                .build();
    }

    @Override
    public void render(float delta) {
        batch.begin();
        playerSprite.render();
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        playerSprite.dispose();
    }
}
