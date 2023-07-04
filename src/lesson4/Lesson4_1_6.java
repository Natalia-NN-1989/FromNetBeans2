package lesson4;
public class Lesson4_1_6 {

    public static void main(String[] args) {
        int arr[] = new int[]{5, 6, 22, 45, 12, 18, 88, 2, 8, 6};
        boolean value = false;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == 1 || arr[i] == 3) {
                value = true;
                break;
            }
        }
        System.out.println("Value is " + value);
    }
}
