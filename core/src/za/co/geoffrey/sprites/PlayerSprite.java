package za.co.geoffrey.sprites;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import za.co.geoffrey.combat.Player;


public class PlayerSprite {
    private Player player;
    private BitmapFont font;
    private SpriteBatch batch;

    public PlayerSprite(SpriteBatch batch) {
        this.batch = batch;
        this.player = Player.builder()
                .name("John")
                .attack(50)
                .defense(20)
                .hitPoints(200)
                .build();
    }

    public void show() {
        font = new BitmapFont();
        font.setColor(Color.BLACK);
    }

    public void render() {
        font.draw(batch, this.player.getName(), 200, 200);
    }

    public void dispose() {
        font.dispose();
    }
}
