package lesson6_3;
public class Car {
 
    public int weight;
    public String model;
    public char color;
    public float speed;


   public void outPut () {
       System.out.println("��� " + model + " ���������� " + weight + "��.");
       System.out.println("���� ������ - " + color + " � � �������� - " + speed);
   }

   public Car (int w, String m, char c, float s) {
       weight = w;
       model = m;
       color = c;
       speed = s;
   }

   public Car () {
   }
}
