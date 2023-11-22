package test2;

import java.util.Scanner;

public class Integers {

	public static void main(String[] args) {
		
		System.out.print("Enter a integer: ");
		
		    Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			 
			 
			if (num > 0) {
 
			  System.out.println(num + " is positive.");
 
			} else if (num < 0) {
 
			  System.out.println(num + " is negative.");
 
			} else {
 
			  System.out.println(num + " is zero.");
 
			}
			sc.close();
		}
	 
	  }
	


