import java.util.Scanner;

public class Bottle {
    protected float totalCapacity;
    protected float availableLiquid;
    protected boolean open;

    public Bottle() {

    }

    public float getTotalCapacity() {
        do {
            System.out.print("Enter total capacity of the bottle: ");
            Scanner scanner = new Scanner(System.in);
            float totalCapacity = scanner.nextFloat();
            this.totalCapacity = totalCapacity;
        }
        while (totalCapacity <= 0);
        return totalCapacity;

    }

    public float getAvailableLiquid() {
        do {
            System.out.print("Enter available liquid of the bottle: ");
            Scanner scanner = new Scanner(System.in);
            float availableLiquid = scanner.nextFloat();
            this.availableLiquid = availableLiquid;
        }
        while (availableLiquid < 0 || availableLiquid >= this.totalCapacity);
        return availableLiquid;

    }

    public boolean getOpenedOrClosed() {
        System.out.print("Enter if the bottle is open or not (true/false): ");
        Scanner scanner = new Scanner(System.in);
        boolean open = scanner.nextBoolean();
        this.open = open;
        return open;
    }

    public boolean hasMoreLiquid() {
        if (availableLiquid > 0) {
            return true;
        } else {
            return false;
        }
    }

    public float availableLiquid() {
        return this.availableLiquid;
    }

    public float emptyCapacity() {
        return this.totalCapacity - this.availableLiquid;
    }

    public void openBottle() {
        if (!open) {
            this.open = true;
            System.out.println("Bottle is opened.");
        } else {
            System.out.println("Bottle was already opened before.");
        }
    }

    public void closeBottle() {
        if (open) {
            this.open = false;
            System.out.println("Bottle is closed.");
        } else {
            System.out.println("Bottle was already closed before.");
        }
    }

    public void drinkLiquid() {
        System.out.print("Enter the quantity of liquid you want to drink: ");
        float liquidToDrink;
        do {
            Scanner scanner = new Scanner(System.in);
            liquidToDrink = scanner.nextFloat();
            if (!open) {
                System.out.println("The bottle is close. I will open it for you.");
                openBottle();
            }
            if (liquidToDrink > this.availableLiquid) {
                System.out.println("Quantity is too high. Maximum quantity you can drink is " + availableLiquid());
            }
        } while (liquidToDrink > this.availableLiquid && !open && liquidToDrink < 0);
        if (liquidToDrink <= this.availableLiquid) {
            System.out.println("You manage to drink it.");
            this.availableLiquid = this.availableLiquid - liquidToDrink;
        }
        System.out.println("I will close the bottle now.");
        closeBottle();
        System.out.println("Bottle state after this operations.");
        System.out.println(String.format("Available liquid %f, Empty capacity %f, The bottle has more liquid: %b, Opened: %b ", availableLiquid(), emptyCapacity(), hasMoreLiquid(), open));
    }

}