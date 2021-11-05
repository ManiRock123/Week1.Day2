package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		System.out.println("Array in normal mode");
		System.out.println("********************");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Array Elements of [" + i + "] is: " + arr[i] );
		}
		Arrays.sort(arr);
		System.out.println("\n"+"Array in sorted mode");
		System.out.println("**********************");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Array Elements of [" + i + "] is: " + arr[i] );
		}
		System.out.println("\n"+" Missing element in Array ");
		System.out.println("***************************");
		for (int i = arr[0]; i<=arr.length; i++)
		{
			if (i!=arr[i-1])
			{
				System.out.println("The missing number is " +i);
				break;
			
		}
			
		}	
		
	}
}
