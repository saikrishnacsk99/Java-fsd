package AssistedPractice;

public class Type_Casting {
	public static void main(String[] args) 
	{
        byte b = 100;
        int i = b;
        long l = i;
        float f = l;
        double d = f;
        System.out.println("Implicit type casting");
        System.out.println("byte value: " + b);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        
        int x = 113;
        float y = (float) x;
        double z = (double) y;
        System.out.println("Explicit type casting:");
        System.out.println("int x = " + x);
        System.out.println("float y = " + y);
        System.out.println("double z = " + z);
		
	}

}
