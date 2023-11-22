package test5;

import java.util.Scanner;

public class Reverse1 {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		
		String[] words= str.split(" ");
		
		
		for(int i= 0;i <words.length ;i++) {
			StringBuffer sb=new StringBuffer(words[i]);
			//String reversedword = sb.reverse().toString();
			System.out.print(sb.reverse().toString()+" ");
			
		}
		
		
		
	}

}
