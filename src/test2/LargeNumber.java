package test2;

import java.util.Scanner;

public class LargeNumber {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    
			System.out.print("Enter integer A: ");
			int A = sc.nextInt();
			System.out.print("Enter integer B: ");
			int B =sc.nextInt();
			System.out.print("Enter integer C: ");
			int C= sc.nextInt();
			
			if(A>=B && A>=C) {  
				System.out.println(A+" is the largest Number");  
				//comparing B with A and B with  C 
				//if both conditions are true, prints B
			
			} else if (B>=A && B>=C) {  
				System.out.println(B+" is the largest Number");
				
			}	else 
					  
				System.out.println(C+" is the largest number");
		 
			  sc.close();
	  }

	}


