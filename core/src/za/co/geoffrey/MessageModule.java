package za.co.geoffrey;

import dagger.Module;
import dagger.Provides;

@Module
public class MessageModule {
    @Provides
    public static MessageService provideMessageService() {
        return new MessageServiceImpl();
    }
}
