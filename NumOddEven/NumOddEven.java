import java.util.Scanner;

public class NumOddEven {
	
    public static void main(String[] args) {
	
        Scanner numInputScanner = new Scanner(System.in);
        System.out.print("Enter a number ");
		
		String input = numInputScanner.nextLine();
		
		if(isNumeric(input)) {
			System.out.println(input + " number is " + isOddOrEven(input));
		} else {
			System.out.println(input + " is not a number, please try again.");
		}
    }
	
	public static String isOddOrEven(String num) {
		return (Integer.valueOf(num) % 2 == 0 ? "odd" : "even");
	}
	
	public static boolean isNumeric(String str) {
		
		try {
			int d = Integer.parseInt(str);
		}
		catch(NumberFormatException nfe)
		{
			return false;
		}
		
		return true;
	}
}