import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 5;
        ArrayList<User> users = new ArrayList<>(count);
        for (int i = 0; i < count; ++i) {
            System.out.println("Введите имя пользователя " + (i + 1));
            String name = scanner.nextLine();
            System.out.println("Введите возраст пользователя " + (i + 1));
            Integer age = scanner.nextInt();
            scanner.nextLine();
            users.add(new User(name, age));
        }

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });

        for (User i : users) {
            System.out.println(i.toString());
        }

        scanner.close();
    }
}