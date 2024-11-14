import java.util.Scanner;
public class SplitWordsInAString {
    public static String[] splitWords(String chuoi) {
        return chuoi.split(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String[] words = splitWords(input);
        System.out.println("Words in the string is:");
        System.out.print("[");
        for (int i = 0; i < words.length; i++) {
            System.out.print("\"" + words[i] + "\"");
            if (i < words.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
  
