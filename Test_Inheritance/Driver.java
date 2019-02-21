public class Driver
{
	public static void main(String[] args)
	{
		Base b = new Base();
		Subclass s = new Subclass();
		b.printNumber();
		s.printNumber();
		
		b = s;
		//s = b;
		b.printNumber();
		
		System.out.println(b.getClass());
		Object o = new Object();
		System.out.println(o.getClass());
		
	}
}