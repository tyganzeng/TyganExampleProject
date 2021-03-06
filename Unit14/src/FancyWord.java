//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{

	}

   public FancyWord(String s)
	{
	   mat = new char[s.length()][s.length()];
	   for(char[] row : mat){
			Arrays.fill(row, ' ');
		}
	   for(int i=0; i < s.length(); i++)
	   {
		 int end = s.length() - i - 1;
		   
	     mat[0][i] = s.charAt(i);
	     mat[i][i] = s.charAt(i);
	     mat[end][i] = s.charAt(i);
	     mat[s.length() - 1][i] = s.charAt(i);
	   }
	}

	public String toString()
	{
		String output="";
		for(int r = 0; r < mat.length; r++){

			for(int c = 0; c < mat[0].length; c++){

				output = output + mat[r][c] + " ";
			}
			output = output + "\n";
		}
		return output+"\n\n";
	}
}