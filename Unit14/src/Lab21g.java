//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter x = new AtCounter();
		//test the code
		x.countAts(0, 0);
		System.out.println("0 0 has " + x);
		x.countAts(2, 5);
		System.out.println("2 5 has " + x);
		x.countAts(5, 0);
		System.out.println("5 0 has " + x);
		x.countAts(9, 9);
		System.out.println("9 9 has " + x);
		x.countAts(3, 9);
		System.out.println("3 9 has " + x);
	}
}