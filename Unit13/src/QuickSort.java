//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;
	/*method quicksort(array,low,high)
	   as long as low is less than high
	      split = partition(array, low, high)
	      quicksort(array, low, split)
	      quicksort(array, split+1, high)


	method partition(array,low,high)
	   pivot is the left most value in array
	   bot = one less than low
	   top = one more than high
	   
	   while bot is less than top
	      loop as long as bot + 1 is less than pivot    	
	      loop as long as top � 1 is more than pivot  	
	      check to see if bot and top have crossed
	          return top
	      swap bot spot and top spot

*/
	public static void quickSort(int[] list)
	{
		passCount = -1;
		quickSort(list, 0, list.length - 1);
		
	}

	private static void quickSort(int[] list, int low, int high)
	{

		if(low < high){
			int split = partition(list, low, high);
			passCount++;
			System.out.print(passCount + ": " );
			for(int k : list){
				System.out.print(k + " ");
			}
			System.out.println("\n");
			quickSort(list,low,split);
			quickSort(list,split+1,high);
			
		}

	}


	private static int partition(int[] list, int low, int high)
	{
		int pivot = list[low];
		int bot = low - 1;
		int top = high + 1;
		while(bot < top){
			while(list[--top] > pivot){
			}
			while(list[++bot] < pivot){	
			}
			
			/*while(list[top - 1] > pivot){
				top++;
			}
			while(list[bot + 1] < pivot){
				bot++;
			}*/

			if(bot >= top){
				 return top;
			}
			int temp = list[bot];
			list[bot] = list[top];
			list[top] = temp;
		}
		


		return 0;
	}
}