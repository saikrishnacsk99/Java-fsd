package AssistedPractice;

public class ExceptionHandling {
	public static void main(String[] args) {
		try
			{
				int a = 10/0;
			}
			catch(ArithmeticException e)  
		    {  
		        System.out.println(e);  
		    }  
		    System.out.println("rest of the code");  
			
	}
}
