package lesson10;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main4 {

    public static void main(String[] args) throws IOException {

        String replace = "\\$";

        File file = new File("D:/Git1/l5/src/L10/newfile1.txt");
        List<String> list = new ArrayList<>();

        readerAddWrite(file, list, replace);
    }

    public static void readerAddWrite(File file, List<String> list, String replace) {
        try (BufferedReader bufferR = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferR.readLine()) != null) {
                list.add(line.replaceAll("\\p{P}", replace));
             }
             System.out.println("Результат вне файла: " + list);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        try (BufferedWriter bufferW = new BufferedWriter(new FileWriter(file))) {
            for (String str : list) {
                bufferW.write(str);
                bufferW.newLine();
            }
           System.out.println("Файл с изменениями: " + list);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
     }

