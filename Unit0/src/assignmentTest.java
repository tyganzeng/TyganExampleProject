import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class assignmentTest {
	//� A+ Computer Science  -  www.apluscompsci.com
	//Name - 
	//Date -
	//Class -
	//Lab  -

		public static void main ( String[] args )
		{
			System.out.println(" hello" + mirrorEnds("abXYZba"));
		}
		
		public static String mirrorEnds(String string) {
			char[] mirror = new char[string.length()];
			char[] f = new char[string.length()];
			  for(int i = 0; i < string.length(); i++){
			    f[i] = string.charAt(i);
			    for(int j = string.length() - 1; j > string.length() - i - 2; j--){
			      mirror[string.length() - j - 1] = string.charAt(j);
			    }
			    String c = new String(mirror);

		    	c = c.trim();
		    	String b = new String(f);
		    	b = b.trim();

			    if(!c.equals(b)){

			    	return b.substring(0, b.length() - 1);
			    }
			  }

			  return "hi";
			}

	
}
