package chg8;

public class Solution {
	public static int parseRomanNumerals(String input) {
		// M = 1000,D = 500,C = 100,L = 50,X = 10,V = 5,I = 1
		int sum = 0;
		int prevval = 0;
		StringBuilder build = new StringBuilder(input);
		for (int i = 0; i < build.length(); i++) {
			if (i == 0) {
				switch (build.charAt(i)) {
				case 'M':
					sum += 1000;
					prevval = 1000;
					break;
				case 'D':
					sum += 500;
					prevval = 500;
					break;
				case 'C':
					sum += 100;
					prevval = 100;
					break;
				case 'L':
					sum += 50;
					prevval = 50;
					break;
				case 'X':
					sum += 10;
					prevval = 10;
					break;
				case 'V':
					sum += 5;
					prevval = 5;
					break;
				case 'I':
					sum += 1;
					prevval = 1;
					break;
				default:
					break;
				}
			} else {
				if (build.charAt(i) == 'M') {
					if (prevval < 1000) {
						// meaning lower numeral here
						int num = 1000 - prevval;
						sum = sum - prevval;
						sum = num + sum;
						prevval = 1000;
					} else {
						sum += 1000;
						prevval = 1000;
					}
				} else if (build.charAt(i) == 'D') {
					if (prevval < 500) {
						// meaning lower numeral here
						int num = 500 - prevval;
						sum = sum - prevval;
						sum = num + sum;
						prevval = 500;
					} else {
						sum += 500;
						prevval = 500;
					}
				} else if (build.charAt(i) == 'C') {
					if (prevval < 100) {
						// meaning lower numeral here
						int num = 100 - prevval;
						sum = sum - prevval;
						sum = num + sum;
						prevval = 100;
					} else {
						sum += 100;
						prevval = 100;
					}
				} else if (build.charAt(i) == 'L') {
					if (prevval < 50) {
						// meaning lower numeral here
						int num = 50 - prevval;
						sum = sum - prevval;
						sum = num + sum;
						prevval = 50;
					} else {
						sum += 50;
						prevval = 50;
					}
				} else if (build.charAt(i) == 'X') {
					if (prevval < 10) {
						// meaning lower numeral here
						int num = 10 - prevval;
						sum = sum - prevval;
						sum = num + sum;
						prevval = 10;
					} else {
						sum += 10;
						prevval = 10;
					}
				} else if (build.charAt(i) == 'V') {
					if (prevval < 5) {
						// meaning lower numeral here
						int num = 5 - prevval;
						sum = sum - prevval;
						sum = num + sum;
						prevval = 5;
					} else {
						sum += 5;
						prevval = 5;
					}
				} else if (build.charAt(i) == 'I') {
					sum += 1;
					prevval = 1;
				}

			}

		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(Solution.parseRomanNumerals("XXI"));
	}

}
