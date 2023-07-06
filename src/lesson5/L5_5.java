package lesson5;

public class L5_5 {

    public static void main(String[] args) {
        String text = "ћетод это объ€вл€емый внутри класса именованный блок кода";
        System.out.println(newPalindrom(text));
    }

    public static StringBuilder newPalindrom(String text) {
        StringBuilder builder = new StringBuilder();
        String delimiter = "";
        for (String word : text.split(" ")) {
            String word1 = new StringBuffer(word).reverse().toString();
            builder.append(delimiter);
            delimiter = " ";
            builder.append(word1);

        }
        return builder;
    }
}
