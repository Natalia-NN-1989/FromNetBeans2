package lesson3_4;
public class Tree {

    String name;
    int age;
    boolean life;

    public Tree(boolean life) {
        this.age = 10;
        this.name = "Kaktus";
        this.life = life;
    }

    public Tree(String name, int age, boolean life) {
        this.age = age;
        this.name = name;
        this.life = life;
    }

    public Tree() {
        System.out.println("������ ����������� ��� ���������� ��������");
    }

    @Override
    public String toString() {
        return "������� = " + this.age + " ��� = " + this.name + " ����� " + this.life;
    }
    
}
