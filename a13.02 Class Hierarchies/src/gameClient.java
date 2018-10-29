/**
 * This class set is used to create different terrains for a theoretical
 * video game. This file is the tester/client class
 * 
 * @author Will English
 * @version 2/28/18
 * 
 */
public class gameClient {
	public static void main(String [] args){
		Terrain ter = new Terrain(20,25);
		Mountain mou = new Mountain(22,28, 3);
		Forest forr = new Forest(25,21, 1221);
		WinterMountain winmou = new WinterMountain(24,25,7, 10.4);
		DessertMountains des = new DessertMountains(29,22,12,200);
		ForbiddenForest forfor = new ForbiddenForest(20,25,2100,200);
		
		System.out.println(ter.getTerrainSize());
		System.out.println(mou.getMountainInfo());
		System.out.println(forr.getForestnInfo());
		System.out.println(winmou.getWinterMountainInfo());
		System.out.println(des.getDessertMountainInfo());
		System.out.println(forfor.getForbiddenForestInfo());
	
	}
}
