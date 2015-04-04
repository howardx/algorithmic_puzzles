import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ExpressionLogic.ReversePolish;

public class Calculator
{
  private static ReversePolish reversePolishResolver;

  Calculator()
  {
    reversePolishResolver = new ReversePolish();
  }
  
  public static void main(String [] args)
  {
    try
    {
  	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  	  String singleLine;
 
  	  while( (singleLine=br.readLine()) != null)
  	  {
  	    processInput(singleLine);
  	  }
  	}
    catch(IOException io)
    {
      io.printStackTrace();
  	}	
  }
  
  private static void processInput(String input)
  {
    System.out.println(reversePolishResolver.resolveExpression(input));
  }
}