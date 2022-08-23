package practice;

public class LeetCodePalindrome {

	public static void main(String[] args) {
		String word = "A man, a plan, a canal: Panama";
		System.out.println(word);
		System.out.println(removeNonAlph(word).toLowerCase());
		
		if(isPalindrome(word))
			System.out.println("true");
		else
			System.out.println("false");		
	}

	// returns true if the parameter String is a valid palindrome with non-alphas removed
	public static boolean isPalindrome(String s) {
		String reverse = reverseStr(removeNonAlph(s));
		reverse = reverse.toLowerCase();

		if(reverse.equals(removeNonAlph(s).toLowerCase()))
			return true;
		else
			return false;
	}
	
	//removes non-alpha character from a String using regex expression
	public static String removeNonAlph(String s) {
        return s.replaceAll("[^a-zA-Z0-9]", "");
    }
	
	// returns the reverse of the parameter String
	public static String reverseStr(String s) {
		String reverse = "";
		for(int i=s.length()-1; i>=0; i--) {
			reverse += s.charAt(i);
		}
		return reverse;
	}
}
