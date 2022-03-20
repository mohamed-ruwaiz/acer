package myjava1;
import java.util.*;
class Students{
	private int id;
	private String name,gender;
	
	
	public Students(int id, String name, String gender) {
		this.id=id;
		this.name=name;
		this.gender=gender;
	}

	//getter for id
	public int getID() {
		return id;
	}
	//setter for id
	public void setID(int id) {
		this.id=id;
	}
	
	//getter for name
	public String getName() {
		return name;
	}
	//setter for name
	public void setName(String name) {
		this.name=name;
	}
	
	// getter for gender
	public String getGender() {
		return gender;
	}
	//setter for gender
	public void setGender(String gender) {
		this.gender=gender;
	}
	
}

public class Emptask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int id;
				String name,gender;
				Scanner sc= new Scanner(System.in);
				LinkedList <Students> al1= new LinkedList<Students>();
				System.out.println("Enter the Count of Student : ");
				int n=sc.nextInt();
				
				for(int i=1;i<=n;i++) {
				System.out.print("Enter the Student id : ");
				id=sc.nextInt();
				System.out.print("Enter the Student Name : ");
				name=sc.next();
				System.out.print("Enter the Student Gender : ");
				gender=sc.next();
				al1.add(new Students(id,name,gender));
				System.out.println("");
				}
				
				//gender=sc.next();
				
				//al1.add(new Student(id,name,gender));
				System.out.println("Do you want print all details or specific student details");
				System.out.println("Give 1 for all or any for specifc");
				int k=sc.nextInt();
				if(k==1) {
					for(Students x:al1) {
						System.out.println("Student ID     : "+x.getID());
						System.out.println("Student Name   : "+x.getName());
						System.out.println("Student Gender : "+x.getGender());
					//	System.out.println(((Student)al1).getID());
						System.out.println("");
						}
				}
				else {
				
				System.out.println("Enter any one of the id");
				int a=sc.nextInt();
				
				
			//	al1.forEach(System.out::println);
				//	System.out.println(((Student)al1).getID());
				for(Students x:al1) {if(a==x.getID()) {
				System.out.println("Student ID     : "+x.getID());
				System.out.println("Student Name   : "+x.getName());
				System.out.println("Student Gender : "+x.getGender());

				}}sc.close();
				}
			
			}
			

				}


