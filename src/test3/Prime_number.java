package test3;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
	
		  int count = 0;
	      
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter a number to check prime or not : ");
	      
	      int num = sc.nextInt();
	      
	      if(num == 2) {
	         System.out.println(num + " is a prime number");
	      } else {
	         // checking number of factors
	         for(int i = 1; i <= num; i++) {
	            if(num % i == 0) {
	               count++;
	            }
	         }
	         // checking number of counts to print result
	         if(count == 2) {
	            System.out.println(num + " is a prime number");
	         } else {
	            System.out.println(num + " is not a prime number");
	         }
	      }
	      sc.close();
	}
	

}
