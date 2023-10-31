package phase1_3projects;

import java.util.LinkedList;
import java.util.Queue;
public class Demoqueue {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.offer("101");
		q.offer("102");
		q.offer("103");
		q.offer("104");
		q.offer("105");
		q.offer("106");
		q.offer("107");
		q.offer("108");
		System.out.println("Queue head = " + q.element());
		System.out.println("Removing element from queue = " +q.remove());
		System.out.println("Remaining Queue elements...");
		Object ob;
		while ((ob = q.poll()) != null) {
		System.out.println(ob);
}
}
}