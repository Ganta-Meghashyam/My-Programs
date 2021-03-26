package algorithm;

import java.util.Scanner;

public class KnightProblem {
	
	static int[][] list = {{1,2},{2,1},{-1,2},{-2,1},{-2,-1},{-1,-2},{1,-2},{2,-1}};
	
	public static int posKnight(int x , int y) {
		
		int [][] temp = new int [8][2];
		int count = 0;
		
		for(int i = 0 ; i < 8 ; i++) {
			
			temp[i][0] = list[i][0] + x;
			temp[i][1] = list[i][1] + y;
			
			if(temp[i][0]>=0 && temp[i][0]<7 && temp[i][1]>=0 && temp[i][1]<7) {
				
				count++;
			}
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x value:");
		int x = sc.nextInt();
		System.out.print("Enter y value:");
		int y = sc.nextInt();
		System.out.println(posKnight(x, y));

	}

}
