package Opearations;

public abstract class UnaryOperation implements Operation
{
  public String name;
  
  public abstract String calculate(int operand);

}