import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exercises 1 and 2
        System.out.println("Exercises 1 and 2");
        Person person1 = new Person();
        System.out.println(String.format("Name: %s Age:%d Is Married:%s",person1.getName(), person1.getAge(), person1.isMarried()));

        Person person2 = new Person();
        System.out.println(String.format("Name: %s Age:%d Is Married:%s",person2.getName(), person2.getAge(), person2.isMarried()));

        Person person3 = new Person();
        System.out.println(String.format("Name: %s Age:%d Is Married:%s",person3.getName(), person3.getAge(), person3.isMarried()));

        // Exercises 3 and 4
        System.out.println("Exercises 3 and 4");
        System.out.println("Product 1");
        Product product1 = new Product();
        product1.getName();
        product1.getPrice();
        product1.getQuantity();
        product1.getCategory();

        System.out.println("Product 2");
        Product product2 = new Product();
        product2.getName();
        product2.getPrice();
        product2.getQuantity();
        product2.getCategory();

        System.out.println("Product 3");
        Product product3 = new Product();
        product3.getName();
        product3.getPrice();
        product3.getQuantity();
        product3.getCategory();

        System.out.println(String.format("Product %s has stock: %b", product3.name, product3.hasStock(product3.quantity)));

        System.out.print("Enter category you want to ckeck on product 2: ");
        Scanner scanner = new Scanner(System.in);
        String category= scanner.next();
        System.out.println(String.format("Product %s is category %s: %b", product2.name, category, product2.isCategory(category)));

        //Exercise 5
        System.out.println("Exercise 5");
        Bottle bottle = new Bottle();
        bottle.getTotalCapacity();
        bottle.getAvailableLiquid();
        bottle.getOpenedOrClosed();
        bottle.drinkLiquid();
    }
}