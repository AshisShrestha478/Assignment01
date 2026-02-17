public class GroceryManagementSystem {

  public static void printInventory(String[] names, double[] prices, int[] stocks) {
    /*
    * Prints inventory to the terminal
    * @author Hayden Lovell
    * @param names An array of item names in the grocery store
    * @param prices An array of item prices in the grocery store
    * @param stocks An array of item stock amounts in the grocery store
    */
   
    // Iterate through item names
    for (int i = 0; i < names.length; i++) {
      // Check if name exists
      if (names[i] != null)
        System.out.println("Name: " + names[i] + " | Price: " + prices[i] + " | Stock: " + stocks[i]);
    }
  }

}