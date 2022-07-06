/*
 * Queue is an interface. Linkedlist is one of the class that implements Queue.
 */

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBFS1 {

    public static void main(String s[]){
        /* Construct the following tree
                   1
                 /   \
                /     \
               2       3
              /      /   \
             /      /     \
            4      5       6
                  / \
                 /   \
                7     8
        */
 
        BTINode1 root = new BTINode1(1);
        root.left = new BTINode1(2);
        root.right = new BTINode1(3);
        root.left.left = new BTINode1(4);
        root.right.left = new BTINode1(5);
        root.right.right = new BTINode1(6);
        root.right.left.left = new BTINode1(7);
        root.right.left.right = new BTINode1(8);
        //postOrderRecursively(root);
        postOrderIteratively(root);
        System.out.println("Done");
    }

    public static void postOrderIteratively(BTINode1 node){
        BTINode1 curNode = node;
        Queue <BTINode1> que = new LinkedList<BTINode1>();
        que.add(curNode);

        while(!que.isEmpty()){
            curNode = que.remove();
            if(curNode.left!= null)
                que.add(curNode.left);

            if(curNode.right!= null)
                que.add(curNode.right);

            System.out.print(curNode.data+" ");

        }
    }
    
}
