package test3;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String[ ] arg)
	{
	String str;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string : ");
	str=sc.nextLine();	
	System.out.print("Reversed String of '"+str+"' is  : "); 
	for(int i=str.length();i>0;--i)
	{
	System.out.print(str.charAt(i-1)); 
	}
	sc.close();
}
}


