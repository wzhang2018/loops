
/**
 * This class demonstrates two differen kinds of loops in java * It isn't very human-like. Yet.....
 * @author William Zhang
 @ @version pre-release
 *
 */
 
 public class Looping
 {
 	/**
 	 * Main method demonstrates how to use two different loops by calling other methods
 	 * @param args An array of args passed into the interpreter
 	 */
 	 
 	//* Can't use an @return here because the method returns void
 	 
 	public static void main(String[] args)
 	{
 		int start = 4;
 		int end = 10;
 		
 		//Count from start to end with a while loop
 		whileLoop(start, end);
 		
 		//Count from start to end with a for loop
 		forLoop(start, end);
 	}
 	
 	public static void whileLoop(int begin, int finish)
 	{
 		int count = begin;
 		
 		while (count != finish)
 		{
 			System.out.println(count++);
 		}
 	}
 	
 	public static void forLoop(int begin, int finish)
 	{
 		for (int count = begin; count <= finish; count++)
 		{
 			System.out.println(count);
 		}
 	}
 }