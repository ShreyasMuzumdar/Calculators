import java.util.Scanner;
public class Calculator 
{
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    double num1;
    double num2;
    String operator;
    double result;
    
    System.out.print("Enter the first number:");
    num1=input.nextDouble();
    System.out.print("Enter the second number:");
    num2=input.nextDouble();

    System.out.print("Enter the operation +,-,*,/: ");
    operator=input.next();
    result=preformOperator(num1,num2,operator);
  if (operator.equals("/"))
    {
  System.out.println("Your answer is "+result+" with a remainder of "+num1%num2);
    }
    else
    {
    System.out.println("Your answer is "+result);
    }

  }
    
  public static double preformOperator(double num1, double num2, String operator)
  {
    double result=0;
    if (operator.equals("+"))
    {
      result=num1+num2;
    }
    else if (operator.equals("-"))
    {
      result=num1-num2;
    }
    else if (operator.equals("*"))
    {
      result=num1*num2;
    }
    else if (operator.equals("/"))
    {
      result=num1/num2;
    }
    else 
    {
      System.out.println("Operation is invalid");
    }
     return result;
  }
}



