import java.util.Scanner;

/**
 * purpose: test music class and employ binary search
 * 
 * @author Will English
 * @version 4/24/18 
 */



public class musicTesterV3 {

	public static void print(Music[] songs)
	{
		for(Music x : songs)
		{
			System.out.println(x);
		}
	}
	
	//sort the titles with selection sort
	public static Music[] sortTitles(Music[] songs, int x)
	{
		Music[] result = new Music[songs.length];
		if(x==1)
		{
			for(int y = 0; y < songs.length; y++)
			{
				Music next = songs[y];
				int z = y;
				int insert = 0;
				while(z > 0 && insert == 0)
				{
					if (next.getTitle().compareTo(result[z - 1].getTitle()) > 0) {
                    insert = z;
                }
                else {
                	result[z] = result[z - 1];
                }
                z--;
            }
			result[insert] = next;
					
				}
			return result;
			}
		else 
		{
			{
				for(int y = 0; y < songs.length; y++)
				{
					Music next = songs[y];
					int z = y;
					int insert = 0;
					while(z > 0 && insert == 0)
					{
						if (next.getTitle().compareTo(result[z - 1].getTitle()) < 0) {
	                    insert = z;
	                }
	                else {
	                	result[z] = result[z - 1];
	                }
	                z--;
	            }
				result[insert] = next;
						
					}
				}
			return result;
		}
	}
	
	//sort the artist with selection sort
	public static Music[] sortArtist(Music[] songs, int x)
	{
		Music[] result = new Music[songs.length];
		if(x==1)
		{
			for(int y = 0; y < songs.length; y++)
			{
				Music next = songs[y];
				int z = y;
				int insert = 0;
				while(z > 0 && insert == 0)
				{
					if (next.getArtist().compareTo(result[z - 1].getArtist()) > 0) {
                    insert = z;
                }
                else {
                	result[z] = result[z - 1];
                }
                z--;
            }
			result[insert] = next;
					
				}
			return result;
			}
		else 
		{
			{
				for(int y = 0; y < songs.length; y++)
				{
					Music next = songs[y];
					int z = y;
					int insert = 0;
					while(z > 0 && insert == 0)
					{
						if (next.getArtist().compareTo(result[z - 1].getArtist()) < 0) {
	                    insert = z;
	                }
	                else {
	                	result[z] = result[z - 1];
	                }
	                z--;
	            }
				result[insert] = next;
						
					}
				}
			return result;
		}
	}
	
	//sort the dates with selection sort
	public static Music[] sortDates(Music[] songs, int x)
	{
		Music[] result = new Music[songs.length];
		if(x==1)
		{
			for(int y = 0; y < songs.length; y++)
			{
				Music next = songs[y];
				int z = y;
				int insert = 0;
				while(z > 0 && insert == 0)
				{
					if (next.getYear() > result[z - 1].getYear()) {
                    insert = z;
                }
                else {
                	result[z] = result[z - 1];
                }
                z--;
            }
			result[insert] = next;
					
				}
			return result;
			}
		else 
		{
			{
				for(int y = 0; y < songs.length; y++)
				{
					Music next = songs[y];
					int z = y;
					int insert = 0;
					while(z > 0 && insert == 0)
					{
						if (next.getYear() < result[z - 1].getYear()) {
	                    insert = z;
	                }
	                else {
	                	result[z] = result[z - 1];
	                }
	                z--;
	            }
				result[insert] = next;
						
					}
				}
			return result;
		}
	}
	
	   
    public static int searchTitle(Music[] songs, String title) {
        int high = songs.length - 1;
        int low = 0;
        int mid;

        while (low <= high) {
        	mid = low + (high - low) / 2;
            if (songs[mid].getTitle().compareTo(title) > 0)
                high = mid -1;
            else if (songs[mid].getTitle().compareTo(title) < 0)
            	low = mid +1;
            else if (songs[mid].getTitle().compareTo(title)==0) return mid;
        }
        return -1;
    }

   

    public static int searchYear(Music[] songs, int date) {
        int high = songs.length - 1;
        int low = 0;
        int mid;

        while (low <= high) {
        	mid = low + (high - low) / 2;
            if (songs[mid].getYear()>date)
                high = mid -1;
            if (songs[mid].getYear()<date)
            	low = mid +1;
            else return mid;
        }
        return -1;
    }
    
    public static int searchArtist(Music[] songs, String artist) {
        int high = songs.length - 1;
        int low = 0;
        int mid;

        while (low <= high) {
        	mid = low + (high - low) / 2;
            if (songs[mid].getArtist().compareTo(artist) > 0)
                high = mid -1;
            else if (songs[mid].getArtist().compareTo(artist) < 0)
            	low = mid +1;
            else if (songs[mid].getArtist().compareTo(artist)==0) return mid;
        }
        return -1;
    }

	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		Music [] songs = 
			{
				new Music("Migraine", 2013, "Twenty One Pilots"),
				new Music("Piano Man", 1973, "Billy Joel"),
				new Music("Her", 2017, "eery"),
				new Music("Simple Man", 1973, "Lynrd Skynrd"),
				new Music("Bohemian Rhapsody", 1975, "Queen"),
				new Music("Stairway to Heaven", 1971, "Led Zeppelin"),
				new Music("Hotel California", 1976, "Eagles"),
				new Music("Twist and Shout", 1963, "The Beatles"),
				new Music("Blackbird", 1968, "The Beatles"),
				new Music("How Far We've Come", 2007, "Matchbox 20"),
			};
		String song="";
		String artist="";
		int year=0;
		int index = 0;
		print(songs);
		while(true){
		System.out.println("What category would you like to search?");
		String ar = in.nextLine();
		switch(ar.toLowerCase())
		{
		case "name":
				System.out.println("What song are you searching for?");
			    song = in.nextLine();
			    print(sortTitles(songs,1));
				System.out.println();
				index = searchTitle(sortTitles(songs,1),song);
				if(index>=0)System.out.println((sortTitles(songs,1)[index]));
				else System.out.println("Not found "+index);
				break;
		case "artist":
			System.out.println("What artist are you searching for?");
			artist = in.nextLine();
		    print(sortArtist(songs,1));
			System.out.println();
			index = searchArtist(sortArtist(songs,1),artist);
			if(index>=0)System.out.println(sortArtist(songs,1)[index]);
			else System.out.println("Not found"+index);
			break;	
		case "year":
			System.out.println("What release year are you searching for?");
			year = in.nextInt();
			print(sortDates(songs,-1));
			System.out.println();
			index = searchYear(sortDates(songs,1),year);
			if(index>=0)System.out.print(sortDates(songs,1)[index]);
			else System.out.println("Not found "+index);
			break;
	    default:
			System.out.println("invalid input");
			}
		}
	}
}
