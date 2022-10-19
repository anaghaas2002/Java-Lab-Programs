package Labprograms;

public class Java8 {

	public static void main(String[] args) {
		try {
			
			int a=2;
			int d=20/a;
			if(a==0)
			{
				System.out.println("hello");
			}
			else
			{
				int c[]= {1};
				c[42]=99;
			}
			
		
		}
		//System.out.println("Error not detected");
		catch(ArrayIndexOutOfBoundsException obj)
		{
			System.out.println("Array index exception");
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Arithmatic exception");
		}
		
		

	}

}
