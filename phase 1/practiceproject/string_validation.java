package practiceproject;
import java.util.Scanner;
public class string_validation {
	static boolean validate(String uname, String pword) {
		if(uname.equalsIgnoreCase("java@gmail.com")&& pword.equals("eclipse123"))
			return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count=1;
		while(true) {
			System.out.println("enter your email id");
			String uname=sc.nextLine();
			System.out.println("enter password");
			String pword=sc.nextLine();
			if(validate(uname,pword)) {
				System.out.println("welcome"+uname);
				break;
			}
			else
				if(count<=3)
					System.out.println("invalid user or password");
			count++;
		}
	}
}
