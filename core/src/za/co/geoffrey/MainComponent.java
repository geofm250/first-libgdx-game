package za.co.geoffrey;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = MessageModule.class)
public interface MainComponent {
    FirstGame game();
}
