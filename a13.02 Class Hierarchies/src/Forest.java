public class Forest extends Terrain 
{
	private int numTrees;
	public Forest(int l, int w, int numtrees){
		super(l, w);
		numTrees = numtrees;	
		
	}
	public String getForestnInfo()
	{
		return "Forest Land has dimensions "+length+" X "+width+" and has "+numTrees+" trees";
	}
}
