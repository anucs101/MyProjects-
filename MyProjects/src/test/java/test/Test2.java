package test;

public class Test2 

{
	String name;
	int b;
	public static void display()
	{
		
		System.out.println("hiiiii");
	}
	
	Test2()
	{
		this(10);
		name = "anu"; 
		System.out.println("inside default");
	}
	Test2(int a)
	{
		b =a;
		System.out.println("parameterized");
	}
	void details(int a,int b)
	{
		//this.rec();
		System.out.println("print");
	}
	void details(int c)
	{
		System.out.println("start");
	}
	
	public void same()
	{
		System.out.println();
	}
	
	

}
