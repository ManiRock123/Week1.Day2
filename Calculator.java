package week1.day2;

public class Calculator {
	
	int num1, num2,num3; 
	int sum,sub;
	double mul;
	float div;
	
	public int add(int num1, int num2, int num3) {
		System.out.println("Sum of Num1, Num2 and Num3 ");
		sum = num1+num2+num3;
		return sum;
	}
	public 	int sub(int num1, int num2) {
		System.out.println("Substraction of Num1-Num2 ");
		sub = num1-num2;
		return sub;
	}
	public double mul(double num1, double num2)
	{
		System.out.println("Multliply of Num1*Num2 ");
		mul= num1 * num2 ;
		return mul;
	}
	public float divide(float num1, float num2) {
		System.out.println("Division of Num1/num2 ");
		div= num1 / num2 ;
		return div;
	}
	
	public static void main(String[] args) {
		
		Calculator objadd=new Calculator();
		System.out.println(objadd.add(5, 50, 25));
		Calculator objsub= new Calculator();
		System.out.println(objsub.sub(30, 20));
		Calculator objmul= new Calculator();
		System.out.println(objmul.mul(10, 15));
		Calculator objdiv= new Calculator();
		System.out.println(objdiv.divide(250, 5));
	}


}
