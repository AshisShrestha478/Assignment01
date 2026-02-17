import java.util.Scanner;

public class GroceryManagementSystem {
    /**
    * Starts the program, initializes sample data, and handles
    * user interaction through a looped menu.
    * @author Puspa Raj Bhattarai
    * @param args This is not used
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
