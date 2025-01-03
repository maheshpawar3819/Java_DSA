
public class SwapTwoNums {

	public static void main(String[] args) {
		//Swamping the two numbers without using third variable
		
		int a=100;
		int b=200;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
	}

}
