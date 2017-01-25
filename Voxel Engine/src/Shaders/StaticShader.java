package Shaders;

public class StaticShader extends ShaderProgram {

	
	private static final String vertexFile = "/shaders/vertexShader.txt";
	private static final String fragmentFile = "/shaders/fragmentShader.txt";
	public StaticShader() {
		super(vertexFile, fragmentFile);
		
	}

	@Override
	protected void bindAttributes() {
		super.bindAttribute("position", 0);
		
	}

	
	
	
}
