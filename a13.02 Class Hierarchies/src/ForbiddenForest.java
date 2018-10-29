public class ForbiddenForest extends Forest 
{
	private int numTrees, monst;
	public ForbiddenForest(int l, int w, int numtrees, int monsters){
		super(l, w, numtrees);
		monst = monsters;	
		
	}
	public String getForbiddenForestInfo()
	{
		return "Forest Land has dimensions "+length+" X "+width+" and has "+numTrees+" trees and "+monst+" monsters in it";
	}
}
