package Labprograms;

class My extends Exception{
	
	private int detail;
	My(int detail)
	{
		this.detail=detail;
	}
	public String toString()
	{
		return "Myself[ +detail+ ]";
	}
}


public class Java9 {

	static void compute(int a) throws My{
		System.out.println("HELLLLLO ANAGHAAAAAA");
		if(a>10)
		{
			throw new My(a);
		}
		System.out.println("2345677888");
	}
	
	public static void main(String[] args) {
		try {
			compute(1);
			compute(20);
		}
		catch (My e)
		{
			System.out.println("hiii "+e);
		}

	}

}

