public class GroceryManagementSystem {
    /**
     * Searches for an item and restocks it by increasing its quantity by the specified amount.
     * @author Ashis Shrestha
     * @param names An array of item names in the grocery store.
     * @param stocks An array of stock quantities corresponding to the item names.
     * @param target The name of the item to be restocked.
     * @param amount The amount to restock the item by.
    */
    public static void restockItem(String[] names, int [] stocks, String target, int amount) {
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