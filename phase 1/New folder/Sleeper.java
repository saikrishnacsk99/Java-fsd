package AssistedPractice;

public class Sleeper {

	public static void main(String[] args) {
		Sleeper sr = new Sleeper();
		System.out.println("Hello");
		Sleeper.time();
		System.out.println("Sleep for 2 seconds");
		Sleeper.time();
		System.out.println(" Wake up from the sleep");
	}
	
	public static void time(){
		try{
			Thread.sleep(500);
			
		}
		catch(Exception e){
			
		}
		
	}

	public static void time1(){
		try{
			Thread.sleep(500);
			
		}
		catch(Exception e){
			
		}
	}

}

