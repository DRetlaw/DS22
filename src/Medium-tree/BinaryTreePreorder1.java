import java.util.Stack;

/*
 * This program is practise for depth–first order (preorder)
 * Preorder traversal involves processing the parent BEFORE processing the children.
 * Children are processed from left to right. This is true for inorder, predorder and postorder traversal.
 * preorder = P-L-R (Parent, Left, Right)
 *
 * note - the iterative solution is different when compared to inorder iterative solution.
 * My solution was based on the iterative solution from inorder. It is working hence not changing it.
 * Needs analysis.
 * 
 * 
 * public static void preorderIterative(Node root)
    {
        // return if the tree is empty
        if (root == null) {
            return;
        }
    
        // create an empty stack and push the root node
        Stack<Node> stack = new Stack<>();
        stack.push(root);
    
        // loop till stack is empty
        while (!stack.empty())
        {
            // pop a node from the stack and print it
            Node curr = stack.pop();
    
            System.out.print(curr.data + " ");
    
            // push the right child of the popped node into the stack
            if (curr.right != null) {
                stack.push(curr.right);
            }
    
            // push the left child of the popped node into the stack
            if (curr.left != null) {
                stack.push(curr.left);
            }
    
            // the right child must be pushed first so that the left child
            // is processed first (LIFO order)
        }
    }
 * questions
 * ==========
*/


public class BinaryTreePreorder1 {
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
        //preOrderRecursively(root);
        preOrderIteratively(root);
        System.out.println("Done");
    }

    public static void preOrderRecursively(BTINode1 node) {
        if(node == null)
            return;

        System.out.print(node.data+" ");
        preOrderRecursively(node.left);
        preOrderRecursively(node.right);

    }

    public static void preOrderIteratively(BTINode1 node) {
        Stack <BTINode1> stack = new Stack<BTINode1>();
        BTINode1 curNode = node;

        while(curNode!=null || !stack.isEmpty())
        {
            if(curNode!=null)
            {
                stack.push(curNode);
                System.out.print(curNode.data +" ");
                curNode = curNode.left;
            }
            else
            {
                curNode = stack.pop();
                curNode = curNode.right;
            }
        }
    }

}
