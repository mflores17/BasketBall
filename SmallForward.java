public class SmallForward implements BasketballPlayer
{
	private String name;
	
	public SmallForward(String name)
	{
		this.name = name;
	}
	
	public void shoot() 
	{
		System.out.println("Small Forward named " + name + " Glide");
	}

	public void setName(String name)
	{
		this.name = name;
	}
}