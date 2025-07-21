package overloading;
class AreaCalculator{
	
	public void area(double a){
		double result=3.14*a;
		System.out.println("Area of circle= "+result);
	}
	public void area(double l, double b) {
		double result=l*b;
		System.out.println("Area of Rectangle= "+result);
	}
	public void area(double l, float b) {
		double result=(1/2*l)*b;
		System.out.println("Area of Triangle= "+result);
	}
	public void area(int l) {
		int result=l;
		System.out.println("Area of square= "+result);
	}
}
public class Area {
	public static void main(String[] args) {
		AreaCalculator cal=new AreaCalculator();
		cal.area(10.658);
		cal.area(10.567,5.356);
		cal.area(3.2457496,5.3678467f);
		cal.area(6);
	}
}
