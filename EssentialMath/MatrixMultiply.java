class rA{
	
	int[][] arry;
	
	rA(int rows, int cols){
		arry = new int[rows][cols];
		for(int i=0; i < rows; ++i){
			for(int j=0; j < cols; ++j)
				arry[i][j] = 0;
		}
	} 
}

public class MatrixMultiply
{
	private static final short ROWS = 2;
	private static final short COLS = 2;

	public static void main(String[] args)
	{
		rA[] aOfAs = {new rA(5,6), new rA(2,3), new rA(3,4)};
		
		for (int i=0; i < aOfAs.length; ++i){
			printArray(aOfAs[i].arry);
			System.out.println();
		}
		
		
		rA a = new rA(3, 5);
		
		System.out.println("i = " + a.arry.length);
		System.out.println("j = " + a.arry[0].length);
		
		printArray(a.arry);
	
	/*
	int[][] a = {{1,2},{3,4}};
		int[][] b = {{5,6},{0,-1}};
		int[][] c = new int[ROWS][COLS];
		
		createArrays();
		
		printArray(a);
		
		System.out.println();
	
		printArray(b);
		
		for (short i = 0; i < ROWS; ++i){
			for (short j = 0; j < COLS; ++j){
				c[i][j] = 0;
			}
		}

		for(short i = 0; i < COLS; ++i)	// col
		{
			for(short j = 0; j < ROWS; ++j)		// row
			{
				for (short k = 0; k < ROWS; ++k){	// 
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		System.out.println();

		printArray(c);
*/
	}
	
	
	private static void printArray(int[][] arr)
	{
		for(short i = 0; i < arr.length; ++i){
			for (short j = 0; j < arr[0].length; ++j){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}