package lesson5;

public class L5_1 {

    public static void main(String[] args) {
        String string = "Давно выяснено, что при оценке дизайна и композиции читаемый текст мешает сосредоточиться. Lorem Ipsum используют потому, что тот обеспечивает более или менее стандартное заполнение шаблона, а также реальное распределение букв и пробелов в абзацах, которое не получается при простой дубликации \"Здесь ваш текст.. Здесь ваш текст.. Здесь ваш текст..\" Многие программы электронной вёрстки и редакторы HTML используют Lorem Ipsum в качестве текста по умолчанию, так что поиск по ключевым словам \"lorem ipsum\" сразу показывает, как много веб-страниц всё ещё дожидаются своего настоящего рождения. За прошедшие годы текст Lorem Ipsum получил много версий. Некоторые версии появились по ошибке, некоторые - намеренно (например, юмористические варианты).";
        String replaceAll = string.replaceAll("\\pP", "");
        out(longestWord(replaceAll));
    }

    public static String longestWord(String string) {
        String[] strings = string.split(" ");
        String longWord = "";
        for (String s : strings) {
            if (s.length() > longWord.length()) {
                longWord = s;
            }
        }
        return longWord;
    }

    public static void out(String longWord) {
        System.out.println("Long word: " + longWord + "     Lenght=" + longWord.length());
    }
}
