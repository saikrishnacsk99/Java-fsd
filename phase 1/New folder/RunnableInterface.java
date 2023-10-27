package AssistedPractice;
class Mythreadrunnable1 implements Runnable{  
	public void run(){  
	System.out.println(" i am a thread1 not a threat1...");  
	}  
}
class Mythreadrunnable2 implements Runnable{  
	public void run(){  
	System.out.println(" i am a thread1 not a threat2...");  
	}  
}
public class RunnableInterface {

public static void main(String[] args) {
	Mythreadrunnable1 mythread =  new Mythreadrunnable1();
	Thread t1 = new  Thread(mythread);
	
	Mythreadrunnable2 mythread1 =  new Mythreadrunnable2();
	Thread t2= new  Thread(mythread1);
	
	t1.start(); 
	t2.start();
	
}

}


