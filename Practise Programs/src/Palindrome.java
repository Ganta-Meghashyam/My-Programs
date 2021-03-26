import java.util.Scanner;

public class Palindrome {

	public static int isPalindrome(int num) {

		int digit;
		int reverse = 0;
		while (num > 0) {
			digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		return reverse;
	}

	public static boolean Checkpalindrome(int num) {
		if (num == isPalindrome(num)) {
			return true;
		}
		return false;
	}

	public static boolean isOddDigits(int num) {
		if (isPalindrome(num) % 2 == 0) {
			return false;
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num:");
		int num = sc.nextInt();

		if (Checkpalindrome(num) && isOddDigits(num)) {
			System.out.println(num + " is a odd palindrome");
		} else
			System.out.println(num + " is not a odd palindrome");

	}

}
