package lesson4;

public class Lesson4_1_2 {

    public static void main(String[] args) {
        out(str3());
        out(str5());
        out(str35());
    }

    public static String str3() {
        String string3 = "";
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                string3 += " " + i;
            }
        }
        return string3;
    }

    public static String str5() {
        String string5 = "";
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                string5 += " " + i;
            }
        }
        return string5;
    }

    public static String str35() {
        String string35 = "";
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                string35 += " " + i;
            }
        }
        return string35;
    }

    public static void out(String string3) {
        System.out.println(string3);
    }
}
