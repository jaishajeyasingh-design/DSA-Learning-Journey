public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "  the sky is blue  ";
        String reversed = reverseWords(s);
        System.out.println("Reversed words: \"" + reversed + "\"");
    }

    public static String reverseWords(String s) {
        // Trim the string to remove leading and trailing spaces
        s = s.trim();
        // Split the string into words
        String[] words = s.split("\\s+");
        // Use a StringBuilder to build the reversed string
        StringBuilder sb = new StringBuilder();
        // Iterate through the words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
