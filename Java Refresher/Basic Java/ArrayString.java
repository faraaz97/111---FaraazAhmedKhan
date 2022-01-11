import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		String [] names=new String[3];
		 Scanner sc =new Scanner(System.in);
		 for(int i=0;i<3;i++)
		 {
			 System.out.println("Please enter a name:");
			 names[i]=sc.nextLine();
		 }
		 
		 for(int j=0;j<3;j++)
		 {
			 System.out.println("Entered name:"+names[j]);
			 
		 }
		 
     
	}

}
