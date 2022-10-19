package Labprograms;

interface test{
	void square();
}

class arithmetic implements test{
	
	int a;
	arithmetic()
	{
		a=10;
	}
	public void square()
	{
		System.out.println("HII I AM A SQUARE");
	}
}
class testint implements test{
	int b;
	testint()
	{
		b=10;
	}
	public void square()
	{
		System.out.println("HII I AM A SQUARE OF TESTINT");
	}
}

public class Java7 {

	public static void main(String[] args) {
	
		arithmetic ob = new arithmetic ();
		ob.square();
		
		testint ob1 = new testint();
		ob1.square();
		
		test ob3 = new arithmetic();
		ob3.square();
		

	}

}
