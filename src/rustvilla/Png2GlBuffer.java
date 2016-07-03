package rustvilla;

public class Png2GlBuffer {
	// Store Parameters about the new texture
	public int img_height, img_width;
	public int win_height, win_width;
	// Storage of the 
	public float obj_min_x, obj_min_y;
	// Ratio between the screen width and the image width;
	public float obj_2_screen_rato;
	
	public String img_location;
	public String asset_name;
	public int asset_id;
	
	// Sote the points for the verticies here; 
	public float[] verticies = new float[4];
	
}
