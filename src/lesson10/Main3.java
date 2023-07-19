package lesson10;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        File file = new File("D:/Git1/l5/src/L10/newfile.txt");
        File file2 = new File("D:/Git1/l5/src/L10/newfile1.txt");
        File file3 = new File("D:/Git1/l5/src/L10/newfile2.txt");
        fileAppend(file, file2, file3);
    }

    public static void fileAppend(File file, File file1, File file2) {
        StringBuilder bilder = new StringBuilder();

        try {
            Scanner scanner = new Scanner(file);
            Scanner scanner2 = new Scanner(file1);

            while (scanner.hasNext()) {
                String string = (scanner.hasNext() ? scanner.next() : " ");
                bilder.append(string).append(" ");
            }
            while (scanner2.hasNext()) {
                String string2 = (scanner2.hasNext() ? scanner2.next() : " ");
                bilder.append(string2).append(" ");
            }
            scanner.close();
            scanner2.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (PrintWriter pw = new PrintWriter(file2)) {
            pw.write(bilder.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
