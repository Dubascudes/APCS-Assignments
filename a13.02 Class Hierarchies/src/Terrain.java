public class Terrain
{
    // instance variables
    protected int length, width;

    // Constructor for objects of class Terrain
    public Terrain(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

	public String getTerrainSize()
    {
        return "Land has dimensions " + length + " X " + width;
    }
}