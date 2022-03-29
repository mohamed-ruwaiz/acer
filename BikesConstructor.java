package myjava1;
import java.util.*;
public class BikesConstructor {
  Scanner in = new Scanner(System.in);
	BikesConstructor(String name){
   
    System.out.println(" bike name : "+name);
    
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   	Scanner in = new Scanner(System.in);
   	
   	System.out.println("enter the bike name : ");
    String bike= in.nextLine();
      
     new BikesConstructor(bike);
     in.close();
	}

}
