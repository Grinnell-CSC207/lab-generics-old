package taojava.generics;

import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * A simple experiment with expandable arrays.
 */
public class SEAExpt
{
  /**
   * Square a big integer.
   */
  public static BigInteger square(BigInteger i)
  {
    return i.multiply(i);
  } // square(BigInteger)

  public static void main(String[] args)
  {
    PrintWriter pen = new PrintWriter(System.out, true);
    ExpandableArray<BigInteger> numbers = 
      new SimpleExpandableArray<BigInteger>();

    // Set some values
    for (int i = 0; i < 10; i++)
      {
        numbers.set(i, BigInteger.valueOf(i));
      } // for i
    
    // Get some values
    for (int i = 0; i < 10; i++)
      {
        pen.println("numbers[" + i + "] = " + numbers.get(i));
      } // for i

    // Do some simple computations
    for (int i = 0; i < 10; i++)
      {
        pen.println(numbers.get(i) + "^2 = " + square(numbers.get(i)));
      } // for i
  } // main(String[])
} // class SEAExpt
