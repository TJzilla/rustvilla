package opengl101;

public class GameObject
{
	private GameAsset asset;
	private int id;
	private String name;
	private ObjectType type;
	
	public GameObject(int objId, ObjectType objType)
	{
		this.asset=null;
		this.name=null;
		this.id=objId;
		this.type=objType;
	}
	
	// set a new game asset for the object
	public void setAsset(GameAsset newAsset)
	{
		this.asset=newAsset;
	}
	
	// determine if this GameObject has a GameAsset
	public boolean hasAsset()
	{
		if(!(this.asset == null))
		{
			return true;
		}
		return false;
	}
	
	// return this GameObject's Id
	public int getId()
	{
		return this.id;
	}
	
	// return this GameObject's name
	public String getName()
	{
		return this.name;
	}
	
	// set the name
	public void setName(String newName)
	{
		this.name=newName;
	}
	
	// determine if this GameObject has a name
	public boolean hasName()
	{
		if(!(this.name == null))
		{
			return true;
		}
		return false;
	}
	
	// sets this GameObjects ObjectType
	public void setType(ObjectType newType)
	{
		if(!(newType == null))
		{
			this.type=newType;
		}
	}
	
	// returns this GameObjects ObjectType
	public ObjectType getType()
	{
		return this.type;
	}
}
