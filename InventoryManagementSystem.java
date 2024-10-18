import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class InventoryManagementSystem {
    private static final Scanner scanner = new Scanner(System.in);
    private static final HashMap<String, Integer> inventory = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            clearScreen();
            System.out.println("Welcome to the Inventory Management System");
            showMainMenu();
        }
    }

    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.err.println("Error clearing the screen: " + e.getMessage());
        }
    }

    private static void showMainMenu() {
        System.out.println("1. Add Item");
        System.out.println("2. View Inventory");
        System.out.println("3. Update Item Quantity");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                addItem();
                break;
            case 2:
                viewInventory();
                break;
            case 3:
                updateItemQuantity();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
                pressEnterToContinue();
        }
    }

    private static void addItem() {
        System.out.print("Enter item name to add: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter quantity of the item: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        inventory.put(itemName, inventory.getOrDefault(itemName, 0) + quantity);
        System.out.println("Item added successfully: " + itemName + " (Quantity: " + quantity + ")");
        pressEnterToContinue();
    }

    private static void viewInventory() {
        System.out.println("Current Inventory:");
        if (inventory.isEmpty()) {
            System.out.println("No items in inventory.");
        } else {
            for (String item : inventory.keySet()) {
                System.out.println("- " + item + ": " + inventory.get(item));
            }
        }
        pressEnterToContinue();
    }

    private static void updateItemQuantity() {
        System.out.print("Enter item name to update: ");
        String itemName = scanner.nextLine();
        if (inventory.containsKey(itemName)) {
            System.out.print("Enter new quantity: ");
            int newQuantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            inventory.put(itemName, newQuantity);
            System.out.println("Updated quantity for " + itemName + " to " + newQuantity);
        } else {
            System.out.println("Item not found in inventory.");
        }
        pressEnterToContinue();
    }

    private static void pressEnterToContinue() {
        System.out.print("Press Enter to continue...");
        scanner.nextLine();
    }
}