//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the name of your class?");
		String name = keyboard.nextLine();
		System.out.println("How many students are in the class?");
		int numStudents = keyboard.nextInt();
		
		Class myClass = new Class(name,numStudents);
		
		keyboard.nextLine();
		for(int i = 0; i < numStudents; i++){
			System.out.println("What is the name of student " + i + " ?");
			String stuName = keyboard.nextLine();
			System.out.println("Enter in the gradelist");
			System.out.println("Use the format 2 - 100 100:");
			String gradeList = keyboard.nextLine();
			Student s = new Student (stuName, gradeList);
			myClass.addStudent(i, s);
		}
		myClass.sort();

		out.println(myClass);
		for (int i = 0; i < numStudents; i++){
			out.println(String.format(myClass.getStudentName(i) + "\'s average = %.2f",myClass.getStudentAverage(i)));	
		}
		
		out.println("Failure List = " + myClass.getFailureList(70));	
		out.println("Highest Average = " + myClass.getStudentWithHighestAverage());
		out.println("Lowest Average = " + myClass.getStudentWithLowestAverage());
								
		out.println(String.format("Class Average = %.2f",myClass.getClassAverage()));			


	}		
}