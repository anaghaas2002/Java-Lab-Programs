package Labprograms;

import java.util.Scanner;


class Student{
	String USN;
	String Name;
	String Branch;
	String Phone;
	
	void display()
	{
		
		System.out.println("The USN of student is "+USN);
		System.out.println("The Name of student is "+Name);
		System.out.println("The Branch of student is "+Branch);
		System.out.println("The Phone of student is "+Phone);
		
	}
	void records(String USN,String Name,String Branch,String Phone)
	{
		this.USN=USN;
		this.Name=Name;
		this.Branch=Branch;
		this.Phone=Phone;
	}
	
}
public class Java3A {
public static void main(String[] args) {
	
	
	Student obj[]=new Student[100];//note ANAGHA
	
Scanner sc=new Scanner(System.in);
	
System.out.println("Enter the number of students");
int n=sc.nextInt();
	for(int j=0;j<n;j++)
	{
		obj[j]=new Student();
	}
	
	for(int i=0;i<n;i++)
	{
		
		
		System.out.println("Enter the USN of student "+(i+1)+" :");
		String USN=sc.next();
		System.out.println("Enter the Name of student "+(i+1)+" :");
		String Name=sc.next();
		System.out.println("Enter the Branch of student "+(i+1)+" :");
		String Branch=sc.next();
		System.out.println("Enter the Phone of student "+(i+1)+" :");
		String Phone=sc.next();
		obj[i].records(USN, Name, Branch, Phone);
		
	}
	for(int i=0;i<n;i++)
	{
		obj[i].display();
	}
	
	

}

}
