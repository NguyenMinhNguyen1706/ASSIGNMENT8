import java.util.Scanner;
public class RemoveExtraSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String result = removeExtraSpaces(input);

        System.out.println("The string after removed extra spaces is: \"" + result + "\"");
    }

    public static String removeExtraSpaces(String input) {
        input = input.trim();
        StringBuilder result = new StringBuilder();
        boolean inSpace = false;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != ' ') {
                result.append(currentChar);
            } else {
                if (!inSpace) {
                    result.append(' ');
                    inSpace = true;
                }
            }
        }
        return result.toString();
    }
}
