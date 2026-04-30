import java.util.Scanner;

public class CoffeeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get the size
        System.out.print("Enter coffee size (Small, Medium, Large): ");
        String size = scanner.nextLine();

        // 2. Get the type
        System.out.print("Enter coffee type (e.g., Roast, Latte): ");
        String type = scanner.nextLine();

        // 3. Get flavoring (optional)
        System.out.print("Enter flavoring (or press Enter for none): ");
        String flavoring = scanner.nextLine();

        // 4. Print confirmation
        String flavorDetail = flavoring.isEmpty() ? "" : " with " + flavoring + " flavor";
        System.out.println("Order confirmed: " + size + " " + type + " coffee" + flavorDetail + ".");

        scanner.close();
    }
}