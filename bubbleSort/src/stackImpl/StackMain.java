package stackImpl;

public class StackMain {

	public static void main(String[] args) {
		int size = 5;
		StackX s1 = new StackX(size);
		s1.push(5);
		s1.push(6);
		s1.push(7);
		s1.push(8);
		
		s1.pop();
		System.out.println(s1.peek());

	}

}
