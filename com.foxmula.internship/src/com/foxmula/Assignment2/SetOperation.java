package com.foxmula.Assignment2;
import java.util.*; 

public class SetOperation {
	Set<Integer> set = new HashSet<Integer>();
	
	void addElements(){
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the number of Elements you want to insert in an set: ");
		int n=sc.nextInt();
		
		System.out.println("Enter the elements to be inserted in a set ");
		for (int i=0;i<n;i++)
			set.add(sc.nextInt());
	}
	
	void checkElement(int n) {
		
		if (!set.isEmpty() && set.contains(n)){
			System.out.println("Element found.. ");
		}
		else
			System.out.println("Element not found..");
		
	}
	
	public static void main(String []args) {
			SetOperation s=new SetOperation();
			
			s.addElements();
			Scanner sc= new Scanner(System.in);
		
			System.out.print("Enter the element to be searched: ");
			int n=sc.nextInt();
			
			s.checkElement(n);
			
	}
}
