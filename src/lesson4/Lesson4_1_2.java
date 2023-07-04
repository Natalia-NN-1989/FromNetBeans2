package lesson4;

public class Lesson4_1_2 {

    public static void main(String[] args) {
        String str3, str5, str35;
        str3 = str5 = str35 = "";
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                str3 += " " + i;
            }
            if (i % 5 == 0) {
                str5 += " " + i;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                str35 += " " + i;
            }
        }
        System.out.println(str3);
        System.out.println(str5);
        System.out.println(str35);
    }
}
