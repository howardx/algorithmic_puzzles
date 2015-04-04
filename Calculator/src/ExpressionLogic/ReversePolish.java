package ExpressionLogic;

import Memory.ReversePolishStack;

public class ReversePolish implements ExpressionResolver
{
  ReversePolishStack stack;

  public ReversePolish ()
  {
    stack = ReversePolishStack.getInstance();
  }

  @Override
  public double resolveExpression(String expression)
  {
    String [] operands = expression.split(" ");
    
    String regex = "[0-9]+"; // digits only, 1 or more times
    
    for (int i = 0; i < operands.length; i++)
    {
      if (operands[i].matches(regex))
      {
        stack.push(Integer.parseInt(operands[i]));
      }
      else // operator
      {
        
      }
    }
    return 0;
  }
}
