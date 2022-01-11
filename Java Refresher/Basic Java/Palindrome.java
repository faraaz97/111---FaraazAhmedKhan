import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
	
		System.out.println("Please enter a text");
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		
		boolean b=isPalindrome(str);
		
		if(b==true)
		{
			System.out.println(str + " is " + "Palindrome");
			
		}else
		{
			System.out.println(str + " is not " + "Palindrome");
		}
		
		
	}
	
	 
    static boolean isPalindrome(String str)
    {
    	//check if str is palindrome then return true else return false
    	String reverseStr="";
    	for(int i=(str.length()-1);i>=0;i--) {
    		reverseStr=reverseStr+str.charAt(i);
    		
    	}
    	if(str.equalsIgnoreCase(reverseStr)) {
    		return true;
    	}
    	
    	
    	return false;
    }

}

// can be written in this way as well.


static boolean isPalindromeA(String str)
{
    
	int len=str.length();
	char arr[]=new char[len];
	int k=0;
	for(int j=len-1 ;j>=0;j--)
	{
		arr[k]=str.charAt(j);
		k++;
		
	}
	String str2=new String(arr);
	System.out.println(str2);
	if(str.equalsIgnoreCase(str2))
	{
		return true;
	}
	    	
	return false;
}

//in this way as well. 
static boolean isPalindrome(String str)
{
	//check if str is palindrome then return true else return false
	StringBuilder sb = new StringBuilder(str);
	String str2=sb.reverse().toString();
	
	if(str.equalsIgnoreCase(str))
	{
		return true;
	}
	
	return false;
}
