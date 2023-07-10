package lesson6_3;

import java.util.Scanner;

public class Truck extends Car {

    private int numWheels;
    private int maxWeight;

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void newWheels() {

        Scanner in = new Scanner(System.in);
        System.out.print("Input newWheels: ");
        numWheels = in.nextInt();
        System.out.println("New newWheels= " + numWheels);
    }

    public Truck(int weight, String model, char color, float speed, int numWheels, int maxWeight) {
        super(weight, model, color, speed);
        this.numWheels = numWheels;
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Truck: weight=" + weight + "   model=" + model + "   numWheels=" + numWheels + "   maxWeight=" + maxWeight;
    }

}
