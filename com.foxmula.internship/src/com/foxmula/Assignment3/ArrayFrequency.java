package com.foxmula.Assignment3;

import java.util.*;

public class ArrayFrequency {

	void addElements(int arr[],int n){
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the elements to be inserted in an array ");
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}	
		
	}
	
	void checkOccurence(int arr[]) {
		
		HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
		
		for (int i=0;i<arr.length;i++) { 
			hashMap.put(arr[i],(hashMap.get(arr[i])==null) ? 1:hashMap.get(arr[i])+1);
			}
	    
		System.out.println("The frequency of elements= ");
		
		for (HashMap.Entry<Integer, Integer> i:hashMap.entrySet()) {
			System.out.print("("+i.getKey()+"-->"+i.getValue()+")  ");
		}
				
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the number of Elements you want to insert in an array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		ArrayFrequency freq=new ArrayFrequency();
		freq.addElements(arr, n);
		freq.checkOccurence(arr);
	
		}
}
