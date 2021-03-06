/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:

	}

	/*else if (findKeyword(statement, "no") >= 0)
	{
		response = "Why so negative?";
	}*/
	/*else if (findKeyword(statement, "mother") >= 0
			|| findKeyword(statement, "father") >= 0
			|| findKeyword(statement, "sister") >= 0
			|| findKeyword(statement, "brother") >= 0)
	{
		response = "Tell me more about your family.";
	}*/
}
