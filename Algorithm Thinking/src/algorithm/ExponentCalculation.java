package algorithm;

import java.util.Scanner;

public class ExponentCalculation {

	public static double calExponent(int base, int num) {

		double exp = Math.log10(num) / Math.log10(base);

		if (Math.ceil(exp) == Math.floor(exp)) {

			return exp;
		} else
			return -1;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter base value:");
		int base = sc.nextInt();

		System.out.println("Enter number:");
		int num = sc.nextInt();

		System.out.println(calExponent(base, num));

	}

}
