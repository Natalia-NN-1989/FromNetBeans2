package lesson4;

public class Lesson4_1_1 {

    public static void main(String[] args) {
       numeric();
    }
    
   public static void numeric(){ 
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
}
}
