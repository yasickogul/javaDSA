package linkListQ1;

public class Linklist {
	private Link first;
	
	public Linklist() {
		this.first = null;
	}
	
	public void insertFirst(int data) {
		Link newLink = new Link(data);
		newLink.next = first;
		first = newLink;
	}

	public void displayList() {
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
}
