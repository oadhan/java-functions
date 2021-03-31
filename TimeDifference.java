import java.util.Scanner;

public class TimeDifference{
	public static void main (String[] args) {
		
		// Create new scanner class and get inputs for first and second times
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first time: ");
		int first = sc.nextInt();

		System.out.print("Enter second time: ");
		int second = sc.nextInt();

		// Isolate parts of time 
		int firstHours = first / 10000;
		first = first % 10000;
		int firstMinutes = first / 100;
		int firstSeconds = first % 100;

		int secondHours = second / 10000;
		second = second % 10000;
		int secondMinutes = second / 100;
		int secondSeconds = second % 100;

		// Convert to seconds, add, calculate difference in seconds
		int firstAllSeconds = (firstHours * 3600) + (firstMinutes * 60) + (firstSeconds);
		int secondAllSeconds = (secondHours * 3600) + (secondMinutes * 60) + (secondSeconds);
		int difference = firstAllSeconds - secondAllSeconds;

		// Isolate part of time for difference
		int diffHours = difference / 3600;
		difference = difference % 3600;
		int diffMinutes = difference / 60;
		int diffSeconds = difference % 60;

		// New integer time value
		int finalDiff = (diffHours * 10000) + (diffMinutes * 100) + diffSeconds;

		System.out.println("Time difference: " + finalDiff);
	}
}