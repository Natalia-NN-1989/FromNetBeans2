package lesson10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main3_New {

    public static void main(String[] args) {
        File file = new File("D:/Git1/l5/src/L10/newfile.txt");
        File file2 = new File("D:/Git1/l5/src/L10/newfile2.txt");
        File file3 = new File("D:/Git1/l5/src/L10/newfile3.txt");
        List<String> arrayList = new ArrayList<>();
        addArrList(arrayList, file);
        addArrList2(arrayList, file2);
        writeFile(arrayList, file3);
        System.out.println(arrayList);
    }

    public static void addArrList(List<String> arrayList, File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String string;
            while ((string = reader.readLine()) != null) {
                arrayList.add(string + "\n");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void addArrList2(List<String> arrayList, File file2) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            String string;
            while ((string = reader.readLine()) != null) {
                arrayList.add(string + "\n");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void writeFile(List<String> arrayList, File file3) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file3))) {
            for (String string : arrayList) {
                writer.write(string);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
