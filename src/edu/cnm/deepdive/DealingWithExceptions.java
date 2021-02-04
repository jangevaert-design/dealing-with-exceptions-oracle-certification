package edu.cnm.deepdive;

public class DealingWithExceptions {

  public static void main(String[] args) {
    int a = 10;
    int b = 0;

    try {
      int result = divide(a, b);//trying to divide by zero! ArithmeticException
      System.out.println("result = " + result);
    } catch (ArithmeticException e) {
      e.printStackTrace();
      //instead of printing the stack trace you can also print a message
      System.out.println("Error dividing. Message = " + e.getMessage());
    }
  }

  private static int divide(int a, int b) {
    return a / b;
  }

}
