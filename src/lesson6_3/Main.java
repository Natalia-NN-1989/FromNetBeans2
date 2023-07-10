package lesson6_3;

public class Main {

    public static void main(String[] args) {
        Truck gaz = new Truck(1200, "Gazel", 'G', 50.0F, 4, 700);
        System.out.println(gaz.toString());
        gaz.newWheels();
        System.out.println(gaz.toString());
    }
}
