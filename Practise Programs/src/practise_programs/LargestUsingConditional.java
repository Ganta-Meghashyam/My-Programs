package practise_programs;

import java.util.Scanner;

public class LargestUsingConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 int c = sc.nextInt();
	 
	 int d = c > ((a > b) ? a : b) ? c : ((a > b) ? a: b);
	 System.out.println(d);

	}

}
