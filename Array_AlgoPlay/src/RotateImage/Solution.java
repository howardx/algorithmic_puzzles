package RotateImage;

public class Solution
{
  public void rotate(int[][] matrix)
  {
    /*
     * clockwise rotate
     * first reverse up to down, then swap the symmetry 
     * 1 2 3     7 8 9     7 4 1
     * 4 5 6  => 4 5 6  => 8 5 2
     * 7 8 9     1 2 3     9 6 3
     */
    reverseArray(matrix);

    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = row + 1; col < matrix[row].length; col++) // mind starting point
      {
        // Java passes all primitive data types by value, can't implement swap()
        int temp = matrix[row][col];
        matrix[row][col] = matrix[col][row];
        matrix[col][row] = temp;
      }
    }
  }
  
  private void reverseArray(int [][] m)
  {
	// reverse matrix by its row
    for (int row = 0; row < m.length/2; row++)
    {
      int [] tempRow = m[row];
      m[row] = m[ m.length - row - 1 ];
      m[ m.length - row - 1 ] = tempRow;	
    }
  }
  
  /*
   * anticlockwise rotate
   * first reverse left to right, then swap the symmetry
   * 1 2 3     3 2 1     3 6 9
   * 4 5 6  => 6 5 4  => 2 5 8
   * 7 8 9     9 8 7     1 4 7
  */
}