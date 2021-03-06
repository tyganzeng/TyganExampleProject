//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
		
	}

	public Histogram(char[] values, String fName)
	{
		this();
		
		for(int i = 0; i < values.length; i++){
			letters.add(values[i]);
		}
		fileName = fName;
		
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		Scanner file = new Scanner(new File("H:\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16e\\" + fileName));
		for(int i = 0; i < letters.size(); i++){
			int counter = 0;
			while (file.hasNext()){
				String s = file.next();
				for(int k = 0; k < s.length(); k++){
					if(s.charAt(k) == letters.get(i)){
						counter = counter + 1;
						
					}
				}
			}
			file.close();
			file = new Scanner(new File("H:\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16e\\" + fileName));
			count.add(counter);
		}

	}

	public char mostFrequent()
	{
		int max = count.get(0);
		char letter = letters.get(0);
		for (int i = 1; i < count.size(); i++){
			if(count.get(i) > max){
				max = count.get(i);
				letter = letters.get(i);
			}
		}
		return letter;
	}

	public char leastFrequent()
	{
		int min = count.get(0);
		char letter = letters.get(0);
		for (int i = 1; i < count.size(); i++){
			if(count.get(i) < min){
				min = count.get(i);
				letter = letters.get(i);
			}
		}
		return letter;
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}