


public class clientContact

{
    public static void main(String args[]) 
    
    {
        
    	
    	Contact[] myContacts = { new Contact("Will English", "Me", "Feb 23", "(904) 923-1685", "wenglish101@att.net"),
                new Contact("Ellee Jackson", "Girlfriend", "Dec 8", "(904) 347-0149", "ejackson@gmail.com"),
                new Contact("Luke Sara", "Friend", "Aug 3", "(904) 888-9693", "mrepic2000@gmail.com"),
                new Contact("Trudy English", "Mom", "Aug 30", "(904) 400-5328", "thepp@gmail.com"),
                new Contact("Grace English", "Sister", "Feb 23", "(904) 923-1684", "gdog23@gmail.com"),
                new Contact("Annie English", "Sister", "Sep 30", "(904) 655-3548", "aenglish30@gmail.com") };

        int low = 0;
        int high = myContacts.length - 1;

        System.out.println("Contact list");
        System.out.println();
        printContacts(myContacts);
        System.out.println();
        System.out.println("TEST SEARCHES FOR PRESENT CRITEREA:");
        System.out.println("Find Ellee Jackson");
        findByName(myContacts, "Ellee Jackson", low, high);
        System.out.println();
        System.out.println("Find Girlfriend");
        findByRelation(myContacts, "Girlfriend");
        System.out.println();
        System.out.println("Find (904) 888-9693");
        findByPhone(myContacts, "(904) 888-9693");
        System.out.println();
        System.out.println("Find Feb");
        findByBMonth(myContacts, "Feb");
        System.out.println();
        System.out.println("Find aenglish30@gmail.com");
        findByEmail(myContacts, "aenglish30@gmail.com", low, high);
        System.out.println();
        System.out.println("TEST SEARCHES FOR ABSENT CRITEREA:");
        System.out.println("Find yaboi83@gmail.com");
        findByEmail(myContacts, "yaboi83@gmail.com", low, high);
        System.out.println();
        System.out.println("Find Husband");
        findByRelation(myContacts, "Husband");
        System.out.println();
        System.out.println("Find Jul");
        findByBMonth(myContacts, "Jul");
        System.out.println();
        System.out.println("Find (904) 555-5555");
        findByPhone(myContacts, "(904) 555-5555");
        System.out.println();
        System.out.println("Find Josef Stalin");
        findByName(myContacts, "Josef Stalin", low, high);
    }
    


    public static void printContacts(Contact[] c) {
        System.out.printf("%-13s%15s%10s%19s%24s%n", "Name", "Relation", "Birthday", "Phone", "Email");
        System.out.println("================================================================================");
        for (Contact con : c) {
            System.out.println(con);
        }
    }


    public static void mergeSortName(Contact[] c, int low, int high) 
    {
        if (low == high)
            return;

        int mid = (low + high) / 2;

        mergeSortName(c, low, mid);
        mergeSortName(c, mid + 1, high);

        mergeName(c, low, mid, high);
    }

    public static void mergeName(Contact[] c, int low, int mid, int high) 
    {
        Contact[] temp = new Contact[high - low + 1];
        
        int i = low, j = mid + 1, n = 0;

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[n] = c[j];
                j++;
            }
            else if (j > high) {
                temp[n] = c[i];
                i++;
            }
            else if (c[i].getName().compareTo(c[j].getName()) < 0) {
                temp[n] = c[i];
                i++;
            }
            else {
                temp[n] = c[j];
                j++;
            }
            n++;
        }

        for (int k = low; k <= high; k++)
            c[k] = temp[k - low];
    }


    public static void findByName(Contact[] c, String toFind, int l, int h) {
        mergeSortName(c, l, h);
        int high = c.length;
        int low = -1;
        int probe;
        int index;

        while (high - low > 1) {
            probe = (high + low) / 2;
            if (c[probe].getName().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        if ((low >= 0) && (c[low].getName().compareTo(toFind) == 0))
            index = low;
        else
            index = -1;
        if (index == -1)
            System.out.println("Not Found.");
        else
            System.out.println("Found: " + c[index]);
    }

    public static void findByRelation(Contact[] c, String toFind) {
        int found = 0;
        for (int i = 0; i < c.length; i++)
            if (c[i].getRelation().compareTo(toFind) == 0) {
                found++;
                System.out.println(c[i]);
            }
        if (found == 0)
            System.out.println("There are no listings for " + toFind);
        else
            System.out.println("There were " + found + " listings for " + toFind);
    }

    public static void findByPhone(Contact[] c, String toFind) {
        int found = 0;
        for (int i = 0; i < c.length; i++)
            if (c[i].getPhone().compareTo(toFind) == 0) {
                found++;
                System.out.println(c[i]);
            }
        if (found == 0)
            System.out.println("There are no listings for " + toFind);
        else
            System.out.println("There were " + found + " listings for " + toFind);
    }

    public static void findByBMonth(Contact[] c, String toFind) {
        int found = 0;
        for (int i = 0; i < c.length; i++)
            if (c[i].getBday().substring(0, 3).compareTo(toFind) == 0) {
                found++;
                System.out.println(c[i]);
            }
        if (found == 0)
            System.out.println("There are no listings for " + toFind);
        else
            System.out.println("There were " + found + " listings for " + toFind);
    }
 
    public static void mergeSortEmail(Contact[] c, int low, int high) {
        if (low == high)
            return;

        int mid = (low + high) / 2;

        mergeSortEmail(c, low, mid);
        mergeSortEmail(c, mid + 1, high);

        mergeEmail(c, low, mid, high);
    }

    public static void mergeEmail(Contact[] c, int low, int mid, int high) {
        Contact[] temp = new Contact[high - low + 1];

        int i = low, j = mid + 1, n = 0;

        while (i <= mid || j <= high) 
        {
            if (i > mid)
            {
                temp[n] = c[j];
                j++;
            }
            else if (j > high) 
            {
                temp[n] = c[i];
                i++;
            }
            else if (c[i].getEmail().compareTo(c[j].getEmail()) < 0) 
            {
                temp[n] = c[i];
                i++;
            }
            else {
                temp[n] = c[j];
                j++;
            }
            n++;
        }

        for (int k = low; k <= high; k++)
            c[k] = temp[k - low];
    }

    public static void findByEmail(Contact[] c, String toFind, int l, int h)
    {
        mergeSortName(c, l, h);
        int high = c.length;
        int low = -1;
        int probe;
        int index;

        while (high - low > 1) {
            probe = (high + low) / 2;
            if (c[probe].getEmail().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        if ((low >= 0) && (c[low].getEmail().compareTo(toFind) == 0))
            index = low;
        else
            index = -1;
        if (index == -1)
            System.out.println("Not Found.");
        else
            System.out.println("Found: " + c[index]);
    }
}