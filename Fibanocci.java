package week1.assignments;

public class Fibanocci {

	public static void main(String[] args) {
		// Fibonocci series till a given number

		int range = 8;
		int prev_value = 0;
		int next_value = 1;
		
		System.out.print(prev_value + " " + next_value + " ");
		
		for (int i = 2; i < range; i++) {
			int new_value = prev_value + next_value;
			System.out.print(new_value + " ");
			prev_value = next_value;
			next_value = new_value;
				
		}
	}

}
