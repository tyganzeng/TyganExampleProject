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
import java.util.Random;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
	}

	public MadLib(String fileName)
	{
		//load stuff
		this();
		
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		try{
			
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext()){
				String symbol = file.next();
				if(symbol.equals("#")){
					System.out.print(getRandomNoun() + " ");
				}
				else if (symbol.equals("@")){
					System.out.print(getRandomVerb() + " ");
				}
				else if (symbol.equals("&")){
					System.out.print(getRandomAdjective() + " ");
				}
				else {
					System.out.print(symbol + " ");
				}
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit10\\src\\nouns.dat"));
			while(file.hasNext()){
				nouns.add(file.next());
			}
		}
		catch(Exception e)
		{
			out.println("loadnouns failed");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit10\\src\\verbs.dat"));
			while(file.hasNext()){
				verbs.add(file.next());
			}
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit10\\src\\adjectives.dat"));
			while(file.hasNext()){
				adjectives.add(file.next());
			}
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
		Random r = new Random();
		return verbs.get(r.nextInt(verbs.size()));
	}
	
	public String getRandomNoun()
	{
		Random r = new Random();
		return nouns.get(r.nextInt(nouns.size()));
	}
	
	public String getRandomAdjective()
	{
		Random r = new Random();
		return adjectives.get(r.nextInt(adjectives.size()));
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}