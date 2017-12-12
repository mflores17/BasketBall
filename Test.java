public class Test
{
	public static void main (String []args)
	{
		BasketballPlayer[] Clips = new BasketballPlayer[5];
	
		Clips[0]= new Center("DeAndre Jordan");
		Clips[1]= new PowerForward("Blake Griffin");
		Clips[2]= new SmallForward("Danilo Gallinari");
		Clips[3]= new PointGuard("Milos Teodosic");
		Clips[4]= new ShootingGuard("Sindarius Thornwell");
		
		  
		for(int i = 0; i < Clips.length; i++)
		{
			Clips[i].shoot();
		}
	}
}