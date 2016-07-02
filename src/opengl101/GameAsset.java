package opengl101;

public class GameAsset
{
	private int assetId;
	private int assetH, assetW;
	private int assetXPos, assetYPos;
	
	private boolean initStatus;
	
	// constructor for GameAsset. Requires an numerical Id to be provided
	public GameAsset(int id)
	{
		// set the asset id
		this.assetId = id;
		this.assetH = 0;
		this.assetW =  0;
		this.assetXPos = 0;
		this.assetYPos = 0;
		
		this.initStatus =  false;
	}
	
	// load the asset
	public void init()
	{
		// load the asset
		this.initStatus = true;
	}
	
	// returns the assets width
	public int getW()
	{
		return this.assetW;
	}
	
	// returns the assets height
	public int getH()
	{
		return this.assetH;
	}
	
	// sets the asset's width
	public void setW(int newW)
	{
		this.assetW = newW;
	}
	
	// sets the asset's height
	public void setH(int newH)
	{
		this.assetH = newH;
	}
	
	// returns the assets x position
	public int getX()
	{
		return this.assetXPos;
	}
	
	// returns the assets y position
	public int getY()
	{
		return this.assetYPos;
	}
	
	// returns the asset's Id
	public int getId()
	{
		return this.assetId;
	}
}
