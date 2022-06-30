import java.util.HashMap;
import java.util.Iterator;

public class HashMap1 {
    public static void main(String s[]) {
        String input = "walterdsouza";
        countCharacters(input);
        System.out.println("Done");
    }
    
    static void countCharacters(String input){
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        for(int count = 0;count<input.length();count++){
            char c = input.charAt(count);
            if(hmap.containsKey(c))
            {
                hmap.put(c, hmap.get(c)+1);
            }
            else
            {
                hmap.put(c, 1);
            }
        }

        Iterator<Character> itr = hmap.keySet().iterator();
        while(itr.hasNext())
        {
            Object ob = itr.next();
            System.out.println(ob+" : "+hmap.get(ob));
        }
    }

}
