import java.util.Scanner;
public class CountTheNumberOfWordsInAString {
     public static int countWords(String str) {
        int count = 0;
        boolean isWord = false;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                isWord = false;
            } else {
                if (!isWord) {
                    count++;
                    isWord = true;
                }
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        int wordCount = countWords(input);
        System.out.println("The string has " + wordCount + " words.");
    }
    
}
