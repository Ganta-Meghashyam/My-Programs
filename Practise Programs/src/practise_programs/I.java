package practise_programs;

public class I {

	public static int MaximumofNum(int a , int b , int c) {

		if(a > b)
			return a;
		if(a > c)
			return a;
		if(b > c)
			return b;
		
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MaximumofNum(10, 15, 12));

	}

}
