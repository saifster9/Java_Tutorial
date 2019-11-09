//Printing Patterns with Java

/**
 * @author saifs
 */

public class Patterns
{

	/**
	 * Nested Loops int to track the line number. While loop to track the line
	 * number. For loop to print #s per line
	 */

	public static void main(String[] args)
	{
		
		/* 
		 * Code to print the following pattern:
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4 
		 * 1 2 3 4 5
		 * 1 2 3 4 5 6
		 */
		
		for (int row=1; row<=6; row++) // Outer loop to track the number of rows
		{
			for (int col=1; col<=row; col ++) // Inner loop to track the number of colums per row
			{
				System.out.print(col + " "); // Printing numbers and spaces
			}
			System.out.println(); // Printing a new line at the end of each row
		}
		System.out.println();
		
		/* 
		 * Code to print the following pattern:
		 * A
		 * A B
		 * A B C
		 */
		
		
		for (int row=1; row<=3; row++)
		{
			char a = 'A';
			for (int col=1; col<=row; col++)
			{
				
				
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
			a = 65;
		}
		System.out.println();
			
			/* 
			 * Code to print the following pattern:
			 * $ $ $ $
			 * $     $
			 * $     $
			 * $ $ $ $
			 */
		
		for (int row=1; row<=4; row++)
		{
			char a = '$';
			for (int col=1; col<=4; col++)
			{				
				if (col==1 | col==4 || row==1 || row==4)
				{
					System.out.print(a + " ");
				}
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}

	}
}