package algorithm;

public class SpeedCalculator {

	public static void calSpeeds(int distance, String time) {
		String[] timeparts = time.split(":");

		int hrs = Integer.parseInt(timeparts[0]);
		int min = Integer.parseInt(timeparts[1]);
		int sec = Integer.parseInt(timeparts[2]);

		int totalTimeInSec = hrs * 60 * 60 + min * 60 + sec;
		double totalTimeInHrs = totalTimeInSec / 3600.0;

		double distanceInKmph = distance / 1000.0;
		double distanceInMiles = distance / 1609.0;

		double speedinkmph = distanceInKmph / totalTimeInHrs;
		double speedInMlph = distanceInMiles / totalTimeInHrs;
		double speedInMps = distance / totalTimeInSec;

		System.out.println(speedinkmph + " kmph");
		System.out.println(speedInMps + " mps");
		System.out.println(speedInMlph + " Mlps");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calSpeeds(540524, "12:30:20");

	}

}
