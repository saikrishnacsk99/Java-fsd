package AssistedPractice;
import java.util.*;
public class MapVerification {
	public static void main(String[] args) 
	{
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"krishna");    
	      hm.put(2,"sai");    
	      hm.put(3,"vamsi");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"vinay");  
	      ht.put(5,"lakshma");  
	      ht.put(6,"ramana");  
	      ht.put(7,"vijay");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	     
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"karthik");    
	      map.put(9,"subbu");    
	      map.put(10,"ganesh");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }
}
