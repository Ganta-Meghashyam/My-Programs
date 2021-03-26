
public class Array {

	public static boolean isPrime(int num) {

		if (num == 1)
			return false;

		if (num == 2)
			return true;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static String genPrime(int start, int end) {

		String res = " ";

		for (int num = start; num <= end; num++) {
			if (isPrime(num))
				res += num + " ";
		}
		return res;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(genPrime(1, 100));

	}

}
