package lesson9_3;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        HashMap<User, Integer> map = new HashMap<>();
        map.put(new User("Ivan"), (int) (Math.random() * 10));
        map.put(new User("Liza"), (int) (Math.random() * 10));
        map.put(new User("Nata"), (int) (Math.random() * 10));
        map.put(new User("Pol"), (int) (Math.random() * 10));
        System.out.println(map.toString());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        countBalls(map, name);
    }

    public static void countBalls(Map<User, Integer> map, String name) {
        for (Map.Entry<User, Integer> part : map.entrySet()) {
            if (part.getKey().getName().equals(name)) {
                System.out.println("Игрок "+name+". Количество очков: " + part.getValue());
            }
        }
    }
}
