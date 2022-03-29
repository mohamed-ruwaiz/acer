package myjava1;
class Overloading{
    //Square
    int area(int side)
    {
        return side*side;
    }
    //Rectangle
    float area(int length,float breadth)
    {
        return (float)length*breadth;
    }
    //Circle
    float area(float radius)
    {
        return 2*3.14f*radius*radius;
    }
  
}

public class OverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int side=4;
		        int length=5;
		        int breadth=3;
		        float radius=2.5f;
		        Overloading overload=new Overloading();
		        System.out.println("Area of Square : "+overload.area(side));
		        System.out.println("Area of Rectangle : "+overload.area(length,breadth));
		        System.out.println("Area of Circle : "+overload.area(radius));
		       
		    }
		}

		/*
		If a two methods have same number of variables in same order with same return type -->
		 then these two methods cannot overload with different return types
		If there are same no.of parameters in different order with same return type -->
		 Overloads with same and different return types

		 */
	


