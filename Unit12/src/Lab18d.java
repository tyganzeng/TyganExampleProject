//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit12\\src\\lab18d.dat"));
		int size = file.nextInt();
		List<Word> myWords = new ArrayList<Word>(size);
		file.nextLine();
		while(file.hasNextLine()){
			String q = file.nextLine();
			Word s = new Word(q);
			myWords.add(s);
		}
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size-1; j++){
				if(myWords.get(j).compareTo(myWords.get(j+1)) == 1){
					Word temp = myWords.get(j);
					myWords.set(j, myWords.get(j+1));
					myWords.set(j+1, temp);
				}
			}
		}
		for(int i = 0; i < size; i++){
			System.out.println(myWords.get(i));
		}
	}
}