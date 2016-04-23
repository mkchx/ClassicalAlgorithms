import java.util.*;

public class Sorting {
	
    public static void main(String[] args) {
	
        Scanner numInputScanner = new Scanner(System.in);
        System.out.print("Enter your text ");
		
		// String and Num sort
		
		// System.out.println("sorting... " + sortString(numInputScanner.nextLine()));
		System.out.println("sorting... " + sortNumber(numInputScanner.nextLine()));
    }
	
	public static String sortString(String input) {
		
		String[] s = input.split(" ");
		int length = s.length;
		String f;
		
		for (int j = 0; j < length - 1; j++) {

			if(s[j].compareTo(s[j + 1]) > 0) {

				f = s[j];
				s[j] = s[j+1];
				s[j+1] = f;
				
				j = -1;
			}
		}
		
		return Arrays.toString(s);
	}
	
	public static String sortNumber(String input) {
		
		String[] s = input.split(" ");
		int length = s.length;
		String f;
		
		for (int j = 0; j < length - 1; j++) {

			if(Integer.parseInt(s[j]) >Integer.parseInt(s[j+1])) {

				f = s[j];
				s[j] = s[j+1];
				s[j+1] = f;
				
				j = -1;
			}
		}
		
		return Arrays.toString(s);
	}
}