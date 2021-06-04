package com.foxmula.Assignment3.Question2;

import java.util.Scanner;

public class OddException {
	
	//check for prime number
	boolean isPrime(int num) {
				
		for(int i=2;i<num/2;i++) {
			if(num%i == 0 ) {
				System.out.println("Not Prome");
			
				return false;
		}
		}
		
		return true;
	}
	
	void check(int num) throws CustomException{  
		
		//since 2 is the only prime no the condition can also be framed as if(num !=2 && isPrime(num))
		//since 1 is not a prime number it is an odd number so we are checking the condition here only 
	     if(num%2!=0 && num>1 && isPrime(num)) {  
	    	 throw new CustomException("Number is Invalid!"); 
	     }
	     
	     else  
	    	 System.out.println("The number is valid!"); 
	      
	   }  
	     
	   public static void main(String args[]){  
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter the number:"); 
		 
	      try{  
	      new OddException().check(sc.nextInt());  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	 
	  }  
}
