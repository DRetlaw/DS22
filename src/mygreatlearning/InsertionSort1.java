public class InsertionSort1 {
    static int uor[] = {1,0,0,7,1,9,7,9};
    public static void main(String [] s){
        display();
        sort();
        display();
        System.out.println("done");
    }

    static void sort(){
        for(int i=1;i<uor.length;i++)//1,2,3,4,5,6,7
        {
            int holdValue = uor[i];//0,0,7,1,9,7,9
            int j;//0,1,2,3,4,5,6
            for(j=i;j>0;)
            {
                if(holdValue<uor[j-1]) {
                    uor[j] = uor[j-1];
                    j--;
                }
                else
                    break;
            }
            uor[j] = holdValue;
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
