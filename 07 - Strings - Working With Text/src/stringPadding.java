//padding a String
//Input: str = “PaddingString”, ch =’-‘, L = 20
//Output:
//Left Padding: -------PaddingString
//Right Padding: PaddingString-------

import java.lang.*; 
import java.io.*; 

public class padString { 

	// Function to perform left padding 
	public static String leftPadding(String input, char ch, int L) 
	{ 
		String result = String.format("%" + L + "s", input).replace(' ', ch); 
		// Returning the result
		return result; 
	}
	
	// Function to perform right padding 
	public static String rightPadding(String input, char ch, int L) 
	{
		String result = String.format("%" + (-L) + "s", input).replace(' ', ch); 

		// Returning the result
		return result; 
	} 

	public static void main(String[] args) 
	{ 

		String str = "StringPadding"; 
		char ch = '-'; 
		int L = 20; 

		System.out.println(leftPadding(str, ch, L)); 
		System.out.println(centerPadding(str, ch, L));
		System.out.println(rightPadding(str, ch, L)); 
	} 
} 
