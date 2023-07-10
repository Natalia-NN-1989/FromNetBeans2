package lesson5;

import java.util.Scanner;

public class L5_4 {

    public static void main(String[] args) {
        String string = input("string");
        String substring = input("substring");
        System.out.println(count(string, substring));
    }

    public static String input(String str) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input " + str + ":");
        String word = in.next();
        return word;
    }

    public static int count(String string, String substring) {
        int count = 0;
        int index;
        while ((index = string.indexOf(substring)) != -1) {
            string = string.substring(index + substring.length());
            count++;
        }
        return count;
    }

}
