package myjava1;

import java.util.Scanner;
public class cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int Model;
    String Name,company;
    Scanner sc = new Scanner (System.in);
   
		System.out.println("Enter the car model:");
		Model=sc.nextInt();
		System.out.println("Enter the car name:");
		Name=sc.next();
		System.out.println("Enter the car company:");
		company=sc.next();
		
		cars2 car = new cars2();
		car.printcarDetails(Model,Name,company);
		sc.close();
	}
	}


