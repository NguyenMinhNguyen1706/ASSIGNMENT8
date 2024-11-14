import java.util.Scanner;
public class Check_ifA_string_is_a_palindrome {
     public static boolean isPalindrome(String chuoi) {
        for (int i = 0; i < chuoi.length() / 2; i++) {
            if (chuoi.charAt(i) != chuoi.charAt(chuoi.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String chuoi = sc.nextLine();
        if (isPalindrome(chuoi)) {
            System.out.println("Yes, the string is a palindrome.");
        } else {
            System.out.println("No, the string is not a palindrome.");
        }
    }
    
}
