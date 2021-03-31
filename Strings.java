
public class Strings{
	public static void main(String [] args){
		String test = "ahkfdj  aldfj asdifj   sof";
		System.out.println("The longest break in the string is: " + longestBlank(test))
	}

	public static int longestBlank (String str){
		int blanksLongest = 0, blanksCurrent;
		char c;
		int i = 0;
		for (i = 0; i < str.length(); i++){
			c = str.charAt(i);
			if (c == " "){
				blanksCurrent = 1;
				i++;
				while ((i < str.length()) && (str.charAt(i) == " ")){
					blanksCurrent++;
					i++;
				} 
				if (blanksCurrent > blanksLongest)
					blanksLongest = blanksCurrent;
			}
		}
		return blanksLongest;
	}
}
