public class DessertMountains extends Mountain
{
	private int cactus;
	public DessertMountains(int l, int w, int numtrees, int cacti){
		super(l,w,numtrees);
		cactus = cacti;
	}
	public String getDessertMountainInfo()
	{
		return "Winter Mountain Land has dimensions "+length+" X "+width+" and has "+numMount+" mountains and there are "+cactus+" cacti";
	}
}
