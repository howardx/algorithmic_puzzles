package LetterCombinationOfPhoneNumber;

import java.util.List;

public class LetterCombinationOfPhoneNumber
{
  public static void main(String [] args)
  {
    Solution s = new Solution();
    
    List<String> combinations = s.letterCombinations("23");
    
    for (int i = 0; i < combinations.size(); i++)
    {
      System.out.println(combinations.get(i));
    }
  }
}
