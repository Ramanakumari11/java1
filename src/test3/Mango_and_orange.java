package test3;

public class Mango_and_orange {

	public static void main(String[] args) {
		 System.out.println("\nDivided by 3: ");
	        for (int i = 1; i < 50; i++) {
	            if (i % 3 == 0)
	                System.out.print(i + " is Mango\n");
	        }

	        // Print numbers divided by 5
	        System.out.println("\n\nDivided by 5: ");
	        for (int i = 1; i < 50; i++) {
	            if (i % 5 == 0)
	                System.out.print(i + " is Orange\n ");
	        }

	        // Print numbers divided by both 3 and 5
	        System.out.println("\n\nDivided by 3 & 5: ");
	        for (int i = 1; i < 50; i++) {
	            if (i % 3 == 0 && i % 5 == 0)
	                System.out.print(i + " is Mango and Orange\n ");
	        }
	        System.out.println("\n");
	    }
	

	}


