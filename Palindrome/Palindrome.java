import java.util.*;

public class Palindrome {
	
    public static void main(String[] args) {
	
        Scanner numInputScanner = new Scanner(System.in);
        System.out.print("Enter your text ");
		
		String input = numInputScanner.nextLine();
		
		System.out.println(input + " is " + isPalindromeB(input));
    }
	
	public static String isPalindromeA(String input) {
		
		List<Character> a = new ArrayList<>(), b = new ArrayList<>();
		
		int kentro = input.length() / 2;
		boolean odd = (input.length() % 2 == 0);
		
		for(int i = (!odd ? kentro + 1 : kentro); i < input.length(); i++) {
			a.add(input.charAt(i));
		}
		
		for(int i = kentro - 1; i >= 0; i--) {
			b.add(input.charAt(i));
		}
		
		if(a.equals(b))
			return "palindrome";
		
		return "not palindrome";
	}
	
	public static String isPalindromeB(String input) {
		
		int kentro = input.length() / 2;
		boolean odd = (input.length() % 2 == 0);
		
		String a = input.substring(0, kentro);
		String b = input.substring((!odd ? kentro + 1 : kentro));
		
		System.out.println(a + " is " + reverseInput(b));
		
		if(a.equals(reverseInput(b)))
			return "palindrome";
		
		return "not palindrome";
	}
	
	private static String reverseInput(String input) {
		String text = "";
		
		for( int i = input.length() - 1 ; i >= 0 ; i-- ) {
		   text = text + input.charAt(i);
		}
		
		return text;
	}
}