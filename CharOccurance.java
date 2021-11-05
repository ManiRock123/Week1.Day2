package week1.day2;

public class CharOccurance {
	
	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		char[] str1 = str.toCharArray();
		System.out.println("Characters in the String ");
		System.out.println("**********************************************************");
		for (int i = 0; i < str1.length; i++) {
			System.out.println("charArray[" + i + "]: " + str1[i]);
		}
		System.out.println("**********************************************************");
		System.out.println("Length of characters in Array");
		System.out.println(str1.length);
		System.out.println("**********************************************************");
		System.out.println("Traversed characters in the Array are listed below:");
		for (int i = 0; i < str1.length; i++) {

			if (str1[i] == 'e') {
				count++;
				System.out.println(str1[i]);
			}

		}
		System.out.println("**********************************************************");
		System.out.println("Number of 'E' occurance in the string");
		System.out.println(count);

	}
}
