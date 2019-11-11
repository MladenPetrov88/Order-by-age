import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    static class Person {
        String name;
        String ID;
        int age;

        Person (String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public int getAge () {
            return this.age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", name, ID, age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Person> people = new ArrayList<>();

        while (!input.equals("End")) {
            String[] temp = input.split(" ");
            String name = temp[0];
            String ID = temp[1];
            int age = Integer.parseInt(temp[2]);

            Person person = new Person(name, ID, age);

            people.add(person);

            input = scanner.nextLine();
        }

        people.stream().sorted((p1, p2) -> Integer.compare(p1.getAge(),p2.getAge())).forEach(e -> System.out.println(e));

    }
}
