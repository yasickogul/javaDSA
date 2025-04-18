package palindrome;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s = sc.nextLine();
		int len = s.length();
		// obj creation
		StackX st1 = new StackX(len);
		QueueX q1 = new QueueX(len);
		
		// storing cheractors in Queue and stack
		for(int i = 0; i<len;i++) {
			st1.push(s.charAt(i));
			q1.insert(s.charAt(i));
		}
		// check palindrome
		for (int i = 0; i < len; i++) {
			char fromStack = (char) st1.pop(); // cast because pop() returns int
			char fromQueue = q1.remove();
			
			if (fromStack != fromQueue) {
				System.out.println("Not a palindrome");
				break;
			} else if (i == len - 1) {
				System.out.println("Its a palindrome");
			}
		}
		
		sc.close();
	}

}
