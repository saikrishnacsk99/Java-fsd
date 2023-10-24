package AssistedPractice;
import java.util.*;
public class collections {
	public static void main(String[] args) 
	{
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Hyderabad");
	      city.add("mumbai");    	   
	      System.out.println(city);
	      
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(25); 
	      vec.addElement(36); 
	      System.out.println(vec);
	      
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Alex");  
	      names.add("John");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext())
	      {  
	       System.out.println(itr.next()); 
	      }
	      
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(100);  
	       set.add(200);  
	       set.add(300);
	       set.add(400);
	       System.out.println(set);
	       
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(13);  
	       set2.add(12);  
	       set2.add(14);
	       set2.add(15);	       
	       System.out.println(set2);
    }
	
}
