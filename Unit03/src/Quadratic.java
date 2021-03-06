//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.awt.Rectangle;
public class Quadratic
{
	
	private int a, b, c;
	private double rootOne;
	private double rootTwo;
	Scanner keyboard = new Scanner(System.in);
	public Quadratic()
	{
		System.out.print("Enter a ::");
		int intOne = keyboard.nextInt();
		System.out.print("Enter b ::");
		int intTwo = keyboard.nextInt();
		System.out.print("Enter c ::");
		int intThree = keyboard.nextInt();
		
		setEquation(intOne, intTwo, intThree);
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		
		a = quadA;
		b = quadB;
		c = quadC;
 	}

	public void calcRoots( )
	{
		rootOne = (-1 * b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 / a;
		rootTwo = (-1 * b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 / a;

	}

	public void print( )
	{

		System.out.printf("Root1 == %.2f\n", rootOne);
		System.out.printf("Root2 == %.2f\n", rootTwo);

	}
}