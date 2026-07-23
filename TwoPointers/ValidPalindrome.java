public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean isPalindrome = isValidPalindrome(s);    
    System.out.println("Is the string a valid palindrome? " + isPalindrome);
}
public static boolean isValidPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
        // Move left pointer to the next alphanumeric character
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
            left++;
        }
        // Move right pointer to the previous alphanumeric character
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
            right--;
        }

        // Compare characters ignoring case
        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
}