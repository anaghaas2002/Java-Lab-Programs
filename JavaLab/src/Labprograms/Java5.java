package Labprograms;



class AASection{
	int Namenum;
	int Age;
	int YOB;
	
	// Include constructors
    // Will not have a return type - "void" is also not allowed
	// Should be the same name as that class name
	// Call to the constructor will be implicit 
	
	AASection()
	{
		Namenum=0;
		Age=0;
		YOB=0;
	}
	
	AASection(int a,int b,int c){

		this.Namenum=a;
		this.Age=b;
		this.YOB=c;
		System.out.println("The Name is "+a+" Age is "+b+" YOB is "+c);
		
	}
	
	AASection(ASection obj)
	{
		this.Namenum=obj.Namenum;
		this.Age=obj.Age;
		this.YOB=obj.YOB;
		System.out.println("The Name is "+Namenum+" Age is "+Age+" YOB is "+YOB);
	}
	
	AASection returnobj()
	{
		AASection Kavana=new AASection(10,20,30);
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

class AASectionrowdies extends AASection{
	
	int rowdyno;
	int jailvisit;
	
	AASectionrowdies()
	{
		this.Namenum=0;
		this.Age=0;
		this.YOB=0;
		this.rowdyno=0;
		this.jailvisit=0;
	}
	AASectionrowdies(int a,int b,int c,int d,int e)
	{
		this.Namenum=a;
		this.Age=b;
		this.YOB=c;
		this.rowdyno=d;
		this.jailvisit=e;
		System.out.println("The Name is "+a+" Age is "+b+" YOB is "+c+ "   "+d+"   "+e);
	}
	AASectionrowdies(int a,int b,int c,int d)
	{
		super(a,b,c);
		this.rowdyno=d;
		this.jailvisit=0;
		System.out.println("The Name is "+a+" Age is "+b+" YOB is "+c+ "   "+d+"   "+this.jailvisit);
	}
	
	AASectionrowdies(int a,int b)
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

public class Java5 {

	public static void main(String[] args) {
	
		
		 
	   // Assigning object reference variables
		 
	    AASection Anagha=new AASection();
	    Anagha.Namenum=100;
	    AASection Bhavana=Anagha;
	    System.out.println(Bhavana.Namenum);
	    
	  
	    
	
	 
	 /* Method returning datatypes
	 
	*/	 AASection AnaghaAA=new AASection();
		 int sum=AnaghaAA.add(100, 100);
		 System.out.println(sum);
    
	 
		
		
	 /*  
	     Note Anagha
	  */ 
	  	 AASection Anaghaa=new AASection(99,99,99);
		 Anaghaa.showage();
	  
	 
		
	  /*
	   
	    See overloading methods and overloading constructors
	    
	  */
		
		 
	 /*    Objects as parameters
	  
	     AASection Anagha=new AASection(99,100,101);
		 AASection Bhavana=new AASection(Anagha);
	  
	  */
		
	    /*
	     
	        Returning objects
	      
	        AASection Anagha=new AASection();
	        AASection ob=Anagha.returnobj();
		    ob.showage();
		
	     */
		/*
		          INHERITANCE
		 	*/
		 AASectionrowdies Amrutha=new AASectionrowdies(1,1,1,1,1); 
		  
		  
	
		
		 
		/* A Superclass Variable Can Reference a Subclass Object
		 
		AASectionrowdies Anu=new AASectionrowdies();
		Anu.display(1,1,1);
		
		*/
		
		
	   
		
		/*
		       Using SUPER 
		
		 AASectionrowdies Amrutha=new AASectionrowdies(2,2,2,2); 
		
		*/
		 
		
		   /*
		     Method overriding   ----- Supports Java run time polymorphism
		     */
		    AASectionrowdies AmruthaA=new AASectionrowdies(3,3,3,3,3); 
		    AmruthaA.showage();
		
		   
		 
		  
		 
		
		
		
		
		
		
	}

}
