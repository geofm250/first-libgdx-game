package za.co.geoffrey;

import dagger.Component;
import za.co.geoffrey.screens.ScreensModule;

import javax.inject.Singleton;

@Singleton
@Component(modules = {MessageModule.class, ScreensModule.class})
public interface MainComponent {
    FirstGame game();
}
