package Memory;

import java.util.Stack;

public final class ReversePolishStack
{
  private static Stack<Integer> s;
  private static ReversePolishStack stack = new ReversePolishStack();

  private ReversePolishStack()
  {
    s = new Stack<Integer> ();
  }
 
  public static ReversePolishStack getInstance()
  {
    return stack;
  }
  
  public static void push(int i)
  {
    s.push(i);
  }
  
  public static int pop()
  {
    return s.pop();
  }
}
