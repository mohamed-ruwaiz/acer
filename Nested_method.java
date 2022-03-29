package myjava1;
class nemo{
	private int m,n;
	nemo(int x,int y){
		 m=x;
		 n=y;
	}
	int largest() {
		if(m>n)
			return m;
		else
			return n;
	}
	void display () {
		int large=largest();
		System.out.println("largest is : "+large);
	}
	
}
public class Nested_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     nemo o =new nemo(10,20);
     o.display();
	}

}
