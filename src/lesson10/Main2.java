package lesson10;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
public class Main2 {

    public static void main(String[] args) {

        String text = "I love Java";
        File file = new File("D:/Git1/l5/src/L10/newfile.txt");
         List<String> arrayList = new ArrayList<>();

        strWrite(text, file);

    }

    public static void strWrite(String text, File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(text);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}