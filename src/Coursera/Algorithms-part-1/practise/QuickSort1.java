/**
 * char array oar
 * 
 * partition
 * ----------
 * select pivot (first element)
 * set left and right positions
 * increment left till element greater than pivot found
 * decrement right till element smaller than pivot found
 * swap
 * repeat till i and j cross
 * 
 * divide
 * ------
 * base case
 * partition
 * get mid
 * divide(left, mid-1)
 * divide(left, mid+1)
 * 
 */

class QuickSort1 {
    static char oar[] = {'w','a','l','t','e','r','d','s','o','u','z','a'};

    public static void main(String [] s) {
        iterateArray(oar);
        divide(0, oar.length -1);
        iterateArray(oar);
        System.out.println("done");
    }

    static void divide(int l, int r) {
        if(l>=r)
            return;
        
        int m = partition(l,r);
        divide(l, m-1);
        divide(m+1, r);
    }

    static int partition(int l, int r) {
        int m=l;//pivot
        int i=l+1;
        int j=r;

        while(true) {
            while(oar[i++]<oar[m])
                break;

            while(j>1 && oar[j]>oar[m]) {
                j--;
                break;
            }

            if(i>=j)
                break;
            
            swap(i,j);
        }
        //System.out.println("r="+r+"m="+m+" "+"j="+j);
        swap(m,j);
        return j;
    }

    static void swap(int l, int r) {
        char t = oar[l];
        oar[l] = oar[r];
        oar[r] = t;
    }

    static void iterateArray(char [] ar) {
		for(int count=0;count<ar.length;count++) {
			System.out.print(ar[count]+",");
		}
		System.out.println("");
	}
}