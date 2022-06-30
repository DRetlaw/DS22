/**
 * add node at start
 * add node at end
 * add node at pos
 * delete node at start
 * delete node at end
 * delete node at pos
 * display size
 * reverse
 * display
 */

class LLNode1 {
    int data;
    LLNode1 next;

    LLNode1(int d){
        this.data = d;
    }
}

class LLImpl1 {
    private LLNode1 head;

    public void insertAtStart(int data){
        if(head == null)
        {
            head = new LLNode1(data);
            return;
        }

        LLNode1 temp = new LLNode1(data);
        temp.next = head;
        head = temp;
    }

    public void insertAtEnd(int data){
        if(head == null)
        {
            head = new LLNode1(data);
            return;
        }

        LLNode1 newNode = new LLNode1(data);
        LLNode1 temp = head;

        while(temp.next!=null)
        {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    
}

public class LinkedList1 {

    public static void main(String [] s) {
        System.out.println("done");
    }
    
}
