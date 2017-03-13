/* Solution 1: Sort the strings and check if they are equal 
   Solution 2: Count the occurences of all the unique characters in one string 
   and check if they are present in same number in the other string. Also all the unique characters
   must be present in the other string. */

import java.util.Scanner;

class Anagrams {
	public static void main(String args[]) {
		String s,t;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		s = sc.next();

		System.out.println("Enter the second string");
		t = sc.next();

		System.out.println("Two strings are anagrams: " + checkAnagrams(s, t));
	}

	public static boolean checkAnagrams(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}

		int letters[] = new int[256];
		int num_unique_chars = 0;
		int completed_chars_t = 0;
		char[] s_array = s.toCharArray();

		/* Populating count of occurences of unique elements in s in array letters */
		for(char c: s_array) {
			if(letters[c] == 0) {
				num_unique_chars++;
			}
			letters[c]++;
		}

		/* Checking is the character is present in letters, if it is not present return false
		If its present, decrease its count by 1
		If we have evaluated a particular character count, ie letters value of that char is 0,
		increment completed_chars_t by 1
		If unique and completed chars count is same and we have reached the end of string t, 
		both the strings are anagrams. */
		
		for(int i=0; i<t.length(); i++) {
			int c = (int)t.charAt(i);
			if(letters[c] == 0) {
				return false;
			}
			--letters[c];

			if(letters[c] == 0) {
				completed_chars_t++;

				if(completed_chars_t == num_unique_chars) {
					return i == (t.length() - 1);
				}
			}
		}
		return false;
	}
}