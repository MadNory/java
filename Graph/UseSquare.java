public class UseSquare
{
	public static void main(String[] args)
	{
		Square s1 = new Square();
		s1.draw();
		s1.size = 5;
		s1.draw();
		s1.pattern = '&';
		s1.draw();
	}
}