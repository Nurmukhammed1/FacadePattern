import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Integer> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
        inventory.put("Samsung", 10);
        inventory.put("Iphone", 20);
        inventory.put("Honor", 30);
        inventory.put("Xiaomi", 40);
    }

    public boolean verifyAvailability(String product) {
        return inventory.containsKey(product);
    }

}
