package graphics;
interface Graphics
{
	public float area(float x,float y);
}
class Square implements Graphics
{
	public float area(float x,float y)
	{
		return(x*x);
	}
}
class Rectangle implements Graphics
{
	public float area(float x,float y)
	{
		return(x*y);
	}
}
class Triangle implements Graphics
{
	public float area(float x,float y)
	{
		return((x*y)/2);
	}
}
class Circle implements Graphics
{
	public float area(float x,float y)
	{
		return(3.14f*x*x);
	}
}






package graphics;
public class Area
{
public static void main(String args[])
	{
		Square s=new Square();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Circle c=new Circle();
		System.out.println("Area of square: "+s.area(4,0));
		System.out.println("Area of rectangle: "+r.area(2,4));
		System.out.println("Area of triangle: "+t.area(4,8));
		System.out.println("Area of circle: "+c.area(2,0));
	}
}
   