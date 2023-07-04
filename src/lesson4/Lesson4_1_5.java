package lesson4;

public class Lesson4_1_5 {

    public static void main(String[] args) {
        int arr[] = new int[]{3, 6, 22, 45, 12, 18, 3, 2, 8, 3};
        boolean value;
        if (arr[0] == 3 && arr[arr.length - 1] == 3) {
            value = true;
        } else {
            value = false;
        }
        System.out.println("Value is " + value);
    }

}
