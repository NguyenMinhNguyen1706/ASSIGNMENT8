import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String longestWord = findLongestWord(input);
        System.out.println("The longest word is: " + longestWord);
    }

    public static String findLongestWord(String chuoi) {
        String[] strSplit = chuoi.split(" ");
        String longestWord = "";
        for (String strSplit1 : strSplit) {
            if (strSplit1.length() > longestWord.length()) {
                longestWord = strSplit1;
            }
        }
        return longestWord;
    }
}
