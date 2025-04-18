package stackImpl;

public class StackX {
	private int maxSize;
	private int [] stackArr;
	private int top;
	
	public StackX(int maxSize) {
		super();
		this.maxSize = maxSize;
		stackArr = new int[maxSize];
		top = -1;
	}
	
	public void push(int data) {
		if(top == maxSize-1) {
			System.out.println("Stack is full");
		}else {
			stackArr[++top] = data;
		}
		
	}
	
	public int pop() {
		if(top == -1) {
			return 0;
		}else {
			return stackArr[top--];
		}
	}
	
	public int peek() {
		return stackArr[top];
	}
	

}
