
public class Numbers {
	public static boolean isGoofy(int num) {
		int digits = 0;
		
		for (int i = 0; i < 10; i++){
			if(num - (Math.pow(10, i)) >= 0){
				digits = i + 1;
			}
		}
		int[] digitList = new int[digits];
		double copy = num;
		for (int i = digits - 1; i >= 0; i--){

			int counter = 0;
			while(copy >= Math.pow(10, i)){
				copy = copy - Math.pow(10, i);
				counter++;
			}
			digitList[i] = counter;
		}
		int divisorSum = 0;
		for (int i = 0; i < digitList.length; i++){
			if(digitList[i] != 0 && num % digitList[i] == 0){
				divisorSum = divisorSum + digitList[i];
			}
		}
		
		if (divisorSum % 2 == 0){
			return false;
		} else{
			return true;
		}
		
	}
	
	public static int[] getSomeGoofyNumbers(int count) {
		int counter = 0;
		int num = 0;
		int[] goofyNums = new int[count];
		while (counter != count){
			if(isGoofy(num)){
				goofyNums[counter] = num;
				counter++;
				
			} 
			num++;
		}
		return goofyNums;
	}
	
	/*public static boolean tester(int num){
		int digits = 0;
		for (int i = 0; i < 10; i++){
			if(num - (Math.pow(10, i)) > 0){
				digits = i + 1;
			}
		}
		System.out.println(digits);
		
		int[] digitList = new int[digits];
		double copy = num;
		for (int i = digits - 1; i >= 0; i--){

			int counter = 0;
			while(copy >= Math.pow(10, i)){
				copy = copy - Math.pow(10, i);
				counter++;
			}
			digitList[i] = counter;
		}

		int divisorSum = 0;
		for (int i = 0; i < digitList.length; i++){
			if(digitList[i] != 0 && num % digitList[i] == 0){
				divisorSum = divisorSum + digitList[i];
			}
		}
		
		if (divisorSum % 2 == 0){
			return false;
		} else{
			return true;
		}

	}*/
}
