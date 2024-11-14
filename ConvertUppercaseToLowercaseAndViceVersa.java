import java.util.Scanner;
public class ConvertUppercaseToLowercaseAndViceVersa {
    public static String convertCase(String chuoi) {
        String result = "";
        for (int i = 0; i < chuoi.length(); i++) {
            char ch = chuoi.charAt(i);
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }
        return result;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String converted = convertCase(input);
        System.out.println("Converted string: " + converted);

    }
    
}
