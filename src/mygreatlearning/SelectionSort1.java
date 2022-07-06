/**
 * Selection sort
 * 
 */
public class SelectionSort1 {
    static int uor[] = {1,0,0,7,1,9,7,9};
    public static void main(String s[]){
        display();
        sort();
        display();
        System.out.println("done");
    }

    static void sort(){
        for(int i=0;i<uor.length-1;i++){
            int t = i;
            for(int j=i;j<uor.length-1;j++){
                if(uor[t]>uor[j])
                    t = j;
            }
            int x = uor[t];
            uor[t] = uor[i];
            uor[i] = x;

        }
    }

    static void display(){
        for(int count=0;count<uor.length;count++)
        {
            System.out.print(uor[count]+",");
        }
        System.out.println();
    }
    
}
