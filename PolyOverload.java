package myjava1;
class MathOperation{
	public static int add(int a,int b) {
		return a+b;
	}
	public static double add(double x,double y) {
		return x*y;
	}
	public static double add(double x,int y) {
		return x*y;
	}
}
public class PolyOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("add 2 interger value : "+MathOperation.add(5,9));
   System.out.println("add 2 double value : "+MathOperation.add(5.3,9.3));
   System.out.println("add 2 double&interger value : "+MathOperation.add(2.5,9));
	}

}
