package AssistedPractice;

public class Constructortype {
	private int value;
    public Constructortype() 
    {
        System.out.println("Default Constructor called.");
        value = 9; 
    }
    public Constructortype(int val)
    {
        System.out.println("Parameterized Constructor called with value: " + val);
        value = val;
    }
    public Constructortype(Constructortype original)
    {
        System.out.println("Copy Constructor called.");
        this.value = original.value; 
    }
    public int getValue() 
    {
        return value;
    }

    public static void main(String[] args) {
        
    	Constructortype dc = new Constructortype();
        System.out.println("Value from Default Constructor: " + dc.getValue());
        
        Constructortype pc = new Constructortype(89);
        System.out.println("Value from Parameterized Constructor: " + pc.getValue());
        
        Constructortype original = new Constructortype(68);
        
        Constructortype cc = new Constructortype(original);
        
        System.out.println("Value from Copy Constructor: " + cc.getValue());
}
}
