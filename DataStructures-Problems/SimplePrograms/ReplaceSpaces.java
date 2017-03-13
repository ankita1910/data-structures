/* Write a method to replace all spaces in a string with ‘%20’ */

/* Count the spaces and increase the length of string accordingly by a factor of 2
	Traverse the string from backwards. Traverse the original string from backwards 
	And replace space in string with %20. Loop will run only till the old length is reached. */

import java.util.Scanner;

class ReplaceSpaces {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String str;
		System.out.println("Enter the string");
		str = sc.nextLine();
		char[] char_str = str.toCharArray();
		replace(char_str);
	}

	public static void replace(char[] str) {
		int spaceCount = 0;
		int length = str.length;
	
		for(int i=0; i<length; i++) {
			if(str[i] == ' ') {
				spaceCount++;
			}
		}

		int newLength = length + spaceCount * 2;
		// str[newLength] = '\0';
		for(int i = length - 1; i >= 0; i--) {
			if(str[i] == ' ') {
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				str[newLength - 1] = str[i];
				newLength = newLength - 1;
			}
		}

		System.out.println("Updated string is " + new String(str));
	}
}