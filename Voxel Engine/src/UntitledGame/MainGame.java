package UntitledGame;

import org.lwjgl.opengl.Display;

import Models.RawModel;
import RenderEngine.DisplayManager;
import RenderEngine.Loader;
import RenderEngine.MasterRenderer;

public class MainGame {

	public static Loader loader1 = null;

	public static void main(String[] args) {

		DisplayManager.createDisplay();

		MasterRenderer rendered = new MasterRenderer();
		Loader loader = new Loader();
		loader1 = loader;

		float[] vertices = {

				-0.5f, 0.5f, 0,
				-0.5f, -0.5f, 0,
				0.5f, -0.5f, 0,
				0.5f, -0.5f, 0,
				0.5f, 0.5f, 0,
				-0.5f, 0.5f, 0
				};

		RawModel model = loader.loadToVao(vertices);

		while(!Display.isCloseRequested()) {

			rendered.prepare();

			DisplayManager.updateDisplay();

		}
		DisplayManager.closeDisplay();

	}

}
