//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
							 {'@','@','@','-','@','@','-','@','-','@'},
							 {'-','-','-','-','-','-','-','@','@','@'},
						 	 {'-','@','@','@','@','@','-','@','-','@'},
							 {'-','@','-','@','-','@','-','@','-','@'},
							 {'@','@','@','@','@','@','-','@','@','@'},
							 {'-','@','-','@','-','@','-','-','-','@'},
							 {'-','@','@','@','-','@','-','-','-','-'},
							 {'-','@','-','@','-','@','-','@','@','@'},
							 {'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{
		if(r > -1 && r < atMat.length && c > -1 && c < atMat[0].length && atMat[r][c] == '@'){
			atMat[r][c] = '*';
			atCount++;
			countAts(r+1,c);
			countAts(r,c+1);
			countAts(r-1,c);
			countAts(r,c-1);
		}
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]


		return atCount;
	}

	public int getAtCount()
	{
		int temp = atCount;
		atCount = 0;
		return temp;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}