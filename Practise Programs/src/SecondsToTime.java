import java.util.Scanner;

public class SecondsToTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hours:");
		int hours = sc.nextInt();
		
		System.out.println("Enter min:");
		int minutes = sc.nextInt();
		
		System.out.println("Enter sec:");
		int sec = sc.nextInt();
		
		System.out.println("Enter to add  seconds:");
		int seconds = sc.nextInt();
		
		int hours_sec = 60*60;
		int min_sec = 60;
		int total_sec = hours*hours_sec+minutes*min_sec+sec+seconds;
		
		int hrs = total_sec/hours_sec;
		int min = (total_sec-(hrs*hours_sec))/min_sec;
		int second = total_sec-(hrs*hours_sec)-(min*min_sec);
		
		System.out.println(hrs+"hrs:"+min+"min:"+second+"sec");
		
		

	}

}
