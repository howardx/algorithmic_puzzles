package RotateImage;

public class RotateMatrix90Degrees
{
  public static void main(String [] args)
  {
    MatrixGenerator mg = new MatrixGenerator();
    int [][] m = mg.generateMatrix(4, 4, 0, 9);
    
    mg.printMatrix(m);
    
    Solution s = new Solution();
    s.rotate(m);

    mg.printMatrix(m);
  }
}
