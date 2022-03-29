package myjava1;

class grandfather
{
	public void land() {
	System.out.println("have a land");
	}
}
class mother extends grandfather
{
	public void house()
	{
		System.out.println( "have own a house");
	}
}
class daughter extends mother
{
	public void bike()
	{
		System.out.println("have own fz bike");
	}
}
public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    daughter obj = new daughter();
    obj.bike();
    obj.house();
    obj.land();
    		
	}

}
