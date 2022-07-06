/**
 * bubble sort
 */
public class BubbleSort1 {

    static int uor[] = {1,0,0,7,1,9,7,9};
    public static void main(String s[]){
        display(uor);
        sort(uor);
        display(uor);
        System.out.println("done");
    }

    static void display(int [] ar){
        for(int count=0;count<ar.length;count++)
        {
            System.out.print(ar[count]+",");
        }
        System.out.println();
    }

    static void sort(int ar[]){
        for(int i=0;i<ar.length-1;i++){
            for(int j=0;j<ar.length-1-i;j++){
                if(ar[j]>ar[j+1]){
                    int t = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = t;
                }
            }
        }
    }
    
}
