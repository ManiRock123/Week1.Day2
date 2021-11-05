package week1.day2;

import java.util.Arrays;

public class ArrayBasic {
	public static void main(String[] args) {
		
		int numArray[]= {100,49,398,34,1,267};
		int lenArray = numArray.length;
		System.out.println("Array in the given way");
		System.out.println("                        ");
		for (int i = 0; i < lenArray; i++) {
			System.out.println("Num Array "+i+" is "+numArray[i]);
		}
		System.out.println("                        ");
		System.out.println("Num Array in sorted way");
		System.out.println("                        ");
		Arrays.sort(numArray);
		for (int i = 0; i < lenArray; i++) {
			System.out.println("Num Array "+i+" is "+numArray[i]);
		}
		System.out.println("                        ");
		System.out.println("Second largest number in sorted way is "+numArray[lenArray-2]);
		System.out.println("                        ");
		System.out.println("Second smallest number in sorted way is "+numArray[1]);
	}

}
