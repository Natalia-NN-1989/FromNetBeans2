package lesson4;

import java.util.Scanner;
import java.util.Arrays;

public class Lesson4_2_2 {

    public static void main(String[] args) {

        out(input());

    }

    public static int[] input() {

        Scanner in = new Scanner(System.in);
        System.out.print("Input array length: ");
        int lenght = in.nextInt();
        int arrs[] = new int[lenght];
        for (int i = 0; i <= lenght - 1; i++) {
            System.out.print("Number " + (i + 1) + " of array: ");
            arrs[i] = in.nextInt();
        }
        return arrs;
    }

    public static void out(int[] arrs) {
        System.out.print("Result: " + Arrays.toString(arrs));
    }

}
