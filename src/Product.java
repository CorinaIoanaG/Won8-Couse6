import java.util.Scanner;

public class Product {
    protected String name;
    protected float price;
    protected float quantity;
    protected String category;

    public Product () {
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

    public float getPrice() {
        do {
            System.out.print("Enter price: ");
            Scanner scanner = new Scanner(System.in);
            float price = scanner.nextFloat();
            this.price = price;
        }
        while (price <= 0);
        return price;
    }

    public float getQuantity() {
        do {
            System.out.print("Enter quantity: ");
            Scanner scanner = new Scanner(System.in);
            float quantity = scanner.nextFloat();
            this.quantity = quantity;
        }
        while (quantity < 0);
        return quantity;
    }

    public String getCategory() {
        do {
            System.out.print("Enter category: ");
            Scanner scanner = new Scanner(System.in);
            String category = scanner.nextLine();
            this.category = category;
        } while (category == null);
        return category;
    }

    public boolean hasStock(float quantity){
        if (quantity>0) {
            return true;
        } else{
            return false;
        }
    }

    public boolean isCategory(String category){
        if (category.equals(this.category)){
            return true;
        } else {
            return false;
        }
    }

}