package test2;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);
			int price= 10;
			 System.out.print("Enter the quantity : ");
			 int quantity = sc.nextInt();
			 
			 if(quantity <= 10 ) {
				 System.out.println("Discount not applied");
				 int cost = (quantity * price);
				 System.out.println("cost of the product : " + cost);
				 
			 } else {
				 System.out.println("Discount applied");
				int cost = (quantity * price)-(quantity*price/10);
			  
				System.out.println("cost of the product: " + cost);
			 }	
	       sc.close();
			 
		}
		
		 
	}


