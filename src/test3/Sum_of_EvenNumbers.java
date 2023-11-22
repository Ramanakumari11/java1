package test3;

public class Sum_of_EvenNumbers {
	
	  public static void main(String[] args) {
	        
	        int sum =0;
	        
	        for(int i = 1; i <= 30; i++) {
	                  
	            if(i % 2 == 0) {
	                sum = sum + i;
	            }
	        }
	        
	        System.out.println("The sum of all even numbers between 1 to 30  is : " + sum);
	     
	    }    
	}




