//Converting Snake Case string to Camel Case.
//Input: str = "snake_case_to_camel_case"
//Output: "SnakeCaseToCamelCase"

import java.io.*; 
class SnakeTOCamel { 

	// Function to convert snake case to camel case	 
	public static String 
	snakeToCamel(String str) 
	{ 
		// Capitalizing first letter of string 
		str = str.substring(0, 1).toUpperCase() + str.substring(1); 
		StringBuilder builder = new StringBuilder(str);
		// Traversing the string character by 
		// character and remove underscore 
		// and capitalize next letter 
		for (int i = 0; i < builder.length(); i++) { 

			// Checking char is underscore 
			if (builder.charAt(i) == '_') { 

				builder.deleteCharAt(i); 
				builder.replace(i, i + 1,String.valueOf(Character.toUpperCase(builder.charAt(i)))); 
			} 
		} 
		// Returning in String type 
		return builder.toString(); 
	}
	public static void main(String[] args){ 

		// Given String 
		String str = "snake_to_camel"; 
		// Function Call 
		str = snakeToCamel(str);
		// Modified String 
		System.out.println(str); 
	} 
} 
