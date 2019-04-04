class SampleClass{

	int x = 0;
	static int y = 0;

	SampleClass(int m){
		this.x = m;
	}
	
	int getSum(){
		return (this.x + this.y);
	}
	
	static int getY(){
		return y;
	}
}


class VarArgs{
	
	public static void vaTest(int ... args){
		
		for(int i=0; i < args.length; ++i){
			System.out.print(args[i]);
		}
		System.out.println();
	}	// vaTest()
	
	
	public int testMethod(int a){
		return a;
	}
	
	public void testMethod(double a){
		System.out.println(a);
	}
}


public class Static{

	public static void main(String args[]){
		
		SampleClass class1 = new SampleClass(10);
		SampleClass class2 = new SampleClass(20);
		
		System.out.println("getY() = " + SampleClass.getY());
		System.out.println("class1.getSum() = " + class1.getSum());
		System.out.println("class2.getSum() = " + class2.getSum());
		
		SampleClass.y = 10;
		System.out.println("getY() = " + SampleClass.getY());
		System.out.println("class1.getSum() = " + class1.getSum());
		System.out.println("class2.getSum() = " + class2.getSum());

		VarArgs.vaTest(1, 2, 3);
		VarArgs.vaTest(4, 5, 6);
		
	}	// main()

}	// Static