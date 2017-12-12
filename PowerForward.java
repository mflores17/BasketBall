public class PowerForward implements BasketballPlayer
{
	private String name;
	
	public PowerForward(String name)
	{
		this.name = name;
	}
	
	public void shoot() 
	{
		System.out.println("Power Forward named " + name + " Dunks");
	}

	public void setName(String name)
	{
		this.name = name;
	}
}