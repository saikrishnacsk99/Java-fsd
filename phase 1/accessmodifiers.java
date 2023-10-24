package AssistedPractice;

public class accessmodifiers {
	public int publicVariable = 10;
	protected int protectedVariable = 20;
	    int defaultVariable = 30;
	    private int privateVariable = 40;
	    public void publicMethod() 
	    {
	    	
	    	System.out.println("This is a public method.");
	    }
	    protected void protectedMethod() 
	    {
	        System.out.println("This is a protected method.");
	    }
	    void defaultMethod() 
	    {
	        System.out.println("This is a default method.");
	    }
	    private void privateMethod() 
	    {
	        System.out.println("This is a private method.");
	    }

	    public static void main(String[] args) 
	    {
	    	accessmodifiers ex = new accessmodifiers();

	        System.out.println("Accessing variables:");
	        System.out.println("Public variable: " + ex.publicVariable);
	        System.out.println("Protected variable: " + ex.protectedVariable);
	        System.out.println("Default variable: " + ex.defaultVariable);
	        System.out.println("Private variable: " + ex.privateVariable);

	        System.out.println("\nAccessing methods:");
	        ex.publicMethod();
	        ex.protectedMethod();
	        ex.defaultMethod();
	        ex.privateMethod();
	    }

}
