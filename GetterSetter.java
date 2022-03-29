package myjava1;
class Rectangle {
	private int length,width;
	int getlength() {
		return length;
	}
	int getwidth() {
		return width;
	}
	void setlength(int l) {
		length=l;
	}
	void setwidth(int w) {
		width=w;
	}
	int area() {
		int a = length*width;
		return a;
	}
	
}
public class GetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle o = new Rectangle();
		o.setwidth(20);
		o.setlength(10);
		System.out.println("area of rectangle : "+o.area());

	}

}
