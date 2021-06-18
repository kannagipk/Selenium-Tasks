package week1.day2;

public class Calculator {
	public int add(int a,int b) {
		int sum = a+b;
		return sum;

	}
	public double sub(double a, double b) {
		double sub = a-b;
		return sub;

	}
	public double mul(double c, double d) {
		double mul=c*d;
		return mul;
	}
	public int divide(int c, int d) {
		int div=c/d;
		return div;

	}

	public static void main(String[] args) {
		Calculator calc =new Calculator();
		System.out.println(calc.add(10, 5));
		System.out.println(calc.sub(12.4, 9.78));
		System.out.println(calc.mul(100.56, 56));
		System.out.println(calc.divide(14, 7));

	}

}
