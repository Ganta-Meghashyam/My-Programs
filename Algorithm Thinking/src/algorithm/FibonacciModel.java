package algorithm;

public class FibonacciModel {

	public static int[] genfibonacciModel(int size) {
		int[] fibArray = new int[size];
		fibArray[0] = 0;
		fibArray[1] = 1;

		for (int i = 2; i < fibArray.length; i++) {
			fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
		}
		return fibArray;

	}

	public static int calcWordValue(String word) {
		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int sum = 0;
		int[] fibArray = genfibonacciModel(26);

		for (int i = 0; i < word.length(); i++) {
			sum += fibArray[alphabets.indexOf(word.charAt(i))];
		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcWordValue("MAN"));

	}

}
