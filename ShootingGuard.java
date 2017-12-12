public class ShootingGuard implements BasketballPlayer
{
	private String name;
	
	public ShootingGuard(String name)
	{
		this.name = name;
	}
	
	public void shoot() 
	{
		System.out.println("Shooting Guard named " + name + " 3 Point");
	}

	public void setName(String name)
	{
		this.name = name;
	}
}