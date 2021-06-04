package com.foxmula.Assignment3;

import java.util.*;


public class ArrayFrequencySort {
	
	void addElements(int arr[],int n){
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the elements to be inserted in an array ");
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}	
	}
	
	void sortByValue(HashMap<Integer,Integer> hashMap) {
	
		 // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(hashMap.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
        	@Override
            public int compare(Map.Entry<Integer, Integer> ele1,
                               Map.Entry<Integer, Integer> ele2)
            {
                return (ele1.getValue()).compareTo(ele2.getValue());
            }
        });
        
        for (Map.Entry<Integer, Integer> out : list) {
        	System.out.print("("+out.getKey()+"-->"+out.getValue()+")  ");
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
		
		System.out.println("\nThe sorted array is: ");
		sortByValue(hashMap);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the number of Elements you want to insert in an array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		ArrayFrequencySort tosort=new ArrayFrequencySort();
		tosort.addElements(arr, n);
		tosort.checkOccurence(arr);
	
		}

}
