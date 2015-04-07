import java.util.ArrayList;
import java.util.List;

public class PostOrderBinaryTree
{
  public static void main (String [] args)
  {
    BinaryTreeBuilder bb = new BinaryTreeBuilder(); 
    TreeNode r = bb.generateBT();
    
    Solution postOrder = new Solution();
    
    // recursive POST order LRD
    System.out.println("recursive POST order LRD");
    List<Integer> result1 = new ArrayList<Integer>();
    postOrder.postorderTraversalRecursive(r, result1);
    Util.printList(result1);
    
    
    // Iterative POST order LRD
    System.out.println("Iterative POST order LRD");
    List<Integer> result = postOrder.postorderTraversal(r);
    Util.printList(result);
    
    
  }

}
