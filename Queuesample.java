package myjava1;
import java.util.*;
public class Queuesample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Queue<Integer> q = new LinkedList<>();
     q.add(13);
     q.add(12);
     q.add(34);
     System.out.println("head is : "+q.peek());
     System.out.println("removed is : "+q.poll());
     System.out.println("head is : "+q.peek());

	}

}
