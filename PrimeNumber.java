import java.util.Scanner;

public class PrimeNumber {
	
    public static void main(String[] args) {
	
        Scanner numInputScanner = new Scanner(System.in);
        System.out.print("Enter a number ");
		
		String input = numInputScanner.nextLine();
		
		if(isNumeric(input)) {
			System.out.println(input + " number is " + isPrimeNumber(Integer.valueOf(input)));
		} else {
			System.out.println(input + " is not a number, please try again.");
		}
        
    }
	
	public static String isPrimeNumber(int num) {
		
		for(float i = 2; i < num; i++) {
			
			float c = (num / i);
			
			if(c % 1 == 0) {
				return "not prime";
			}
		}
		
		return "prime";
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