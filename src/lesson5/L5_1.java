package lesson5;

public class L5_1 {

    public static void main(String[] args) {
        String string = "����� ��������, ��� ��� ������ ������� � ���������� �������� ����� ������ ���������������. Lorem Ipsum ���������� ������, ��� ��� ������������ ����� ��� ����� ����������� ���������� �������, � ����� �������� ������������� ���� � �������� � �������, ������� �� ���������� ��� ������� ���������� \"����� ��� �����.. ����� ��� �����.. ����� ��� �����..\" ������ ��������� ����������� ������ � ��������� HTML ���������� Lorem Ipsum � �������� ������ �� ���������, ��� ��� ����� �� �������� ������ \"lorem ipsum\" ����� ����������, ��� ����� ���-������� �� ��� ���������� ������ ���������� ��������. �� ��������� ���� ����� Lorem Ipsum ������� ����� ������. ��������� ������ ��������� �� ������, ��������� - ��������� (��������, �������������� ��������).";
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
