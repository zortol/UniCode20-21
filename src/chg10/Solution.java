package chg10;

public class Solution {
	public static Boolean isPrime(int input) {
		int counter = 0;
		if (input > 1) {
			for (int i = 2; i <= input; i++) {
				counter = i;
				if (input % i == 0) {
					break;
				}
			}
			if (counter == input) { // means input was only divisible by itself
				return true;
			} else {
				return false;
			}

		} else {
			
			return false;
		}
	}

	public static void main(String[] args) {
		// 10 % 1 == 0
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i + " IS PRIME? " + Solution.isPrime(i));
		}
		System.out.println(Solution.isPrime(4));
	}

}
