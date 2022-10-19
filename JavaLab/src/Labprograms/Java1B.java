package Labprograms;

public class Java1B {
	 public static void main(String[] args)
	 {
		 
		 int n=10;
		 int i,j;
		 int count;
		 for(i=2;i<=n;i++)
		 {   count=0;
			 for(j=2;j<=i/2;j++)
			 {
				 if(i%j==0)
				 {
					 count=1;
					 break;
				 }
				 
			 }
			 if(count==0)
			 {
				 System.out.println(i);
			 }
		 }
	 }
	}