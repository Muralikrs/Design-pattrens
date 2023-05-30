package Factory_Design;

public class Factory {

	public Metal chose(String name)
	{
		if(name.equalsIgnoreCase("iron"))
			return new Iron();
		if(name.equalsIgnoreCase("zinc"))
			return new Zinc();
		return null;
	}
}
