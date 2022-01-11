import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		double a=sc.nextDouble();
		System.out.println("Enter second number:");
		double b=sc.nextDouble();
		double mul= a*b;
		System.out.println("multiplication:"+ mul);
		double div=((double)a)/b;
		System.out.println("Division:"+div);

	}

}
