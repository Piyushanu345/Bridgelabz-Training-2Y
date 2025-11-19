import java.util.*;

public class InventoryManager {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();

       
        stock.put("Rice", 50);
        stock.put("Oil", 20);
        stock.put("Sugar", 30);

        // 2. Customer buys
        stock.put("Rice", stock.get("Rice") - 45); 
        stock.put("Oil", stock.get("Oil") - 25);  

        // 3. New shipment
        stock.put("Sugar", stock.get("Sugar") + 40);

        // 4. Query
        String query = "Rice";
        if (stock.containsKey(query)) {
            System.out.println(query + " remaining: " + stock.get(query));
        } else {
            System.out.println("Not stocked");
        }

        // Print out-of-stock items
        System.out.println("\nOut of stock:");
        for (String item : List.of("Rice", "Oil", "Sugar")) {
            if (!stock.containsKey(item) || stock.get(item) == 0)
                System.out.println(item);
        }
    }
}
