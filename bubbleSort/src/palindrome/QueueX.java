package palindrome;

public class QueueX {
	private char[] CQueue;
	int max;
	int rear;
	int front;
	int numItems;

	public QueueX(int max) {
		this.max = max;
		this.CQueue = new char[max]; // initialize array
		this.rear = -1;
		this.front = 0;
		this.numItems = 0;
	}

	public boolean isFull() {
		return numItems == max;
	}

	public boolean isEmpty() {
		return numItems == 0;
	}

	public void insert(char s) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			rear = (rear + 1) % max;
			CQueue[rear] = s;
			numItems++;
		}
	}

	public char remove() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return 0;
		} else {
			char removed = CQueue[front];
			front = (front + 1) % max;
			numItems--;
			return removed;
		}
	}

}
