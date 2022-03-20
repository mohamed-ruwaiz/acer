package myjava1;
class Student{
	public int roll_no;
	public String name;
	Student (int roll_no,String name)
	{
		this.roll_no = roll_no;
		this.name=name;
	}
	void print()
	{
		System.out.println("name :"+name);
		System.out.println("roll no: "+roll_no);
		
	}
}
public class Array_Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	Student [] o;
   o=new Student[5];
   o[0]=new Student (10,"ruz");
   o[1]=new Student (11,"wuz");
   o[2]=new Student (12,"suz");
   o[3]=new Student (13,"kuz");
   o[4]=new Student (14,"luz");
   for (int i = 0;i<o.length;i++)
   o[i].print();
	}

}
