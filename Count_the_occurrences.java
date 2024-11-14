import java.util.Scanner;
public class Count_the_occurrences {
    public static int count_Character_Occurences(String chuoi, String ch){
        int count=0;
        for(int i=0;i<chuoi.length();i++){
            if(String.valueOf(chuoi.charAt(i)).equals(ch)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");String chuoi=sc.nextLine();
        System.out.println("Enter a character that yout want to count: ");String ch=sc.next();
        System.out.println("This character appears " + count_Character_Occurences(chuoi,ch)  + " times in the input string");
    }
    
}
