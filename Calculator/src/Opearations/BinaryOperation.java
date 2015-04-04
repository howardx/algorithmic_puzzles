package Opearations;

public abstract class BinaryOperation implements Operation
{
  public String name;
  public abstract String calculate(int first, int second);
}