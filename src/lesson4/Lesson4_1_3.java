package lesson4;

import java.util.Scanner;

public class Lesson4_1_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 1 number: ");
        int var1 = in.nextInt();
        System.out.print("Input 2 number: ");
        int var2 = in.nextInt();
        System.out.print("Input 3 number: ");
        int var3 = in.nextInt();
        boolean value;
        if (var1 + var2 == var3) {
            value = true;
        } else {
            value = false;
        }
        System.out.print("Value is " + value);
    }
}
