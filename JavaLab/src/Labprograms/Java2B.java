package Labprograms;

import java.util.Scanner;
public class Java2B {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int array[][]=new int[2][2];
		System.out.println("Enter the elements in the two D array :");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				
				array[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println("The elemnets in the two D array are:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				
				
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}