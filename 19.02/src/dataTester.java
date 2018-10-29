/**
 * Client class for StudentData displays throws and succesful instances
 * 
 * @author Will English
 * @version 05/27/18
 */
public class dataTester {
    public static void main(String args[]) {
        StudentData s1 = new StudentData("Will", "English", new double[] {89.00, 78.00, 95.00, 63.00, 94.00});
        System.out.println(s1);
        StudentData s2 = new StudentData("Elee", "Jackson", new double[] {88.00, 90.00, 100.00, 88.00, 90.00, 100.00});
        System.out.println(s2);
      /*  StudentData s3 = new StudentData("", "English", new double[] {89.00, 78.00, 95.00, 63.00, 94.00});
        System.out.println(s1);
        StudentData s4 = new StudentData("Elee", "", new double[] {88.00, 90.00, 100.00, 88.00, 90.00, 100.00});
        System.out.println(s2);
   */
    }
}