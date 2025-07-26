package week2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// Find the palindrome

		int input = 121;
		int originalInput = input;
		String output = "";
		int rem = 0;

		for (int i = 0; i < 3; i++) {
			rem = input % 10;
			output = output + String.valueOf(rem);
			if (input >= 10) {
				input = input / 10;
			} else {
				input = input % 10;
			}
		}

		if (originalInput == Integer.valueOf(output)) {
			System.out.println(output + " is Palindrome");
		} else {
			System.out.println("Number is not a Palindrome");
		}

	}

}
