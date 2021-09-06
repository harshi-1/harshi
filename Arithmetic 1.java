package arithmetic;
interface Arithmetic
{
	public int Add(int a,int b);
	public int Sub(int a,int b);
	public int Multi(int a,int b);
	public int Div(int a,int b);
	
}
class TestPackage implements Arithmetic
{ 
	public int Add(int a,int b)
	{
		return(a+b);
	}
	public int Sub(int a,int b)
	{
	return(a-b);
	}
	public int Multi(int a,int b)
	{
	return(a*b);
	}
	public int Div(int a,int b)
	{
	return(a/b);
    }
}

package arithmetic;
public class Operations
{
	public static void main(String args[])
	{
		TestPackage ob1=new TestPackage();
		System.out.println("Addition: "+ob1.Add(10,10));
		System.out.println("Subtraction: "+ob1.Sub(10,10));
		System.out.println("Multiplicatio: "+ob1.Multi(10,10));
		System.out.println("Division: "+ob1.Div(10,10));
	}
}
		
		