
import java.util.*; //needed to use the scanner object

/**
 * <pre>
 * 
 * Author:
 *  	Brandon Mota 
 *  
 *  
 * Description: 
 * 		This program processes one adds numbers up
 * 		to a user defined number.
 * 
 * Use the Java command from a command-line-terminal (e.g "java Adder <number>")
 * 
 * </pre>
 */

public class Adder
{
	//data	
	private int usernumber;

	/**
	 * <pre>
	 * Description: 
	 * This is a constructor.
	 * Pre:
	 * none.
	 * Post:
	 * Initializes the usernumber variable.
	 * </pre>
	 */

	public Adder()
	{
		usernumber = 0;
	}

	/**
	 * <pre>
	 * Description: 
	 * This will prompt and hold the user input.
	 * Pre:
	 * none
	 * Post:
	 * usernumber will contain the user's number
	 * and print the sum.
	 * </pre>
	 * 
	 */

	public void userinput(int usernumber)
	{
		//Scanner in = new Scanner(System.in);
		
		//System.out.println("This program will add the numbers up to a user-defined number.");
		
		//System.out.print("Please enter a positive integer: ");
		//usernumber = in.nextInt(); //the integer that the user inputs will be saved into usernumber
		
		if(usernumber >= 0) //prevents an exception by accepting positive numbers only
		{
			System.out.print("The sum of the numbers up to the desired number is ");		
			System.out.print(recadd(usernumber));
			System.out.print(".");
			System.out.println("\nRun the program again if you desire another number.");
		}
		else
		{
			System.out.println("You need to enter a POSTIVE INTEGER.");
			System.out.println("Restart the program to try again.");
		}
		
		
	}
	
	/**
	 * <pre>
	 * Description: 
	 * This will recursively add the numbers up to
	 * the user's number.
	 * Pre:
	 * Only positive integers
	 * Post:
	 * The sum will be returned back to be printed.
	 * </pre>
	 * 
	 */

	public int recadd(int number)
	{		
		
		if (number != 0) //as long as number is not 0, the method will call itself	
		{
			return number + recadd(--number); //calls the method again
		}
		else
		{
			return 0;
		}
		
	}
	
	/**
	 * <pre>
	 * Description: 
	 * The main method that will follow the 
	 * given instructions.
	 * </pre>
	 * 
	 */

	public static void main(String[] args)
	{
		Adder addone = new Adder();	//creates a new object			
		//addone.userinput();	//calls the userinput method	
		for (String s: args)
		{
            int y = Integer.parseInt(s);
            addone.userinput(y);
        }
	}
	

} //end of program
