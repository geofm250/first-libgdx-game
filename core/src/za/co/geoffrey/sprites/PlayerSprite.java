package za.co.geoffrey.sprites;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import za.co.geoffrey.combat.Player;

import java.util.EnumMap;


public class PlayerSprite  {
    private Player player;
    private BitmapFont font;
    private SpriteBatch batch;
    private TextureAtlas playerAtlas;
    private EnumMap<PlayerAtlasRegion, Sprite> avatarTextures;
    private Sprite selectedAvatarTexture;

    public PlayerSprite(SpriteBatch batch, TextureAtlas playerAtlas) {
//        super();
        this.batch = batch;
        this.playerAtlas = playerAtlas;
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
        avatarTextures = new EnumMap<>(PlayerAtlasRegion.class);
        for (PlayerAtlasRegion key:PlayerAtlasRegion.values()) {
            avatarTextures.put(key,playerAtlas.createSprite(key.getName()));
        }
        selectedAvatarTexture = avatarTextures.get(PlayerAtlasRegion.FORWARD_BOTH);

    }

    public void render() {
        font.draw(batch, this.player.getName(), 200, 200);
        selectedAvatarTexture.setPosition(200,100);
        selectedAvatarTexture.draw(batch);
    }

    public void dispose() {
        font.dispose();
    }
}
