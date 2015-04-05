public class BinaryTreeBuilder
{

  public TreeNode generateBT()
  {
    TreeNode r = new TreeNode(3);
    TreeNode r1 = new TreeNode(1);
    TreeNode r2 = new TreeNode(2);
    TreeNode r3 = new TreeNode(0);
    TreeNode r4 = new TreeNode(4);
    TreeNode r5 = new TreeNode(5);
    TreeNode r6 = new TreeNode(6);
    TreeNode r7 = new TreeNode(7);
    TreeNode r8 = new TreeNode(8);
    TreeNode r9 = new TreeNode(9);
    
    r.left = r1; r.right = r2;
    r1.left = r3; r1.right = r4;
    r2.left = r5;
    r3.right = r6;
    r4.left = r7; r4.right = r8;
    r5.right = r9;
    
    return r;
  }
}
