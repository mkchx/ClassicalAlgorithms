import java.util.Scanner;

public class NumOddEven {
	
    public static void main(String[] args) {
	
        Scanner numInputScanner = new Scanner(System.in);
        System.out.print("Enter a number ");
		
		String number = numInputScanner.nextLine();
		
        System.out.println(number + " number is " + isOddOrEven(number));
    }
	
	public static String isOddOrEven(String num) {
		return (Integer.valueOf(num) % 2 == 0 ? "odd" : "even");
	}
}