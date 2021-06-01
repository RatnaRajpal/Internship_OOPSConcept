package com.foxmula.Assignment2;

import java.util.*;

public class TraverseTreeSet {
	void addElements(TreeSet<String> sets,int n) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the elements to be inserted in a HashSet ");
		for (int i=0;i<n;i++)
			sets.add(sc.nextLine());
	}
	void traversal(TreeSet<String> sets) {
		//using for each loop
		Iterator<String> iterator = sets.iterator();
		
		while(iterator.hasNext())
		System.out.println(iterator.next());; 
        
	}
	public static void main(String []args) {
		TreeSet<String> sets=new TreeSet();
		TraverseTreeSet ts=new TraverseTreeSet();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of Elements you want to insert in an TreeSet: ");
		int n=sc.nextInt();
		
		ts.addElements(sets, n);
		
		System.out.println("***********TREESET************");
		ts.traversal(sets);
		
	}
}
