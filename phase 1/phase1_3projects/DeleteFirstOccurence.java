package phase1_3projects;
public class DeleteFirstOccurence {
	//Represent a node of the singly linked list
	class Node{
	int data;
	Node next;
	public Node(int data) {
	this.data = data;
	this.next = null;
	}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data) {
	//Create a new node
	Node newNode = new Node(data);
	
	if(head == null) {
	head = newNode;
	tail = newNode;
	}
	else {

	tail.next = newNode;
	
	tail = newNode;
	}
	}
	
	public void deleteStart() {
	
	if(head == null) {
	System.out.println("List is empty");
	return;
	}
	else {
	
	if(head != tail) {
	head = head.next;
	}
	else {
	head = tail = null;
	}
	}
	}
	
	public void display() {
	Node current = head;
	if(head == null) {
	System.out.println("List is empty");
	return;
	}
	while(current != null) {
	//Prints each node by incrementing pointer
	System.out.print(current.data + " ");
	current = current.next;
	}
	System.out.println();
	}
	public static void main(String[] args) {
	DeleteFirstOccurence sList = new DeleteFirstOccurence();
	//Adds data to the list
	sList.addNode(5);
	sList.addNode(6);
	sList.addNode(7);
	sList.addNode(8);
	//Printing original list
	System.out.println("Original List:");
	sList.display();
	while(sList.head != null) {
	sList.deleteStart();
	//Printing updated list
	System.out.println("Updated List: ");
	sList.display();
	}
	}
	}