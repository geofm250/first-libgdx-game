package za.co.geoffrey;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import dagger.Module;
import dagger.Provides;

@Module
public class GdxModule {
    @Provides
    public SpriteBatch provideSpriteBatch() {
        return new SpriteBatch();
    }
}
