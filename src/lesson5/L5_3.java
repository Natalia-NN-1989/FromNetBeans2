package lesson5;

public class L5_3 {

    public static void main(String[] args) {
        String string = "����� ��������, ��� ���� ��� ������ ������� � ���������� ���� �������� ����� ������ ���������������. Lorem Ipsum ���������� ������, ��� ����  ������������ ����� ��� ����� ����������� ���������� �������, � ����� �������� ������������� ���� � �������� � �������, ������� �� ���������� ��� ������� ���������� ���� \"����� ��� �����.. ����� ��� �����.. ����� ��� �����..\" ������ ��������� ����������� ������ � ��������� HTML ���������� Lorem Ipsum � �������� ������ �� ���������, ��� ��� ����� �� �������� ������ \"lorem ipsum\" ����� ����������, ��� ����� ���-������� �� ��� ���������� ������ ���������� ��������. �� ��������� ���� ����� Lorem Ipsum ������� ����� ������. ��������� ������ ��������� �� ������, ��������� - ��������� (��������, �������������� ��������) ����.";
        String replaceAll = changeByaka(string);
        out(replaceAll);
    }

    public static void out(String replaceAll) {
        System.out.println(replaceAll);
    }

    public static String changeByaka(String string) {
        String replaceAll = string.replaceAll("����", "[�������� ��������]");
        return replaceAll;
    }
}
