public class PointGuard implements BasketballPlayer
{
	private String name;
	
	public PointGuard(String name)
	{
		this.name = name;
	}
	
	public void shoot() 
	{
		System.out.println("Point Guard named " + name + " Pass");
	}

	public void setName(String name)
	{
		this.name = name;
	}
}