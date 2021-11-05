package week1.day2;

public class StringBasic {

	static String str="welcome";
	public static void main(String[] args) {
		char[] charArray = str.toCharArray();
		System.out.println(str+" convertion");
		for (int i = 0; i < charArray.length;i++) {
			if (i%2!=0) {
				char upperCase = Character.toUpperCase(charArray[i]);
				System.out.print(upperCase);
				
			}
			else
				System.out.print(charArray[i]);
		}
	}
	

}
