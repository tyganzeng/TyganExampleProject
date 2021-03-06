//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number = num;

	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		int i = 2;
		while ( i < a){
			if (a % i == 0 && b % i == 0 && c %  i == 0){
				max = i;
			}
			i++;
		}
		return max;
	}

	public String toString()
	{
		String output="";

		for (int a = 1; a < number; a++) {
			if (a % 2 == 0) {
				for (int b = a + 1; b < number; b = b + 2){
					for (int c = 1; c < number; c = c + 2){
						if (greatestCommonFactor(a,b,c) < 1 && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){
							output = output + a + " " + b + " " + c + "\n";
						}
					}
				}
			} else {
				for (int b = a + 1; b < number; b = b + 2){
					for (int c = 1; c < number; c = c + 2){
						if (greatestCommonFactor(a,b,c) < 1 && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){
							output = output + a + " " + b + " " + c + "\n";
						}
					}
				}
			}
		}
		return output;
	}
}