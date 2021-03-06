//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private ArrayList<Student> studentList;
	
	public Class()
	{
		name="";
		studentList=new ArrayList<Student>(0);
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
		studentList = new ArrayList<Student>(stuCount);
	}
	
	public void addStudent(int stuNum, Student s)
	{
		//Student s1 = new Student("Billy Bob","5 - 90 85 95.5 77.5 88");
		//studentList.add(0, s1);
		studentList.add(stuNum, s);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		double classSum = 0.0;
		for (int i = 0; i < studentList.size(); i++){
			classSum = classSum + getStudentAverage(i);
		}
		classAverage = classSum / studentList.size();
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		for(int i = 0; i < studentList.size(); i++){
			if(getStudentName(i).equals(stuName)){
				return studentList.get(i).getAverage();
			}
		}
		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		/*double high = Double.MIN_VALUE;
		String hName = "";
		for(int i = 0; i < studentList.size(); i++){
			if(getStudentAverage(i) > high){
				high = getStudentAverage(i);
				hName = getStudentName(i);
			}
		}*/
		sort();
		return studentList.get(studentList.size() - 1).getName();
	}

	public void sort(){
		for(int j = 0; j <studentList.size(); j++) {
			for(int i = 0; i < studentList.size()- 1; i++){
				if(studentList.get(i).compareTo(studentList.get(i+1)) == 1){
					Student temp = studentList.get(i);
					studentList.set(i,studentList.get(i+1));
					studentList.set(i+1,temp);
				}
			}
		}
	}
	public String getStudentWithLowestAverage()
	{
		/*double low = Double.MAX_VALUE;
		String hName ="";		
		for(int i = 0; i < studentList.size(); i++){
			if(getStudentAverage(i) < low){
				low = getStudentAverage(i);
				hName = getStudentName(i);
			}
		}*/
		sort();
		return studentList.get(0).getName();
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for(int i = 0; i < studentList.size(); i++){
			if(getStudentAverage(i) < failingGrade){
				output = output + getStudentName(i);
			}
		}

		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		
		for(int i = 0 ; i < studentList.size(); i++){
			output = output + studentList.get(i) + "\t" + studentList.get(i).getAverage() + "\n";
		}
		return output;
	}  	
}