import java.util.Scanner;
public class ArraySize {
	public static void main(String[] args) {

	Scanner sc =new Scanner(System.in);
	System.out.println("Please enter size of array:");
	
	int size=sc.nextInt();
			
	 String [] names=new String[size];
	 
	 
	
		 System.out.println("Please enter a name:");
		 for(int i=0;i<3;i++) {
		 names[i]=sc.nextLine();
	 }
	 
	 for(int j=0;j<3;j++)
	 {
		 System.out.println("Entered name:"+names[j]);
		 
	 }
}
}



