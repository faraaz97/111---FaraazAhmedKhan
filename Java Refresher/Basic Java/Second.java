import java.util.Scanner;
public class Second {
	public static void main(String[] args) {
	System.out.println("Please enter the first  number-");
	
	  Scanner sc= new Scanner(System.in);
	  
	  int x= sc.nextInt();
	  
	  System.out.println("Please enter the second  number-");
	  
	  int y= sc.nextInt();
		
	  System.out.println("X="+x);
	  System.out.println("Y="+y);
	  if(x>y) {
	  
	 System.out.println("The first number is greater than second number");
	  }
	  else if(x==y){
	  
	  System.out.println("The first number is equals to second number");

	  }
	  else {
		  System.out.println("The second number is greater than first number");
	  }
}
}

