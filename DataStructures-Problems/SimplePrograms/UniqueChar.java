import java.util.Scanner;

class UniqueChar {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str;

		System.out.println("Enter the string");
		str = sc.next();

		System.out.println("The string contains unique characters: " + isUnique(str));
	}

	public static boolean isUnique(String str) {

		/* Assuming string contains only ASCII characters */
		boolean char_set[] = new boolean[256];

		for(int i=0; i<str.length(); i++) {
			int val = str.charAt(i);
			if(char_set[val]) {
				return false;
			}

			char_set[val] = true;
		}
		return true;
	}
}