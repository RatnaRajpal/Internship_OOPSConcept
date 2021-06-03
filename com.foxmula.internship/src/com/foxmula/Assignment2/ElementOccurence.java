package com.foxmula.Assignment2;

import java.util.*;

public class Elementoccurence {
	
		void addElements(ArrayList<Integer> list,int n){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the elements to be inserted in a array ");
		for (int i=0;i<n;i++)
			list.add(sc.nextInt());
		
	}
	
	void checkOccurence(ArrayList<Integer> list) {
		
		HashMap<Integer,Integer> pair = new HashMap<Integer, Integer>();
		
		pair.put(list.get(0),1);  //inserting the first element o the list in the pair 
		for (int i=1;i<list.size();i++) 
			pair.put(list.get(i),(pair.get(list.get(i))==null) ? 1:pair.get(list.get(i))+1);
	    
		System.out.println("The frequency of elements= ");
		for (HashMap.Entry<Integer, Integer> i:pair.entrySet()) 
			System.out.println("("+i.getKey()+"-->"+i.getValue()+")");
		
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();  //considering only the integer elements
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the number of Elements you want to insert in an array: ");
		int n=sc.nextInt();
		Elementoccurence obj=new Elementoccurence();
		obj.addElements(list, n);
		obj.checkOccurence(list);
	
	}

}
