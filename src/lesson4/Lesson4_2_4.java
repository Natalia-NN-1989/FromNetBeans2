package lesson4;

import java.util.Arrays;

public class Lesson4_2_4 {

    public static void main(String[] args) {
        int arrs[] = new int[]{5, 11, 22, 45, 12, 11, 5, 77, 12, 22};
        boolean x;
        for (int i = 0; i <= arrs.length - 2; i++) {
            x = false;
            for (int j = i + 1; j <= arrs.length - 1; j++) {
                if (arrs[i] == arrs[j]) {
                    x = true;
                    break;
                }
            }
            if (x == false) {
                System.out.println("Result: " + arrs[i]);
                break;
            }
        }
    }
}
