import java.util.HashSet;

class HashSet1 {
    static boolean isInputUnique(String s){
        HashSet set = new HashSet<>();
        for(int count=0;count<s.length();count++){
            char c = s.charAt(count);
            System.out.println("c-"+c);
            boolean b = set.add(c);
            //System.out.println("b-"+b);
            if(b==false)
                return false;

        }
        return true;
    }

    public static void main(String [] s) {
        String input = "practisee";
        System.out.println(isInputUnique(input));
        System.out.println("done");
    }
}