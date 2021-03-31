public class Recursion{
	public static void main (String [] args){
		System.out.println(sum(4));
		System.out.println(factorial(4));
	}


	// n + (n-1) + (n-2) + .... + 2 + 1
	public static int sum(int n){
		if (n == 1){
			return 1;
		else 
			return n + sum(n-1);
	}

	// factorial (ex. 4! = 4 * 3 * 2 * 1)
	public static int factorial(int n){
		if (n == 1){
			return 1;
		else 
			return n * factorial(n-1);
		}
	}
}