package lesson4;

import static lesson4.Lesson4_1_6.analiz;
import static lesson4.Lesson4_1_6.out;

public class Lesson4_2_1 {

    public static void main(String[] args) {
        int arr[] = new int[]{5, 6, 7, 45, 88, 99, 100, 104, 866, 1677};
        out(analiz(arr));
    }

    public static boolean analiz(int arr[]) {
        boolean value = true;
        //String value="OK";
        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                value = false;
                break;
            }
        }
        return value;
    }

    public static void out(boolean value) {
        if (value) {
            System.out.println("Value is OK");
        } else {
            System.out.println("Please, try again");
        }
    }
}
