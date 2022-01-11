import java.util.Scanner;
public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the first  number-");
		
		  Scanner sc= new Scanner(System.in);
		  
		  int x= sc.nextInt();
		  
		  System.out.println("Please enter the second  number-");
		  
		  int y= sc.nextInt();
			
		  //System.out.println("X="+x);
		  //System.out.println("Y="+y);
		  if((x>10) && (y<30)) {
			  System.out.println("OK");
		  }
		  else if((x>5 && x<7) || (y>90)){
			  System.out.println("OK1");
			  
		  }
		  else {
			  System.out.println("NOT OK");
		  }
		  
		  
		  }

}
