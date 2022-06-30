import java.util.Hashtable;

public class HashTable1 {
    public static void main(String s[]) {
        Hashtable<Integer, String> htab1 = new Hashtable<Integer, String>();
        Hashtable<Integer, String> htab2 = new Hashtable<Integer, String>();

        htab1.put(1, "this");
        htab1.put(1, "that");
        htab1.put(2, "that");

        System.out.println(htab1);
        System.out.println("done");
    }
}
