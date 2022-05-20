package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {

		Calculator obj = new Calculator();
		System.out.println(obj.addValues(2, 2));
		System.out.println(obj.subValues(5, 3));
		System.out.println(obj.mulValues(5, 5));
		System.out.println(obj.divValues(10, 2));
	}

}
