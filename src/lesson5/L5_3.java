package lesson5;

public class L5_3 {

    public static void main(String[] args) {
        String string = "Давно выяснено, что бяка при оценке дизайна и композиции бяка читаемый текст мешает сосредоточиться. Lorem Ipsum используют потому, что бяка  обеспечивает более или менее стандартное заполнение шаблона, а также реальное распределение букв и пробелов в абзацах, которое не получается при простой дубликации бяка \"Здесь ваш текст.. Здесь ваш текст.. Здесь ваш текст..\" Многие программы электронной вёрстки и редакторы HTML используют Lorem Ipsum в качестве текста по умолчанию, так что поиск по ключевым словам \"lorem ipsum\" сразу показывает, как много веб-страниц всё ещё дожидаются своего настоящего рождения. За прошедшие годы текст Lorem Ipsum получил много версий. Некоторые версии появились по ошибке, некоторые - намеренно (например, юмористические варианты) бяка.";
        String replaceAll = changeByaka(string);
        out(replaceAll);
    }

    public static void out(String replaceAll) {
        System.out.println(replaceAll);
    }

    public static String changeByaka(String string) {
        String replaceAll = string.replaceAll("бяка", "[вырезано цензурой]");
        return replaceAll;
    }
}
