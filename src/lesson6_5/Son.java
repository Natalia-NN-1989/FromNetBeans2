package lesson6_5;

import java.util.Scanner;


public class Son extends Father{

     @Override     
  public void getInfo() {
 System.out.println("������� ���---");     
  System.out.println("���---"+super.in.next());
     }

}