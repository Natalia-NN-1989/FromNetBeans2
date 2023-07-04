package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson4_2_3 {

    public static void main(String[] args) {
        int arrs[] = new int[]{5, 11, 22, 45, 12, 18, 88, 2, 8, 123};
        out("Array 1: ", arrs);
        move(arrs);
        out("Array 2: ", arrs);
    }

    public static int[] move(int[] arrs) {

        int x = arrs[0];
        arrs[0] = arrs[arrs.length - 1];
        arrs[arrs.length - 1] = x;
        return arrs;
    }

    public static void out(String text, int[] arrs) {
        System.out.println(text + Arrays.toString(arrs));
    }

}
