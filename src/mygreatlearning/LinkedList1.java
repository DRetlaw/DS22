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

    /*position start from 1 and not 0 */
    public void insertAtPos(int data, int pos){
        if(pos == 1) {
            insertAtStart(data);
            return;
        } 

        LLNode1 current = head;
        LLNode1 next = head.next;

        for(int count=2;count<pos;count++){
            current = next;
            next = current.next;
        }

        LLNode1 newNode = new LLNode1(data);
        current.next = newNode;
        newNode.next = next;
    }

    public void displayList(){
        LLNode1 temp = head;
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }

        while(temp != null)
        {
            System.out.print(temp.data+",");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getSize(){
        LLNode1 temp = head;
        if(head == null)
        {
            System.out.println("Size = 0");
            return;
        }

        int count = 1;
        while(temp.next != null)
        {
            count++;
            temp = temp.next;
        }
        System.out.println("Size = "+count);
    }

    public void reverseList(){
        if(head == null || head.next == null)
            return;
        
        reverseList(null,head);
    }

    private void reverseList(LLNode1 pNode, LLNode1 cNode){
        if(cNode.next == null)
        {
            head = cNode;
            cNode.next = pNode;
            return;
        }

        reverseList(cNode,cNode.next);
        cNode.next = pNode;

    }
}

public class LinkedList1 {

    public static void main(String [] s) {
        LLImpl1 ll = new LLImpl1();
        ll.getSize();
        ll.insertAtEnd(10);
        ll.displayList();
        ll.getSize();
        ll.insertAtEnd(30);
        ll.displayList();
        ll.getSize();
        ll.insertAtEnd(80);
        ll.insertAtStart(300);
        ll.insertAtStart(200);
        ll.insertAtPos(500,3);
        ll.displayList();
        ll.getSize();
        ll.reverseList();
        ll.displayList();
        System.out.println("done");
    }
    
}
