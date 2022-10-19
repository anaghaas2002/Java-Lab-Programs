package Labprograms;



class ASection{
	int Namenum;
	int Age;
	int YOB;
	
	// Include constructors
    // Will not have a return type - "void" is also not allowed
	// Should be the same name as that class name
	// Call to the constructor will be implicit 
	
	ASection()
	{
		Namenum=0;
		Age=0;
		YOB=0;
	}
	
	ASection(int a,int b,int c){

		this.Namenum=a;
		this.Age=b;
		this.YOB=c;
		System.out.println("The Name is "+a+" Age is "+b+" YOB is "+c);
		
	}
	
	ASection(ASection obj)
	{
		this.Namenum=obj.Namenum;
		this.Age=obj.Age;
		this.YOB=obj.YOB;
		System.out.println("The Name is "+Namenum+" Age is "+Age+" YOB is "+YOB);
	}
	
	ASection returnobj()
	{
		ASection Kavana=new ASection(10,20,30);
		return Kavana;
	}
	
	void display(int a,int b,int c)
	{
		this.Namenum=a;
		this.Age=b;
		this.YOB=c;
		System.out.println("The Name is "+a+" Age is "+b+" YOB is "+c);
		
	}
	
	void showage()
	{
		System.out.println("The age is "+Age);
	}
	int add(int a,int b)
	{
		this.Namenum=a;
		this.Age=b;
		return a+b;
		
	}
	
}

class ASectionrowdies extends ASection{
	
	int rowdyno;
	int jailvisit;
	
	ASectionrowdies()
	{
		this.Namenum=0;
		this.Age=0;
		this.YOB=0;
		this.rowdyno=0;
		this.jailvisit=0;
	}
	ASectionrowdies(int a,int b,int c,int d,int e)
	{
		this.Namenum=a;
		this.Age=b;
		this.YOB=c;
		this.rowdyno=d;
		this.jailvisit=e;
		System.out.println("The Name is "+a+" Age is "+b+" YOB is "+c+ "   "+d+"   "+e);
	}
	ASectionrowdies(int a,int b,int c,int d)
	{
		super(a,b,c);
		this.rowdyno=d;
		this.jailvisit=0;
		System.out.println("The Name is "+a+" Age is "+b+" YOB is "+c+ "   "+d+"   "+this.jailvisit);
	}
	
	ASectionrowdies(int a,int b)
	{
		super.Age=a;
		Age=b;
	}
	
	void showage()
	{
		//this.Age=Age;
		//System.out.println()
		System.out.println("Jail visit is : "+jailvisit);
		//System.out.println("Age in superclass :"+super.Age);
	}
	
}

public class Java4 {

	public static void main(String[] args) {
	
		
		 
	   // Assigning object reference variables
		 
	    ASection Anagha=new ASection();
	    Anagha.Namenum=100;
	    ASection Bhavana=Anagha;
	    System.out.println(Bhavana.Namenum);
	    
	  
	    
	
	 
	 /* Method returning datatypes
	 
		 ASection Anagha=new ASection();
		 int sum=Anagha.add(100, 100);
		 System.out.println(sum);
    
	 */
		
		
	 /*  
	     Note Anagha
	  */ 
	  	 ASection Anaghaa=new ASection(99,99,99);
		 Anaghaa.showage();
	  
	 
		
	  /*
	   
	    See overloading methods and overloading constructors
	    
	  */
		
		 
	 /*    Objects as parameters
	  
	     ASection Anagha=new ASection(99,100,101);
		 ASection Bhavana=new ASection(Anagha);
	  
	  */
		
	    /*
	     
	        Returning objects
	      
	        ASection Anagha=new ASection();
	        ASection ob=Anagha.returnobj();
		    ob.showage();
		
	     */
		/*
		          INHERITANCE
		 
		  ASectionrowdies Amrutha=new ASectionrowdies(1,1,1,1,1); 
		  
		  
		*/
		
		 
		/* A Superclass Variable Can Reference a Subclass Object
		 
		ASectionrowdies Anu=new ASectionrowdies();
		Anu.display(1,1,1);
		
		*/
		
		
	   
		
		/*
		       Using SUPER 
		
		 ASectionrowdies Amrutha=new ASectionrowdies(2,2,2,2); 
		
		*/
		 
		
		   /*
		     Method overriding   ----- Supports Java run time polymorphism
		     */
		    ASectionrowdies Amrutha=new ASectionrowdies(3,3,3,3,3); 
		    Amrutha.showage();
		
		   
		 
		  
		 
		
		
		
		
		
		
	}

}
