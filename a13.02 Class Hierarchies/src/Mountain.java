public class Mountain extends Terrain
{
	
	protected int numMount;
	public Mountain(int l, int w, int nummount)
	{
		super(l, w);
		numMount = nummount;
	}
	public String getMountainInfo()
	{
		return "Mountain Land has dimensions "+length+" X "+width+" and has "+numMount+" mountains";
	}
}
