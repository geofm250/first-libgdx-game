package za.co.geoffrey.screens;

import dagger.Module;
import dagger.Provides;

@Module
public class ScreensModule {
    @Provides
    public static MainGameScreen provideMainGameScreen() {
        return new MainGameScreen();
    }
}
