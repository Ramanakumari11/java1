package test2;

import java.util.Scanner;

public class Comparing_Ages {

	public static void main(String[] args) {
		
		System.out.print("Enter the  age: ");

		    Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();

			if (age < 0) {
				System.out.println("Invalid age");

			} else if (age >= 0 && age <= 12) {
				System.out.println("Child");

			} else if (age >= 13 && age <= 19) {
				System.out.println("Teenager");
			
			}else if (age >= 20 && age <=64) {
				System.out.println("Adult");

			} else {
				System.out.println("Senior");

			}
			sc.close();
			  
		}
	}


	


