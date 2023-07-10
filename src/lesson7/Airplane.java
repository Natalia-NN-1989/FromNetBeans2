package lesson7;

public class Airplane {

    private String name;

    void setParams(String name) {
        this.name = name;
    }

    class Wing {

        int weightWing;

        int getWing() {
            return weightWing;
        }
    }

    public static void main(String[] args) {
        Airplane airplane1 = new Airplane();
        Airplane airplane2 = new Airplane();
        Airplane.Wing wing1 = airplane1.new Wing();
        Airplane.Wing wing2 = airplane2.new Wing();

        airplane1.name = "SuperJet";
        airplane2.name = "Airbus";
        wing1.weightWing = 10000;
        wing2.weightWing = 15000;
        System.out.println(airplane1.name + "   " + wing1.getWing());
        System.out.println(airplane2.name + "   " + wing2.getWing());
    }
}
