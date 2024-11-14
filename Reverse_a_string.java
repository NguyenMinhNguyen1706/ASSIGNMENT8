import java.util.Scanner;
public class Reverse_a_string {
    public static String Reverse(String chuoi){
        String reversed="";
        for(int i=chuoi.length()-1;i>=0;i--){
            reversed += chuoi.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");String chuoi=sc.nextLine();
        System.out.println("The string after reversed is: " + Reverse(chuoi));
    }
    
}
