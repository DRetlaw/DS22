/*
Note: Array should be sorted
 */

 class BinarySearch1 {
     static int ar [] = {-1,7,13,17,19,21,29,43,50,63,81,103};
     public static void main(String s[]) {
         bs(0, ar.length-1, 18);
         System.out.println("done");
     }

     static void bs(int start, int end, int val) {
        int mid = (start + end)/2;
        System.out.println("start = " + start);
        System.out.println("end = " + end);
        System.out.println("mid = " + mid);
        if(ar[mid] == val || start == end)
        {
            System.out.println("Found!");
            return;
        } else if(ar[mid] < val) {
                        System.out.println("Going right!");
                        bs(mid+1, end, val);
                        
                    } else if(ar[mid] > val) {
                                System.out.println("Going left!");
                                bs(0, mid-1, val);
                            }
     }
 }