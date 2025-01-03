import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		//first way
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int fact=1;
//		for(int i=1;i<=num;i++) {
//			fact=fact*i;
//		}
//		System.out.println("The Factorial of "+num+" is :"+fact);
//		
		
		//second way
		for(int i=num;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("Way 2 :The Factorial of "+num+" is :"+fact);
	}

}

