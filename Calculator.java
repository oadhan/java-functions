import java.util.Scanner;
import java.lang.*;

public class Calculator{
	public static void main (String[] args) {
		
		// Create new scanner class and get inputs for first and second inputs and initial operator
		Scanner sc = new Scanner(System.in);

		System.out.print("1st input: ");
		float buffer = sc.nextFloat();

		System.out.print("op: ");
		sc.nextLine();
		String op = sc.nextLine();

		// Handling exit or clearing buffer in first op itself
		if (op.equals("x")){
			System.out.println("Exited.");
			System.exit(0);
		}

		while (op.equals("c")) {
			buffer = 0;
			System.out.println("ans: " + buffer);
			System.out.print("op: ");
			op = sc.nextLine();
		}

		System.out.print("2nd input: ");
		float second = sc.nextFloat();

		// While op is not exit, run through this loop
		while (!op.equals("x")) {
			if (op.equals("+")) {
				buffer = buffer + second;
				System.out.println("ans: " + buffer);
			} else if (op.equals("-")) {
				buffer = buffer - second;
				System.out.println("ans: " + buffer);
			} else if (op.equals("*")) {
				buffer = buffer * second;
				System.out.println("ans: " + buffer);
			} else if (op.equals("/") && second != 0) {
				buffer = buffer / second;
				System.out.println("ans: " + buffer);
			} else if (op.equals("/") && second == 0) {
				System.out.println("Error: divison by zero");
			} else if (op.equals("c")) {
				buffer = 0;
				System.out.println("ans: " + buffer);
			} else {
				System.out.println("Error: Unknown operator " + op);
			}

			System.out.print("op: ");
			sc.nextLine();
			op = sc.nextLine();

			if (op.equals("x")){
				System.out.println("Exited.");
				break;
			}

			while (op.equals("c")) {
				buffer = 0;
				System.out.println("ans: " + buffer);
				System.out.print("op: ");
				op = sc.nextLine();
			}

			System.out.print("more input: ");
			second = sc.nextFloat();
		}
	}
}

