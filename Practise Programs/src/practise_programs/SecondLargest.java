package practise_programs;

public class SecondLargest {

	public static int secondMax(int arr[], int size) {

		int temp;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		return arr[size - 5];

	}

	public static void printArray(int arr[], int size) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondLargest s1 = new SecondLargest();
		int arr[] = { 4, 5, 8, 3, 76, 23 };
		System.out.println(secondMax(arr, 6));
//		s1.secondMax(arr, 6);
		s1.printArray(arr, 6);

	}

}
