//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private int number = 0;
	private String roman = "";

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		roman = str;
	}

	public RomanNumeral(int orig)
	{
		number = orig;
	}

	public void setNumber(int num)
	{
		number = num;
		roman = "";
	}

	public void setRoman(String rom)
	{
		roman = rom;
		number = 0;
	}

	public Integer getNumber()
	{
		for (int i = 0; i < LETTERS.length; i++){
			while (roman.indexOf(LETTERS[i], 0) == 0){
				number = number + NUMBERS[i];
				if(LETTERS[i].length() == 1){
					roman = roman.substring(1);
				} else {
					roman = roman.substring(2);
				}
			}
		}
		return number;
	}

	public String toString()
	{
		for (int i = 0; i < NUMBERS.length; i++){
			while(number >= NUMBERS[i]){
				number = number - NUMBERS[i];
				roman = roman + LETTERS[i];
			}
		}
		return roman + "\n";
	}
}