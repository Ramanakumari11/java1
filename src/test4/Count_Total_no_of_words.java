package test4;

public class Count_Total_no_of_words {
	public static void main(String args[]) {
	
	String words = "marolix Technologies of the solutions";
	int countWords = words.split("\\s").length;
	System.out.println("Number of words : " +countWords);

}
}
