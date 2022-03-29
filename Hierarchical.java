package myjava1;
class Shape{
	float length,breadth,radius;
}
class rect extends Shape{
	public rect(float l ,float b) {
		length =l;
		breadth =b;
	}
	float rectangle_area() {
		return length*breadth;
	}
}
class circle extends Shape{
	public circle(float r) {
		radius =r;
		
	}
	float circle_area() {
		return 3.14f*(radius*radius);
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    rect o1 =new rect(2,5);
    System.out.println("area of rect : "+o1.rectangle_area());
    circle o2 =new circle(5);
    System.out.println("area of circle : "+o2.circle_area());
	}

}
