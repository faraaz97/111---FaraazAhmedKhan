package com.marticus.training.Exception;

public class ExceptionThrow {
	public class ExcepEample {

		public static void main(String args[])  
	    {
			 try {
			   
				showException(5);
				
			 }catch(Exception ex)
			 {
				 
				 
			 }
			   
			
			
			
			
	    }
		
		
		public static void showException(int x) throws NumberFormatException
		{
			
			if(x>10)
			{
				System.out.println("OK");
			}
			else
			{
				throw new NumberFormatException();
			}
			
		}


}
