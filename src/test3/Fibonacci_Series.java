package test3;

public class Fibonacci_Series {
	public static void main(String[] args) {
	
	 int n = 10, firstnum = 0, secondnum = 1;
	 {
	      for (int i = 1; i <= n; ++i) {
	      System.out.print(firstnum + "  ");

	      
	      int nextnum = firstnum + secondnum;
	      firstnum  = secondnum;
	      secondnum = nextnum;
	    }
	  
	}
  }
}
