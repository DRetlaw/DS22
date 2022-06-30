/*
isEmpty
push
pop


*/
class StackPractise1 {
static int data[] = new int[5];
static int pointer = -1;
	public static void main(String [] a) {
		iterate();
		pop();
		push(10);
		iterate();
		push(20);
		push(30);
		push(40);
		push(50);
		push(60);
		iterate();
		pop();
		iterate();
		pop();
		pop();
		iterate();
		pop();
		pop();
		pop();
		iterate();
		System.out.println("done");
	}
	
	static boolean isEmpty(){
		if(pointer == -1)
			return true;
		return false;
	}
	
	static void pop(){
		if(!isEmpty())
		{
			System.out.println(data[pointer]);
			pointer--;
			return;
		}
		System.out.println("Stack is empty");
	}
	
	static void push(int val){
		if(pointer<data.length-1)
		{
			
			pointer++;
			data[pointer] = val;
			System.out.println(data[pointer]);
			return;
		}
		System.out.println("Stack is full");
	}
	
	static void iterate(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return;
		}
		for(int count=0;count<=pointer;count++){
			System.out.print(data[count]+",");
		}
		System.out.println();
	}
	
	
}