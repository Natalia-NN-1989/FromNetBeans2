package lesson4;

import static lesson4.Lesson4_1_5.analiz;
import static lesson4.Lesson4_1_5.out;

public class Lesson4_1_6 {

    public static void main(String[] args) {
        int arr[] = new int[]{5, 6, 22, 45, 1, 18, 88, 2, 8, 6};
        out(analiz(arr));
    }

    public static boolean analiz(int arr[]) {
        boolean value = false;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == 1 || arr[i] == 3) {
                value = true;
                break;
            }
        }
        return value;
    }

    public static void out(boolean value) {
        System.out.print("Value is " + value);
    }

}
