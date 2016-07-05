package rustvilla;

public class Png2GlBuffer {
	// Store Parameters about the new texture
	public int img_height, img_width;
	public int win_height, win_width;
	// Storage of the 
	public float obj_min_x, obj_min_y;
	// Ratio between the screen width and the image width;
	public float obj_2_screen_rato;
	private float inernal_scalar;
	
	// Asset Identification and Control
	public String img_location;
	public String asset_name;
	public int asset_id;
	
	// Store the vertices for the rectangle here; 
	public float[] vertices = new float[4];
}
