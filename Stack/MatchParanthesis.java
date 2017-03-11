import java.util.Scanner;

class MatchParanthesis {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the expression");
		String exp = sc.nextLine();

		IntStack stack = new IntStack();

		for(int i=0; i<exp.length(); i++) {
			char c = exp.charAt(i);

			if(c == '(') {
				stack.push(c);
			} else if(c == ')') {
				if(!stack.isEmpty()) {
					char lastInserted = (char)stack.peek();
					if(lastInserted == '(') {
						stack.pop();
					} else {
						System.out.println("Unmatched paranthesis");
						return;
					}
				} else {
					System.out.println("Unmatched paranthesis");
					return;
				}
			}
		}
		if(stack.isEmpty()) {
			System.out.println("paranthesis matched");
		} else {
			System.out.println("Unmatched paranthesis");
		}
	} 
}