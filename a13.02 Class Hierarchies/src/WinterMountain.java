public class WinterMountain extends Mountain
{
	private double temp;
	public WinterMountain(int l, int w, int numtrees, double tempr){
		super(l,w,numtrees);
		temp = tempr;
	}
	public String getWinterMountainInfo()
	{
		return "Winter Mountain Land has dimensions "+length+" X "+width+" and has "+numMount+" mountains and is "+temp+" degrees";
	}
}
