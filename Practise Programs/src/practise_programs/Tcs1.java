package practise_programs;

import java.util.*;

public class Tcs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> arr = new TreeSet<Integer>();
		arr.add(102);
		arr.add(34);
		arr.add(87);
		arr.add(98);
		System.out.println(arr);
		Set<Integer> res = ((TreeSet<Integer>) arr).descendingSet();
		System.out.println(res);
		 
	}

}
