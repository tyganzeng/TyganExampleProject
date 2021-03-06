//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
	}

	public LetterRemover(String s, char rem){
		sentence = s;
		lookFor = rem;
	}
	
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String findThis = "" + lookFor;
		String cleaned = sentence;
		int location = sentence.indexOf(findThis);
		
		while(location > -1){
			cleaned =  cleaned.substring(0, location) + cleaned.substring(location + 1);
			location = cleaned.indexOf(findThis);
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters() ;
	}
}