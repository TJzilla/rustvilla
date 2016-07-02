package opengl101;

import com.jogamp.opengl.GL3;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import javax.swing.JFrame;

public class Game extends JFrame implements GLEventListener
{
	private static final long serialVersionUID = 1L;
	// define height and width of our window
	final private int width = 800;
	final private int height = 600;
	
	public Game()
	{
		// create a swing window with the title "Minimal OpenGL"
		super("Minimal OpenGL");
		// set the OpenGL profile to use
		GLProfile profile = GLProfile.get(GLProfile.GL3);
		GLCapabilities capabilities = new GLCapabilities(profile);
		
		// create a new canvas
		GLCanvas canvas = new GLCanvas(capabilities);
		// add an event listener
		canvas.addGLEventListener(this);
		
		this.setName("Minimal OpenGL");
		this.getContentPane().add(canvas);
		
		this.setSize(width,height);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		
		canvas.requestFocusInWindow();
	}
	
	public void init(GLAutoDrawable drawable)
	{
		GL3 gl = drawable.getGL().getGL3();
		gl.glClearColor(0.392f, 0.584f, 0.929f, 1.0f);
	}
	
	public void play()
	{	
	}
	
	@Override
	public void display(GLAutoDrawable drawable)
	{
		GL3 gl = drawable.getGL().getGL3();
		gl.glClear(GL3.GL_COLOR_BUFFER_BIT | GL3.GL_DEPTH_BUFFER_BIT);
		// call draw code here
		gl.glFlush();
	}
	
	@Override
	public void dispose(GLAutoDrawable drawable)
	{
	}
	
	@Override
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height)
	{	
	}
}