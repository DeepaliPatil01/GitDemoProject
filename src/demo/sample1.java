package demo;

public class sample1 
{
	public static void main(String[] args) 
	{
		int num1=addition(10,20);
		System.out.println(num1);
		System.out.println("------");
		System.out.println(addition(5,6));
		sample1 s1=new sample1();
		int num2=s1.mult(5,6);
		System.out.println(num2);
		System.out.println("-----");
		System.out.println(s1.mult(11, 2));
		
		
	}
	public static int addition(int a, int b) 
	{
		int sum=a+b;
		return sum;
	}
	public int mult(int a, int b)
	{
		int mult=a*b;
		return mult;
	}
	}
