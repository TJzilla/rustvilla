package rustvilla;

import com.jogamp.opengl.GL3;
import com.jogamp.opengl.util.FPSAnimator;
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
	private int win_width = 800;
	private int win_height = 600;
	
	private float r,b,g;
	
	public Game()
	{
		// create a swing window with the title "Minimal OpenGL"
		super("Rustvilla");
		
		// set the OpenGL profile to use
		GLProfile profile = GLProfile.get(GLProfile.GL3);
		GLCapabilities capabilities = new GLCapabilities(profile);
		
		// create a new canvas
		GLCanvas canvas = new GLCanvas(capabilities);
		FPSAnimator animator = new FPSAnimator(canvas, 60);
		animator.start();
		
		// add an event listener
		canvas.addGLEventListener(this);
		
		this.setName("Minimal OpenGL");
		this.getContentPane().add(canvas);
		
		// Prevent Div by Zero
		if (win_height == 0) win_height = 1;
		this.setSize(win_width,win_height);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);
		
		canvas.requestFocusInWindow();
		r = 1;
		b = 1;
		g = 1;
	}

	// initializes an OGL drawable class and sets the background color
	public void init(GLAutoDrawable drawable)
	{
		GL3 gl = drawable.getGL().getGL3();
		gl.glClearColor(0.392f, 0.584f, 0.929f, 1.0f);

	}
	
	public void play()
	{
		for (;;){
			try 
			{
				Thread.sleep(0L);    // one second
			}
			catch (Exception e) {}  
			b = (float) (b - 0.01);
			r = (float) (r - 0.02);
			g = (float) (g - 0.03);
			
			if((r < 0) || (b < 0) || (g < 0))
			{
				b = (float) (1 - 0.00);
				r = (float) (1 - 0.00);
				g = (float) (1 - 0.00);
			}
		}
		
	}
	
	// calls the OGL backend and requests to draw the window contents
	@Override
	public void display(GLAutoDrawable drawable)
	{
		GL3 gl = drawable.getGL().getGL3();
		gl.glClear(GL3.GL_COLOR_BUFFER_BIT | GL3.GL_DEPTH_BUFFER_BIT);	
		gl.glClearColor(r, g, b, 1.0f);
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
		this.win_height = this.getHeight();
		this.win_width = this.getWidth();
		System.out.println("The window width is " + this.win_height);
		System.out.println("The window height is " + this.win_width);
	}
}