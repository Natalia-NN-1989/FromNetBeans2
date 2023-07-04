package lesson4;

import java.util.Arrays;

public class Lesson4_2_4 {

    public static void main(String[] args) {
        int arrs[] = new int[]{5, 11, 22, 45, 12, 11, 5, 77, 12, 22};
        out(analiz(arrs));
    }

    public static int analiz(int[] arrs) {
        boolean x;
        int first = arrs[0];
        for (int i = 0; i <= arrs.length - 2; i++) {
            x = false;

            for (int j = i + 1; j <= arrs.length - 1; j++) {
                if (arrs[i] == arrs[j]) {
                    x = true;
                    break;
                }
            }
            if (x == false) {
                first = arrs[i];
                break;
            }
        }
        return first;
    }

    public static void out(int first) {
        System.out.println("First element " + first);
    }

}
