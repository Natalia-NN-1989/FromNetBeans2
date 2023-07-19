package lesson10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        File file = new File("D:/Git1/l5/src/L10/newfile1.txt");
         List<String> arrayList = new ArrayList<>();
        addArrList(arrayList, file);
        ofArrList(arrayList);

    }

    public static void addArrList(List<String> arrayList, File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                arrayList.add(reader.readLine());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void ofArrList(List<String> arrayList) {
        System.out.println(arrayList);
    }
}
