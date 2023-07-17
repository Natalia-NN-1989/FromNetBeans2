package lesson9_1_and_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main2 {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
      LinkedList<String> strings1 = new LinkedList<>();

        currentNanoTimeArrayList(strings);    
     currentNanoTimeLinkedList(strings1);  

    }

    public static void currentNanoTimeArrayList(ArrayList<String> strings) {

        long start = System.nanoTime();
        methodAddArrayList(strings);
        methodGetArrayList(strings);
        long finish = System.nanoTime();
        long interval = (finish - start)/1000000;
        System.out.println("1. ArrayList прошло времени, с: " + interval);

    }
    public static void currentNanoTimeLinkedList(LinkedList<String> strings1) {

        long start1 = System.nanoTime();
          methodAddLinkedList(strings1);
        methodGetLinkedList(strings1);
       long finish1 = System.nanoTime();
        long interval1= (finish1 - start1)/1000000;
        System.out.println("2. LinkedList прошло времени, с: " + interval1);
    }

    public static void methodAddArrayList(ArrayList<String> strings) {
        for (int i = 0; i < 1000000; i++) {
            strings.add(" ");
        }
    }

    public static void methodAddLinkedList(LinkedList<String> strings1) {
        for (int i = 0; i < 1000000; i++) {
            strings1.add(" ");
        }
    }

    public static void methodGetArrayList(ArrayList<String> strings) {
        Random rand = new Random();
        for (int i = 0; i <= 100000; i++) {
            strings.get(rand.nextInt(strings.size()));
        }
    }

    public static void methodGetLinkedList(LinkedList<String> strings1) {
        Random rand = new Random();
        for (int i = 0; i <= 100000; i++) {
            strings1.get(rand.nextInt(strings1.size()));
        }
    }
}