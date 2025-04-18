package midPP;

import java.util.Scanner;
/*
 * Characters given in a queue are stored in ascending order. Write a Java program to store the characters in the same queue in descending order.

You need to first input the characters from the keyboard in ascending order and store them in the queue. After the values are stored in descending order, display the values of the queue by removing them.

Example:

Before:

A	D	G	P	T
After:

| T | P | G | D | A |
 * */
public class Qn1 {
	private int maxSize;
	private char [] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Qn1(int maxSize) {
		super();
		this.maxSize = maxSize;
		queArray = new char[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insertItem(char s) {
		if(front == maxSize-1) {
			System.out.println("Queue is full");
		}else {
			queArray[++rear] = s;
			nItems++;
		}
	}
	
	public static void main(String [] args) {
		int size =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the queue");
		size = sc.nextInt();
		sc.nextLine();
		Qn1 q1 = new Qn1(size);
		
		
		System.out.println("Enter charactors in asc order");
		for(int i = 0;i<size;i++) {
			System.out.println("Enter charactor");
			String d =sc.nextLine();
			q1.insertItem(d.charAt(0));
		}
		
		System.out.println("Printing elements");

		for(char i:q1.queArray) {
			System.out.print(i+" ");
		}
		System.out.println("Printing elements in desc");
		for(int i = size-1;i>=0;i--) {
			System.out.println(q1.queArray[i]);
		}
	}
}
