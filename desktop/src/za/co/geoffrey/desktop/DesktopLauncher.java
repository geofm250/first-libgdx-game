package za.co.geoffrey.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import za.co.geoffrey.DaggerMainComponent;
import za.co.geoffrey.MainComponent;
import za.co.geoffrey.utils.Constants;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height = Constants.HEIGHT;
		config.width = Constants.WIDTH;
		config.title = Constants.TITLE;
		final MainComponent mainComponent = DaggerMainComponent.builder().build();
		new LwjglApplication(mainComponent.game(), config);
	}
}
