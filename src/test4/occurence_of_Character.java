package test4;

public class occurence_of_Character {

	public static void main(String[] args) {
			String str = "marolix Technologies";
			System.out.println(str);
		 
			int count = str.length() - str.replace("o", "").length();
			System.out.println("occurrence of 'o': "+count);
		}
	

	}


