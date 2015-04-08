package LetterCombinationOfPhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
                                       //0 , 1  , 2       3      4      5      6      7      8      9  
  private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

  public List<String> letterCombinations(String digits)
  {
    List<String> result = new ArrayList<String>();
    
    if (!digits.isEmpty())
    {
      combination("", digits, 0, result);
    }
    return result;
  }

  /*
   * for Backtracking function argument list, there (normally) would be:
   * 1. temp result holder - String prefix
   * 2. input argument/ source - String digits
   * 3. indicator for backtracked depth/step - int offset (normally numeric/int type)
   * 4. final result holder - List<String> result (normally a collection type)
   * (5. no return - void)
   */
  private void combination(String prefix, String digits, int offset, List<String> result)
  {
	/* termination condition:
	 * 
	 * letter combination of phone number must has the SAME LENGTH 
	 * as the given phone number
	 */
    if (offset == digits.length())
    {
      result.add(prefix);
      return;
    }
    
    String lettersOnKey = KEYS[digits.charAt(offset) - '0']; // use char as int type for calculation

    for (int i = 0; i < lettersOnKey.length(); i++)
    {
      combination(prefix + lettersOnKey.charAt(i), digits, offset + 1, result);
    }
  }
}
