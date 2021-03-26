package practise_programs;
import java.util.Scanner;

public class MinInYrsDaysHrsMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your minutes:");
		int min = sc.nextInt();
		
		int years_min = (365*24*60);
		int Days_min =   (24*60);
		int hours_min =  60;
		
		
		int years = min / years_min;
		int days = (min / Days_min) - (years*365);
		int hours = (min / hours_min)-((years*365*24)+(days*24));
		int minutes = min - (years*365*24*60)-(days*24*60)-(hours*60) ;
		
		System.out.println(years+"years:"+days+"days:"+hours+"hrs:"+minutes+"min");
		
		
		
		

	}

}
