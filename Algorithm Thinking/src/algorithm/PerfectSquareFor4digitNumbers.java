package algorithm;

public class PerfectSquareFor4digitNumbers {

	public static boolean isAllEven(int num) {
		for(int i = num ; i > 0 ; i /=10 ) {
			int remainder = i % 10;
			if(remainder % 2 == 0) 
				return true;
		} 
				return false;	
		}
	
	public static boolean PerfectSquare(int num) {
		
		double sqrnum = Math.sqrt(num);
		if(sqrnum - Math.floor(sqrnum) == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		for(int i = 1000; i<10000 ; i++) {
			if(PerfectSquare(i) && isAllEven(i))
				System.out.print(i+ " ");
		}
		
	}

}
