import java.util.Scanner;

/**
 * A grocery management system that demonstrates the use of parallel arrays to
 * store item names, prices, and stock quantities.
 *
 * This program allows users to view inventory and restock items through a
 * menu-driven interface.
 *
 * @author Puspa Raj Bhattarai
 * @author Hayden Lovell
 * @author Ashis Shrestha
 */
public class GroceryManagementSystem {

    /**
     * Initializes sample inventory data and runs the menu loop.
     *
     * @author Puspa Raj Bhattarai
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        itemNames[0] = "Eggs";
        itemPrices[0] = 3.5;
        itemStocks[0] = 10;

        itemNames[1] = "Bread";
        itemPrices[1] = 2.5;
        itemStocks[1] = 15;

        itemNames[2] = "Meat";
        itemPrices[2] = 4.5;
        itemStocks[2] = 5;

        while (true) {
            System.out.println("\n===== GROCERY MENU =====");
            System.out.println("1. View Inventory");
            System.out.println("2. Restock Item");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = keyboard.nextInt();
            keyboard.nextLine();
            switch (choice) {

                case 1:
                    printInventory(itemNames, itemPrices, itemStocks);
                    break;

                case 2:
                    System.out.print("Enter item name to restock: ");
                    String target = keyboard.nextLine();

                    System.out.print("Enter amount to add: ");
                    int amount = keyboard.nextInt();

                    restockItem(itemNames, itemStocks, target, amount);
                    break;

                case 3:
                    System.out.println("Program Exited");
                    keyboard.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    /**
     * Prints inventory to the terminal
     *
     * @author Hayden Lovell
     * @param names An array of item names in the grocery store
     * @param prices An array of item prices in the grocery store
     * @param stocks An array of item stock amounts in the grocery store
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {

        // Iterate through item names
        for (int i = 0; i < names.length; i++) {
            // Check if name exists
            if (names[i] != null) {
                System.out.println("Name: " + names[i] + " | Price: " + prices[i] + " | Stock: " + stocks[i]);
            }
        }
    }

    /**
     * Searches for an item and restocks it by increasing its quantity by the
     * specified amount.
     *
     * @author Ashis Shrestha
     * @param names An array of item names in the grocery store.
     * @param stocks An array of stock quantities corresponding to the item
     * names.
     * @param target The name of the item to be restocked.
     * @param amount The amount to restock the item by.
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        int i = 0;
        boolean check = false;
        while (i < names.length) {
            if (names[i] != null && names[i].toLowerCase().equals(target.toLowerCase())) {
                stocks[i] += amount;
                check = true;
                System.out.println("Item restocked successfully.");
                break;
            }
            i++;
        }

        if (!check) {
            System.out.println("Item not found.");
        }
    }
}
