package practise_programs;

public class reverse {

	public void reverseArray(int arr[], int start, int end) {

		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public void printArray(int arr[], int size) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 4, 6, 8, 20, 15, 10, 5 };
		reverse r = new reverse();
		r.printArray(arr, 8);
		r.reverseArray(arr, 0, 7);
		r.printArray(arr, 8);

	}

}
