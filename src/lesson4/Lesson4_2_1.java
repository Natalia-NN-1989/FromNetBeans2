package lesson4;

public class Lesson4_2_1 {

    public static void main(String[] args) {
        int arr[] = new int[]{5, 6, 7, 45, 88, 99, 100, 104, 866, 1677};
        boolean value = true;
        //String value="OK";
        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                value = false;
                //value="Please, try again";
                break;
            }
        }
        if (value) {
            System.out.println("Value is OK");
        } else {
            System.out.println("Please, try again");
        }
        //System.out.println(value);
    }
}
