package com.foxmula.Assignment2;

import java.util.*;

public class ArrayListPair {
	void addElements(ArrayList<Integer> list,int n){
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter the elements to be inserted in a array ");
		for (int i=0;i<n;i++)
			list.add(sc.nextInt());
		
	}
	
	
	void findpairs(ArrayList<Integer> list,int k) {
		
		//Iterator<Integer> iterator = list.iterator(); //iterator will iterate on the ArrayList
		HashMap<Integer,Integer> pair = new HashMap<Integer, Integer>();
		
		/*for (int i=0;i<list.size();i++) {
			for( int j=i+1;j<list.size();j++) {
				
			}
		}*/
		int count=0;
		for(int i: list)
			for(int j: list.subList(list.indexOf(i)+1,list.size()))
				if(i+j==k && !pair.containsKey(i) && !pair.containsValue(j))  //for the same key and value the pairs must not be repeated eg if two pairs of 1,4 are comming then only one will be included in the output
					pair.put(i,j);
		
			for (HashMap.Entry<Integer, Integer> i:pair.entrySet()) 
				System.out.println("Pair "+(++count)+": ("+i.getKey()+","+i.getValue()+")");
		
			if(count==0)
				System.out.println("No pairs found..");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();  //considering only the integer elements
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of Elements you want to insert in an array: ");
		int n=sc.nextInt();
		
		ArrayListPair arr=new ArrayListPair();
		arr.addElements(list, n);
		
		//for (int i =0;i<n;i++)
			//System.out.println(list.get(i));
		
		System.out.println("Enter the sum ");
		int k=sc.nextInt();
		
		arr.findpairs(list, k);
	}

}
