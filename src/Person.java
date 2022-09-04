import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String married;

    public Person() {
    }

    public String getName() {
        do {
            System.out.print("Enter name: ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            this.name = name;
        } while (name == null);
        return name;
    }

    public int getAge() {
        do {
            System.out.print("Enter age: ");
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            this.age = age;
        }
        while (age < 0 || age > 130);
        return age;
    }

    public String isMarried() {
        do {
            System.out.print("Enter marital status (yes/no): ");
            Scanner scanner = new Scanner(System.in);
            String married = scanner.next();
            this.married = married;
        }
        while (!married.equals("yes") && !married.equals("no"));
        return married;
    }

}
