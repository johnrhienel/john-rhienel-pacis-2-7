
import java.util.Scanner;

public class WarehouseInventoryScanner {

    static Scanner input = new Scanner(System.in);

    // -1 means the shelf is damaged.
    static int[][] inventory = {
        {10, 5, 8, 12},
        {6, -1, 2, 9},
        {1, 7, 4, 11}
    };

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n=== WAREHOUSE INVENTORY ===");
            System.out.println("1. Display Inventory");
            System.out.println("2. Calculate Total Stock");
            System.out.println("3. Find First Low-Stock Shelf");
            System.out.println("4. Restock an Item");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    displayInventory();
                    break;

                case 2:
                    calculateTotal();
                    break;

                case 3:
                    findLowStock();
                    break;

                case 4:
                    restockItem();
                    break;

                case 0:
                    System.out.println("Exiting inventory system.");
                    break;

                default:
                    System.out.println("Invalid menu choice.");
            }

        } while (choice != 0);

        input.close();
    }

    static void displayInventory() {
        System.out.println("\nInventory Table:");

        for (int row = 0; row < inventory.length; row++) {
            for (int col = 0; col < inventory[row].length; col++) {
                if (inventory[row][col] == -1) {
                    System.out.print("[DAMAGED] ");
                } else {
                    System.out.print(inventory[row][col] + " ");
                }
            }
            System.out.println();
        }
    }

    static void calculateTotal() {
        int total = 0;

        for (int row = 0; row < inventory.length; row++) {
            for (int col = 0; col < inventory[row].length; col++) {

                // CONTINUE: skip damaged shelves.
                if (inventory[row][col] == -1) {
                    continue;
                }

                total += inventory[row][col];
            }
        }

        System.out.println("Total Available Stock: " + total);
    }

    static void findLowStock() {
        boolean found = false;

        // Nested loops search shelves row by row.
        for (int row = 0; row < inventory.length; row++) {
            for (int col = 0; col < inventory[row].length; col++) {

                if (inventory[row][col] == -1) {
                    continue;
                }

                if (inventory[row][col] <= 2) {
                    System.out.println(
                        "First low-stock shelf found at Row "
                        + (row + 1) + ", Column " + (col + 1)
                        + " with " + inventory[row][col] + " items."
                    );

                    found = true;

                    // BREAK: stop the inner loop after finding a match.
                    break;
                }
            }

            // Stop the outer loop too, so only the first match is reported.
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No critically low shelves found.");
        }
    }

    static void restockItem() {
        System.out.print("Enter row (1-3): ");
        int row = input.nextInt();

        System.out.print("Enter column (1-4): ");
        int col = input.nextInt();

        // Validate the selected shelf.
        if (row < 1 || row > inventory.length
                || col < 1 || col > inventory[0].length) {
            System.out.println("Invalid row or column.");
            return;
        }

        if (inventory[row - 1][col - 1] == -1) {
            System.out.println("Cannot restock a damaged shelf.");
            return;
        }

        int quantity;

        // WHILE: keep asking until the quantity is positive.
        while (true) {
            System.out.print("Enter quantity to add: ");
            quantity = input.nextInt();

            if (quantity > 0) {
                break;
            }

            System.out.println("Quantity must be greater than zero.");
        }

        inventory[row - 1][col - 1] += quantity;

        System.out.println("Restocking successful!");
        System.out.println("Updated Stock: "
                + inventory[row - 1][col - 1]);

        // RETURN: exits this method and returns to the menu.
        return;
    }
}
