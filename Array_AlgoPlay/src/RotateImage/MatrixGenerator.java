package RotateImage;

import java.util.Random;

public class MatrixGenerator
{
  // NOTE: Usually this should be a field rather than a method
  // variable so that it is not re-seeded every call.
  public static Random rand = new Random();
  
  int [][] generateMatrix(int x, int y, int min, int max)
  {
    int [][] m = new int [x][y]; // initialize 2D array
    
    for (int i = 0; i < x; i++)
    {
      for (int j = 0; j < y; j ++)
      {
        m[i][j] = randInt(min, max);
      }
    }
    return m;
  }
 
  public static int randInt(int min, int max)
  {
    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
  }
  
  void printMatrix(int [][] m)
  {
    for (int i = 0; i < m.length; i++)
    {
      for (int j = 0; j < m[i].length; j++)
      {
        System.out.print(m[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println();
  }
}