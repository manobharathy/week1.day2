package week1.day2;

public class Calculator

{
	
    public static  int addValues(int a1, int b1){
	int add= a1+b1;
	return add;

	}
    
    public static  int addValues(int i){
    	int add= 12 + 45;
    	return add;

    	}

	public static int subValues(int a1, int b1){
	int sub= a1 -b1;
    return sub;
	}
	
	public static int mulValues(int a1, int b1){
	int multiple= a1 *b1;
	return multiple;
	}
	
	public static double divValues(double a1, double b1){
	double devide= a1 / b1;
	return devide;
	}


	public static void main(String[] args) {
    Calculator obj = new Calculator();
    System.out.println(addValues(2,2));
    System.out.println(subValues(5,2));
    System.out.println(mulValues(5,5));
    System.out.println(divValues(2,10));
    
	}
	}
