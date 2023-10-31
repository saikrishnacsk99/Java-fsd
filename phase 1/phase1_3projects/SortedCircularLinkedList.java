package phase1_3projects;
public class SortedCircularLinkedList {
	
	public class Node{
	int data;
	Node next;
	public Node(int data) {
	this.data = data;
	}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void add(int data){
	//Create new node
	Node newNode = new Node(data);
	//Checks if the list is empty.
	if(head == null) {
	head = newNode;
	tail = newNode;
	newNode.next = head;
	}
	else {
	tail.next = newNode;
	tail = newNode;
	tail.next = head;
	}
	}
	
	public void sortList() {
	Node current = head, index = null;
	int temp;
	if(head == null) {
	System.out.println("List is empty");
	}
	else {
	do{
	index = current.next;
	while(index != head) {

	if(current.data > index.data) {
	temp =current.data;
	current.data= index.data;

	index.data = temp;
	}
	index= index.next;
	}
	current =current.next;
	}while(current.next != head);
	}
	}
	public void display() {
	Node current = head;
	if(head == null) {
	System.out.println("List is empty");
	}
	else {
	do{
	System.out.print(current.data);
	current = current.next;
	}while(current != head);
	System.out.println();
	}
	}
	public static void main(String[] args) {
	SortedCircularLinkedList cl = new SortedCircularLinkedList();
	//Adds data to the list
	cl.add(40);
	cl.add(41);
	cl.add(42);
	cl.add(43);
	cl.add(44);
	//Displaying original list
	System.out.println("Original list:");
	cl.display();
	//Sorting list
	cl.display();
	//Displaying sorted list
	System.out.println("Sorted list:");
	cl.display();
	}
}