import java.util.Stack;

/*
 * depth–first order (preorder, inorder, and postorder) or breadth–first order (level order traversal)
 * Inorder traversal involves processing the left child, then the parent and finally the right.
 * Children are processed from left to right. This is true for inorder, predorder and postorder traversal.
 * inorder = LPR (Left, Parent, Right)
 * 
 * questions
 * ==========
 * 1. Inorder traversing should give sorted nodes!!
 * A. Inorder traversing gives sorted nodes only when the given binary tree is a BST.
 * 
 * 2. 
 */

class BTINode1 {
int data;
BTINode1 left, right;

    BTINode1(int data) {
        this.data = data;
    }
}

public class BinaryTreeInorder1 {
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
        //inOrderRecursively(root);
        inOrderIteratively(root);
        System.out.println("Done");
    }

    public static void inOrderRecursively(BTINode1 node) {
        if(node == null) {
            return;
        }
        
        inOrderRecursively(node.left);
        System.out.print(node.data+" ");
        inOrderRecursively(node.right);
    }


    public static void inOrderIteratively(BTINode1 node) {
        Stack <BTINode1> stack = new Stack<BTINode1>();
        BTINode1 curNode =  node;

        while(curNode!=null || !stack.isEmpty()) {
            if(curNode!=null)
            {
                stack.push(curNode);
                curNode = curNode.left;
            }
            else
            {
                curNode = stack.pop();
                System.out.print(curNode.data+" ");
                curNode = curNode.right;
            }
        }

         
    }


    
}
