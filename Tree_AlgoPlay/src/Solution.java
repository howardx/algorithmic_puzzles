import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution
{
  public List<Integer> postorderTraversal(TreeNode root)
  {
    List<Integer> l = new ArrayList<Integer>();
    if (root != null)
    {
      Stack<TreeNode> s = new Stack<TreeNode>();
      s.push(root);
      TreeNode prev = root;
    
      while (!s.isEmpty())
      {
    	TreeNode current = s.peek();
    	
      	if (current.left != null && current.left != prev && current.right != prev)
      	{
          s.push(current.left);
      	}
      	else if (current.right != null && current.right != prev)
      	{
          s.push(current.right);
      	}
      	else
      	{
      	  prev = current;
      	  l.add(current.val);
      	  s.pop();
      	}
      }
    }

    return l;
  }

  public void postorderTraversalRecursive(TreeNode r, List<Integer> l)
  {
    if (r != null)
    {
      postorderTraversalRecursive(r.left, l);
      postorderTraversalRecursive(r.right, l);
      l.add(r.val);
    }
  }
}