package rustvilla;

public class Png2GlBuffer {
	// Store Parameters about the new texture
	public int img_height, img_width;
	public int win_height, win_width;
	// Storage of the 
	public float obj_min_x, obj_min_y;
	// Ratio between the screen width and the image width;
	private float internal_scalar;
	private float img_scalar;
	
	// Asset Identification and Control
	public String img_location;
	public String asset_name;
	public int asset_id;
	
	// Store the vertices for the rectangle here; 
	public float[] vertices = new float[4];
	
	/**
	 * Will Create a Scalar for the image that when the image
	 * width is multiplier is then becomes the internal scalar value as a percent of the 
	 * total on real estate 
	 */
	public void image_width_scale()
	{
		// (2/Screen Width)/(Scale Percent * Image_width)
		this.img_scalar = ((2/this.win_width)/(this.internal_scalar*this.img_width));
	}
}

/*
	// Implement this sometime
	VBOSupported = gl.isFunctionAvailable("glGenBuffers") &&
	gl.isFunctionAvailable("glBindBuffer") &&
	gl.isFunctionAvailable("glBufferData") &&
	gl.isFunctionAvailable("glDeleteBuffers");
*/