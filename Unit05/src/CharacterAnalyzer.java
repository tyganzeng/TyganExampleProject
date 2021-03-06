//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{

	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if(theChar > 64 && theChar < 91){
			return true;
		} else{
			return false;
		}
	}

	public boolean isLower( )
	{
		if(theChar > 96 && theChar < 123){
			return true;
		} else { 
			return false;
		}
	}
	
	public boolean isNumber( )
	{
		if(theChar < 58 && theChar > 47){
			return true;
		} else{ 
			return false;
		}
	}	

	public int getASCII( )
	{
		int asciiNum = theChar;
		return asciiNum;
	}

	public String toString()
	{
		if(isLower()){
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
		}
		else if(isUpper()){
			return ""+getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";
		} 
		else if(isNumber()){
			return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";
		} else {
			return "" + theChar;
		}
	}
}