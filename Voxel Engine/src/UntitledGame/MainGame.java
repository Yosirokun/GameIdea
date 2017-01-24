package UntitledGame;

import org.lwjgl.opengl.Display;

import RenderEngine.DisplayManager;
import RenderEngine.MasterRenderer;

public class MainGame {

	public static void main(String[] args) {

		DisplayManager.createDisplay();

		MasterRenderer rendered = new MasterRenderer();

		while(!Display.isCloseRequested()) {

			rendered.prepare();

			DisplayManager.updateDisplay();

		}
		DisplayManager.closeDisplay();

	}

}
