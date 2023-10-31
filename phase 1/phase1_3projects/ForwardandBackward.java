package phase1_3projects;
import java.util.*;
public class ForwardandBackward {
	static Node head;
	static class Node{
	int data;
	Node next;
	Node prev;
	};
	
	static void addNode(int value) {
	if (head == null) {
	Node new_node = new Node();
	new_node.data = value;
	new_node.next = new_node.prev = new_node;
	head = new_node;
	return;
	}
	
	Node last = (head).prev; 
	Node new_node = new Node();
	new_node.data = value;
	new_node.next = head;
	(head).prev = new_node;
	new_node.prev = last;
	last.next = new_node;
	}
	static void printNodes() {
	Node temp = head;
	while (temp.next != head)
	{

	System.out.printf("%d ", temp.data);
	temp = temp.next;
	}
	System.out.printf("%d", temp.data);
	System.out.printf("\n Circular doubly linked list travesed backward: \n ");
	Node last = head.prev;
	temp = last;
	while (temp.prev != last)
	{
	System.out.printf("%d ", temp.data);
	temp = temp.prev;
	}
	System.out.printf("%d ", temp.data);
	}
	public static void main(String[] args)
	{
	//the empty list
	Node l_list = null;
	// add nodes to the list
	addNode(41);
	addNode(42);
	addNode(43);
	addNode(44);
	addNode(45);
	//print the list
	System.out.printf("Circular doubly linked list: ");
	printNodes();
	}

	}