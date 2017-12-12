public class Center implements BasketballPlayer
{
	private String name;
	
	public Center(String name)
	{
		this.name = name;
	}
	
	public void shoot()
	{
		System.out.println("Center named " + name + " Hooks");
	}

	public void setName(String name)
	{
		this.name = name;
	}
}