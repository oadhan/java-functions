import java.util.*;

public class CarPart1 {
	public static void main (String[] args) {
		// Car created 
		boolean igBool = false;
		String colorChar = assignColor();
		int x = randomizePosition();
		int y = randomizePosition();

		Scanner sc = new Scanner(System.in);

		System.out.println("What would you like to do?");
		System.out.println("1: turn the ignition on/off");
		System.out.println("2: change the position of car");
		System.out.println("Q: quit this program");

		System.out.print("Input: ");
		String input = sc.nextLine();

		while (!input.equals("Q")) {
			if(input.equals("1")) {
				igBool = ignitionSwitch(igBool);
				reportState(colorChar, igBool, x, y);
			} else if(input.equals("2")) {
				System.out.println("In which direction do you want to move the car?");
 				System.out.println("H: Horizontal");
 				System.out.println("V: Vertical");
 				System.out.print("Direction: ");
 				String dir = sc.nextLine();

 				if (dir.equals("H")){
 					System.out.print("Enter a movement distance: ");
 					int distance = sc.nextInt();
 					x = moveHorizontally(x, distance, igBool);
 					reportState(colorChar, igBool, x, y);
 				} else if (dir.equals("V")){
 					System.out.print("Enter a movement distance: ");
 					int distance = sc.nextInt();
 					y = moveVertically(y, distance, igBool);
 					reportState(colorChar, igBool, x, y);
 				} else {
 					System.out.println("Invalid input.");
 				}
 			} else {
 				System.out.println("Invalid (test) input.");
 			}

 			System.out.println("What would you like to do?");
			System.out.println("1: turn the ignition on/off");
			System.out.println("2: change the position of car");
			System.out.println("Q: quit this program");

 			System.out.print("Input: ");
			input = sc.nextLine();

		}
	}

	public static int randomizePosition(){
		Random rand = new Random();
		int randPos = rand.nextInt(21);
		return randPos;
	}

	public static String assignColor(){
		Random rand = new Random();
		int randInt = rand.nextInt(6);
		String colorChar = "N";
		if(randInt == 1)
			colorChar = "R";
		else if(randInt == 2)
			colorChar = "G";
		else if(randInt == 3)
			colorChar = "B";
		else if(randInt == 4)
			colorChar = "W";
		else if(randInt == 5)
			colorChar = "S";
		return colorChar;

	}

	public static boolean ignitionSwitch(boolean igBool) {
		if(igBool == false){
			igBool = true;
		}else {
			igBool = false;
		}
		return igBool;
	}

	public static int moveHorizontally(int x, int distance, boolean igBool) {
		if(igBool == false){
			System.out.println("Ignition is off.");
			return x;
		}else {
			int newX = x + distance;
			if(newX > 20 || newX < 1) {
				System.out.println("Out of bounds");
				return x;
			} else
				return newX;
		}
			 
	}

	public static int moveVertically(int y, int distance, boolean igBool) {
		if(igBool == false) {
			System.out.println("Ignition is off.");
			return y;
		}else {
			int newY = y + distance;
			if(newY > 20 || newY < 1) {
				System.out.println("Out of bounds");
				return y;
			} else
				return newY;
		}
			 
	}

	public static void reportState(String colorChar, boolean igBool, int x, int y){
		// Converting color character to string color
		String color = "Color";
		if(colorChar.equals("R"))
			color = "Red";
		else if(colorChar.equals("G"))
			color = "Green";
		else if(colorChar.equals("B"))
			color = "Black";
		else if(colorChar.equals("W"))
			color = "White";
		else if(colorChar.equals("S"))
			color = "Silver";

		// Converting ignition boolean to on or off
		String ignition;
		if(igBool == true)
			ignition = "On";
		else
			ignition = "Off";

				
		System.out.print("Car Information\nColor: " + color +
			"\nIgnition: " + ignition + "\nLocation: (" + x + ", " + y + ")\n");

		// Create array
		String[][] grid = new String[20][20];
		for (int row = 0; row < 20; row++) {
			for (int column = 0; column < 20; column++)
				if ((row == (y - 1)) && (column == (x - 1)))
					grid[row][column] = colorChar;
				else
					grid[row][column] = "-";
		}

		// Print array
		for(int r=0; r<grid.length; r++) {
       		for(int c=0; c<grid[r].length; c++)
           		System.out.print(grid[r][c] + " ");
       		System.out.println();
    	}
	}

}

