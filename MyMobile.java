package week1.day2;

public class MyMobile {
String name="Nokia";
int model=5510;
int price=2000;

public void makeCalls() {
	System.out.println("Used to make calls");
}
public void sendMsg() {
	System.out.println("Used to send msg");
}
private void payBills() {
	System.out.println("Status of PayBills");
}
public static void main(String[] args) {
	MyMobile obj = new MyMobile();
	System.out.println(obj.name);
	System.out.println(obj.model);
	System.out.println(obj.price);
	obj.makeCalls();
	obj.sendMsg();
	obj.payBills();
	
}


}
