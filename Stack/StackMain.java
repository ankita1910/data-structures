class StackMain {
	public static void main(String args[]) {

		IntStack intStack = new IntStack();
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		intStack.push(4);

		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
	}
}