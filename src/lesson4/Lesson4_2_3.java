package lesson4;

import java.util.Arrays;

public class Lesson4_2_3 {

    public static void main(String[] args) {
        int arrs[] = new int[]{5, 11, 22, 45, 12, 18, 88, 2, 8, 123};
        System.out.println("Array 1: " + Arrays.toString(arrs));
        int x = arrs[0];
        arrs[0] = arrs[arrs.length - 1];
        arrs[arrs.length - 1] = x;
        System.out.println("Array 2: " + Arrays.toString(arrs));
    }
}
