/*
Merge sort first attempt in 2022
Date - 16 June 22
			mergesort
				/\
			   /  \
			  /	   \
	   divide		 merge
	     /\			  	/\
	left	right
		 
1. base condition
2. calculate midpoint
3. call divide for left division
4. call divide for right division
4. call merge

*/

class MergeSort1 {
static int [] dataAr = new int[]{10,2,11,3,7,5,4,1,9,-7, 19};//l=11
static int [] dummyAr = new int[dataAr.length];

	public static void main(String [] s) {
		dispalyAr(dataAr);
		divide(0, dataAr.length-1);
		dispalyAr(dataAr);
		System.out.println("Done");
	}
	
	public static void dispalyAr(int [] ar) {
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+",");
		}
		System.out.println();
	}
	
	public static void divide(int left, int right) {
		if(left == right)
			return;
		
		int mid = (left + right)/2;//not sure if midpoint is calculated correctly
		divide(left, mid);
		divide(mid+1, right);
		merge(left, mid, right);
	}
	
	public static void merge(int left, int mid, int right) {
		int i = left, j=mid+1, k = 0;
		while(i <= mid && j<=right) {
			if(dataAr[i]<dataAr[j])
			{
				dummyAr[k++] = dataAr[i++];
			}
			else
				dummyAr[k++] = dataAr[j++];
			
		}
		
		while(i<=mid) {
			dummyAr[k++] = dataAr[i++];
		}
		
		while(j<=right) {
			dummyAr[k++] = dataAr[j++];
		}
		
		for(int c=left, d=0;c<=right;c++) {
			dataAr[c] = dummyAr[d++];
		}
	}
}