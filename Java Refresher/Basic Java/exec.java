import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class exec {
	public static void main(String[] args) {
		try {
			
			  FileInputStream fs= new FileInputStream("C:\\Day1 22112021.ppt");
			  fs.read();
			  System.out.println("Please eneter a number:");
			  Scanner sc= new Scanner(System.in);
			  String str= sc.nextLine();
			  
			  int x= Integer.parseInt(str);
			  System.out.println(x);
			 
			 }catch(NumberFormatException ex)
			 {
				 System.out.println("String given in place of number");
				 
			 }
			 catch(FileNotFoundException fx)
			 {
				 System.out.println("File Not found");
				 
			 } catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				 System.out.println("IO Exception");
			}
	}


}
