import java.io.*;
class Calculate
{
	int sq,cu,po,sum;
	void calculate(int n, char ch) 
	{
		if(ch=='s')
		{
			sq = n*n;
			System.out.println("Square of the integer " + n + " is " + sq);
		}
		else
		{
			cu = n*n*n;
			System.out.println("Cube of the integer" + n + "is" + cu);
		}
	}
	void calculate(int n, int m, char ch)
	{
		if(ch=='p')
		{
			po = n*m;
			System.out.println("Product of the integers " + n + "," + m + " is " + po);
		}
		else
		{
			sum = n+m;
			System.out.println("Sum of the integers" + n + "is" + sum);
		}
	}
	void calculate(String str1, String str2) 
	{
		if(str1.compareTo(str2) == 0)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
	}
}
class CalcDemo
{
	public static void main(String args[]) throws IOException
	{
		int n,m;
		char ch;
		String str1,str2;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Calculate c1=new Calculate();
		c1.calculate(2,'s');
		Calculate c2=new Calculate();
		c2.calculate(2,4,'p');
		System.out.println("Enter first string:");
		str1=br.readLine();
		System.out.println("Enter second string:");
		str2=br.readLine();
		Calculate c3=new Calculate();
		c3.calculate(str1,str2);
	}
}
