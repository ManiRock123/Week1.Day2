package week1.day2;

public class MyKid {

public static void main(String[] args) {
	MyMobile obj = new MyMobile();
	System.out.println(obj.name+" "+obj.model+" "+obj.price);
	obj.makeCalls();
	obj.sendMsg();
}
}
