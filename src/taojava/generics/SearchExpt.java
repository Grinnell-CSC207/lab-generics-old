package taojava.generics;

import java.io.PrintWriter;

/**
 * A simple set of experiments with predicates and searching.
 */
public class SearchExpt
{
  public static void main(String[] args)
  {
    // Prepare for output.
    PrintWriter pen = new PrintWriter(System.out, true);

    // Set up a few arrays to search.
    String[] strings = 
        new String[] { "alpha", "bravo", "charlie", "delta", "echo",
                       "foxtrot", "golf", "hotel", "india",
                       "juliett", "kilo", "lima", "mike", 
                       "november", "oscar" };
    Integer[] numbers =
        new Integer[] { 2, 3, 5, 7, 9, 11, 13, 15, 17, 18, 32, 42, };
     
    // Set up a few predicates.
    Predicate<String> small = 
      new Predicate<String>()
        {
          @Override
          public boolean holds(String val)
          {
            return (val.length() < 5);
          } // holds(String)
        }; // new Predicate<String>
     Predicate<Integer> odd =
       new Predicate<Integer>()
         {
           @Override
           public boolean holds(Integer val)
           {
             return (val % 2) == 1;
           } // holds(Integer)
         }; // new Predicate<Integer>

    // Okay, we're ready for the experiments
    pen.println("A small string: " + SearchUtils.search(strings, small));
    pen.println("An odd integer: " + SearchUtils.search(numbers, odd));
  } // main(String[])

} // class SearchExpt
