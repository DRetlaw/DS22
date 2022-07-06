import java.util.Stack;

/**
 * Post order traversal involves processing the children BEFORE processing the parent.
 * Children are processed from left to right. This is true for inorder, predorder and postorder traversal.
 * Order= L-R-P
 */

public class BinaryTreePostorder1 {
    
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

    public static void postOrderRecursively(BTINode1 node)
    {
        if(node==null)
        return;

        postOrderRecursively(node.left);
        postOrderRecursively(node.right);
        System.out.print(node.data+" ");

    }

    public static void postOrderIteratively(BTINode1 node)
    {
        Stack <BTINode1> stack = new Stack<BTINode1>();
        BTINode1 curNode = node;
        while(curNode!=null || !stack.isEmpty())
        {
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
