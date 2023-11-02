package phase1_4projects;
import java.util.*;
public class FixBug {

	private static ArrayList<Integer> arrlist = new ArrayList<Integer>();
	private static void addExpenses() {
		ArrayList<Integer> expenses = new ArrayList<Integer>();
		expenses.add(1000);
		expenses.add(2300);
		expenses.add(45000);
		expenses.add(32000);
		expenses.add(110);
		arrlist.addAll(expenses);}
	private static void addAdditional( ) {
	Scanner sc = new Scanner(System.in);
	int value = sc.nextInt();
	arrlist.add(value);
	System.err.println(arrlist+"\n");}
	private static void optionsSelection() {
		FixBug errorHandle = new FixBug();
		ArrayList<Integer> myList = arrlist;String[] 
				arr = {"1. I wish to review my expenditure",
						"2. I wish to add my expenditure",
						"3. I wish to delete my expenditure", 
						"4. I wish to sort the expenditures",
						"5. I wish to search for a particular expenditure",
						"6. Close the application"};
	int[] arr1 = {1,2,3,4,5,6};
	int slen = arr1.length;
	for(int i=0; i<slen;i++){ 
		System.out.println(arr[i]);
	}
	System.out.println("\nEnter your choice:\t");
	Scanner sc = new Scanner(System.in);
	int options = sc.nextInt();for(int j=1;j<=slen;j++){if(options==j){
		switch (options){case 1:System.out.println ("Your saved expenses are listed below: \n");
		System.err.println(myList+"\n");optionsSelection();
		break;
		case 2:System.out.println("Enter the value to add your Expense:\t");
		addAdditional();System.out.println("Your value is updated\n");
		optionsSelection();
	break;
		case 3:System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
		int con_choice = sc.nextInt();
		if(con_choice==options){arrlist.clear();
		System.out.println(arrlist+"\n");
		System.err.println("All your expenses are erased!\n");
		}else {System.err.println("Oops... try again!\n");
		}
		optionsSelection();
		break;
		case 4:addExpenses();optionsSelection(); 
		break;
		case 5:searchExpenses(myList);optionsSelection(); 
		break;
		case 6:closeApp();
		break; 
		default:System.err.println("You have made an invalid choice!");
		break;}}}}
	private static void closeApp() {
		System.out.println("\nClosing your application... \nThank you!");
		}
	private static void searchExpenses(ArrayList<Integer> arrayList) {
		int leng = arrayList.size();System.out.println("Enter the expense you need to search:\t"); 
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();if(arrlist.contains(val)) {
			System.err.println("Your Expenditure is Existed .\n");
			System.err.println("Found at the Index of "+arrlist.indexOf(val)+" In the Array List..\n");
			}else	System.out.println("Oh..! It seems Your Expenditure Doesn'tExixted"); 
			}
	private static void sortExpenses() {
		Collections.sort(arrlist);
		System.out.println(arrlist);
		}
	
	/*  public static void main(String args[]){
		FixBug fix = new FixBug();
		ArrayList<Integer> my = new ArrayList<>();
		fix.addExpenses();
		fix.optionsSelection();
	}*/
	
	public static void main(String[] args){
		/*System.out.println("Hello World!"); */
		System.out.println("\n**************\n");
	System.out.println("\tWelcome to TheDesk \n");
	System.out.println("**************\n");
	FixBug errorHandle = new FixBug();
	ArrayList<Integer> myList = new ArrayList<>(); 
	errorHandle.addExpenses();
	errorHandle.optionsSelection();
	
	}

}