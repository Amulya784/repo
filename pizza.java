package order;

import java.util.Scanner;

public class PizzaOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a pizza size: 1. Small, 2. Medium, 3. Large");
        int choice = scanner.nextInt();
        int price;

        switch (choice) {
            case 1:
                price = 100;
                break;
            case 2:
                price = 150;
                break;
            case 3:
                price = 200;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Price: ₹" + price);
    }
}
