package myjava1;

import java.util.*;
public class Priorityqueuesample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  PriorityQueue<Integer> q = new PriorityQueue<>();
		     q.add(20);
		     q.add(12);
		     q.add(34);
		     System.out.println("head is : "+q.peek());
		     System.out.println("removed is : "+q.poll());
		     System.out.println("head is : "+q.peek());
             System.out.println(""+q.element());
           	}
}
