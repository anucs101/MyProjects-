package test;

public class Test3
{

	public static void main(String[] args)
	{
		Test2.display();
		Test2 t1 = new Test2();
		System.out.println(t1.name);
	//	Test2 t2 = new Test2(2);
		System.out.println(t1.b);
		t1.details(2,3);
		t1.details(10);
		
	}

}
