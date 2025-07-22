package week1.assignments;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputNumber = 37;
		
		for (int i=2; i <= inputNumber-1; i++) {
			if (inputNumber % i == 0) {
				System.out.println("Number is not prime");
				break;
			}
			else {
				System.out.println("Number is prime");
				break;
			}
		}

	}

}
