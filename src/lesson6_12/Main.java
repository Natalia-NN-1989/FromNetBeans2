package lesson6_12;

public class Main {

    public static void main(String[] args) {
        Client client1 = new Client("Adam", "Smith", "Sber");
        Employee employee1 = new Employee("Ivan", "Petrov", "Sber");
        client1.showInfo();
        System.out.println(client1.toString());
        employee1.showInfo();
        System.out.println(employee1.toString());
        client1.begin(employee1.family);
        employee1.begin(client1.family);
    }

}
