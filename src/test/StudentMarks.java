package test;

public class StudentMarks {

	public static void main(String[] args) {
		
		int Marks = 18;
		
		if( Marks < 45 && Marks >= 35) {
			System.out.println(" p ");
		}
		
		else if( Marks < 60 && Marks >= 45) {
			System.out.println(" d ");
		}
		
		else if( Marks >=0 && Marks < 35) {
			System.out.println(" f ");
		}
		
		else if( Marks < 70 && Marks >=60) {
			System.out.println(" c ");
		}
		
		else if( Marks < 85 && Marks >= 70) {
			System.out.println(" b ");
		}
		
		else if( Marks < 95 && Marks >= 85) {
			System.out.println(" a ");
		}
		
		else if( Marks <= 100 && Marks >= 95) {
			System.out.println(" o ");
		}
		
		else if(Marks > 100)
		{
			System.out.println(" Invalid ");
		}
	}

}
