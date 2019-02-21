class Square
{
	int size = 2;
	char pattern = '*';
	
	void draw()
	{
		for (int row = 1; row <= size; ++row)
		{
			for (int col = 1; col <= size; ++col)
			{
				System.out.print(pattern);
			}
			System.out.println();
		}
	}
}