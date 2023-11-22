package test2;

import java.util.Scanner;

public class Evenodd {
	 
	public static void main(String[] args) {
	
		 System.out.print("Enter a number:");
		 
            Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
     
				if(n % 2 == 0) {
				    System.out.println(n + " is even");
				    
				} else
				    System.out.println(n + " is odd");
		
		sc.close();
}
    
}
	


