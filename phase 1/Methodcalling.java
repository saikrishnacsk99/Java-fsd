package AssistedPractice;

public class Methodcalling {
	public void methodWithNoParameters() 
	{
		System.out.println("This is a method with no parameters.");
	
	}
	public void methodWithParameters(int num1, int num2)
	{
	    System.out.println("Sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
	}
	public int methodWithReturnValue(int num1, int num2) 
	{
		return num1 * num2;
	}
	public static void main(String[] args) 
	{
		Methodcalling ex = new Methodcalling();
		
		ex.methodWithNoParameters();
		ex.methodWithParameters(8, 9);
		int result = ex.methodWithReturnValue(7, 4);
	    System.out.println("Result of methodWithReturnValue: " + result); 
	    staticMethod();
	}
	public static void staticMethod() 
	{
	        System.out.println("This is a static method.");
	}  
}
