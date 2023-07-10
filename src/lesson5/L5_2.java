package lesson5;
import java.util.Scanner;

public class L5_2 {

    public static void main(String[] args) {
        String word = input();
        System.out.println(isPalindrom(word));

    }

    public static String input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input word: ");
        String word = in.next();
        return word;
    }

    public static boolean isPalindrom(String word) {
        return word.equalsIgnoreCase(new StringBuffer(word).reverse().toString());
    }
}
