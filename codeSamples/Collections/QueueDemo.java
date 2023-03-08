package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueDemo{
	private static void dequeTest(){
		System.out.println("\nInside dequeTest ...");
		
		//Queue - FIFO
		Deque<String> deque = new ArrayDeque<>();
		deque.add("java");
		deque.add("python");
		deque.add("machine learning");
		
		System.out.println("\nPrinting Queue...");
		System.out.println(deque.remove()); //remove first
		System.out.println(deque.remove());
		System.out.println(deque.remove());
		
		// Stack - LIFO
		deque.push("java");
		deque.push("python");
		deque.push("machine learning");
		
		System.out.println("\nPrinting Stack ...");
		System.out.println(deque.pop()); 
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		
	}
	
	public static void main(String[] args) {
		dequeTest();
	
	}
}