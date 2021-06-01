package com.foxmula.Assignment2;

import java.util.*;

public class TraverseHashSet {
	void addElements(HashSet<String> sets,int n) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the elements to be inserted in a HashSet ");
		for (int i=0;i<n;i++)
			sets.add(sc.nextLine());
	}
	
	void traversal(HashSet<String> sets) {
		//using for each loop
		for (String i : sets) 
            System.out.println(i); 
        
	}
	
	public static void main(String []args) {
		HashSet<String> sets=new HashSet();
		TraverseHashSet hs=new TraverseHashSet();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of Elements you want to insert in an HashSet: ");
		int n=sc.nextInt();
		
		hs.addElements(sets, n);
		
		System.out.println("***********HASHSET************");
		hs.traversal(sets);
		
	}
}
