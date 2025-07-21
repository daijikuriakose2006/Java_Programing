package overloading;
class calculator{
	public void add(int a, int b) {
		int result=a+b;
		System.out.println("Addition of two numbers = "+result);
	}
	public void add(int a ,int b ,int c) {
		int result=a+b+c;
		System.out.println("Addition of third numbers = "+result);
	}
	public void add(double a , double b) {
		double result=a+b;
		System.out.println("Addition of two double numbers = "+result);
	}
	public void add(String a , int b) {
		String result=a+b;
		System.out.println("Addition of third numbers = "+result);
	}
}

public class Overloading {
	public static void main(String [] args) {
		calculator cal=new calculator();
		cal.add(10,15);
		cal.add(10,20,40);
		cal.add(3.2457496,5.3678467);
		cal.add("Hello ",6);
	}
}
