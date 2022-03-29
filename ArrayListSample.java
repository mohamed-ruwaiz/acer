package myjava1;
import java.util.*;
public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     ArrayList<Integer> alist = new ArrayList<Integer>();
     for (int i=1;i<=10;i++) 
    	 alist.add(i);
     System.out.println(alist);
     alist.add(100);
     alist.add(45);
     alist.add(34);
     System.out.println(alist);
	}

}
