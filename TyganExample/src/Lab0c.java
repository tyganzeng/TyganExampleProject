//� A+ Computer Science  -  www.apluscompsci.com
//Name - Tygan Zeng
//Date - 2/1/18
//Class - AP CSA
//Lab  - 0C

import static java.lang.System.*;
import java.util.Scanner;

public class Lab0c
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo, intTotal;
		double doubleOne, doubleTwo, doubleTotal;
		float floatOne, floatTwo;
		short shortOne, shortTwo;
		byte byteOne, byteTwo;
		long longOne, longTwo;

		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();

		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();

		System.out.print("Enter an double :: ");
		doubleOne = keyboard.nextDouble();

		System.out.print("Enter an double :: ");
		doubleTwo = keyboard.nextDouble();

		System.out.print("Enter an float :: ");
		floatOne = keyboard.nextFloat();

		System.out.print("Enter an float :: ");
		floatTwo = keyboard.nextFloat();

		System.out.print("Enter an short :: ");
		shortOne = keyboard.nextShort();

		System.out.print("Enter a short :: ");
		shortTwo = keyboard.nextShort();

		System.out.print("Enter a byte :: ");
		byteOne = keyboard.nextByte();

		System.out.print("Enter a byte :: ");
		byteTwo = keyboard.nextByte();

		System.out.print("Enter an long :: ");
		longOne = keyboard.nextLong();

		System.out.print("Enter a long :: ");
		longTwo = keyboard.nextLong();




		//add in output for all variables

		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		System.out.println("double one = " + doubleOne );
		System.out.println("double two = " + doubleTwo );
		System.out.println("float one = " + floatOne );
		System.out.println("float two = " + floatTwo );
		System.out.println("short one = " + shortOne );
		System.out.println("short two = " + shortTwo );
		System.out.println("byte one = " + byteOne );
		System.out.println("byte two = " + byteTwo );
		System.out.println("long one = " + longOne );
		System.out.println("long two = " + longTwo );

		//bonus output
		
		intTotal = intOne + intTwo;
		doubleTotal = doubleOne + doubleTwo;

		System.out.println("intOne + intTwo = " + intTotal);
		System.out.println("doubleOne + doubleTwo = " + doubleTotal);
	}
}