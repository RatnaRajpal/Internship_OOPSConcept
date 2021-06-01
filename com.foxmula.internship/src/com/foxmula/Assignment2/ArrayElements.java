package com.foxmula.Assignment2;
import java.util.*; 
public class ArrayElements {
	
	public static void main(String []args) {
		ArrayList<Integer> list=new ArrayList<Integer>();  //considering only the integer elements
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the number of Elements you want to insert in an array: ");
		int n=sc.nextInt();
		
		System.out.println("Enter the elements to be inserted in an array ");
		for (int i=0;i<n;i++)
			list.add(sc.nextInt());
		
		System.out.print("Enter the element to be searched: ");
		n=sc.nextInt();
		
		//contains() check whether an element is present in the list or not
		if(!list.isEmpty() && list.contains(n)) {
			System.out.println("Element found at location "+ (list.indexOf(n)+1));
		}
		else
			System.out.println("Element not found..");
		
	}
}
