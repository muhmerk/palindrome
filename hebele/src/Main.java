import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("kelime giriniz");
            String kelime = scanner.nextLine();

            if (isPalindrome(kelime)) {
                System.out.println("kelime palindromedur");
            } else {
                System.out.println("kelime palindrome değildir");
            }

        }
    }

        public static boolean isPalindrome(String kelime){
        int length = kelime.length();

        for(int i=0 ; i < kelime.length()/2;i++){

            if(kelime.charAt(i) != kelime.charAt(kelime.length()-i-1)){
                return false;
            }
        }
                return true;
        }


}