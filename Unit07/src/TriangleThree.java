//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
	}

	public TriangleThree(int count, String let)
	{
		size = count;
		letter = let;
	}

	public void setTriangle( int sz, String let )
	{
		size = sz;
		letter = let;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output = "";
	/*	for(int i = size; i > 0; i--){
			for (int k = 1; k < i; k++){
				System.out.print(" ");
			}
			for (int j = 1; j < size; j++){
				System.out.print(letter);
			}
			System.out.println("\n");
		}
		*/
		/*for (int i = 1; i <= size; i++){
			for (int k = 0; k < -1 * i + size; k++){
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++){
				System.out.print(letter);
			}
			System.out.println("\n");
		}*/
		
		for (int i = 1; i <= size; i++){
			for (int k = 0; k < -1 * i + size; k++){
				output = output + " ";
			}
			for (int j = 0; j < i; j++){
				output = output + letter;
			}
			output = output + "\n";
		}
		
		return output;
	}
}