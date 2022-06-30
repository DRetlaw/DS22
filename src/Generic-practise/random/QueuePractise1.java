/*
isEmpty
in
out


*/
class QueuePractise1 {
static int data[] = new int[5];
static int pointer = -1;
	public static void main(String [] a) {
		iterate();
		out();
		in(10);
		iterate();
		in(20);
		in(30);
		in(40);
		in(50);
		in(60);
		iterate();
		out();
		iterate();
		out();
		out();
		iterate();
		out();
		out();
		out();
		iterate();
		System.out.println("done");
	}
	
	static boolean isEmpty(){
		if(pointer == -1)
			return true;
		return false;
	}
	
	static void out(){
		if(!isEmpty())
		{
			System.out.println(data[0]);
			for(int count=0;count<pointer;count++){
				data[count] = data[count+1];
			}
			pointer--;
			return;
		}
		System.out.println("Queue is empty");
	}
	
	static void in(int val){
		if(pointer<data.length-1)
		{
			
			pointer++;
			data[pointer] = val;
			System.out.println(data[pointer]);
			return;
		}
		System.out.println("Queue is full");
	}
	
	static void iterate(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return;
		}
		for(int count=0;count<=pointer;count++){
			System.out.print(data[count]+",");
		}
		System.out.println();
	}
	
	
}