/**
 * Printing the following pattern:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 */

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
		int line = 1;
		
		while (line <= 6)
		{
			for (int i = 1; i <= line; i++)
			{
				System.out.print(i);
			}
			System.out.println();
			line++;
		}
	}
}