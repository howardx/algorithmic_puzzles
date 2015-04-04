package Opearations;

public class Addition extends BinaryOperation
{
  Addition()
  {
    name = "add";
  }
  @Override
  public String calculate(int first, int second)
  {
    return String.valueOf(first + second);
  }
}
