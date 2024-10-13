import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    private Map<String, Integer> products;

    public ProductCatalog() {
        products = new HashMap<>();
        products.put("Samsung", 1500);
        products.put("Iphone", 2000);
        products.put("Honor", 1000);
        products.put("Xiaomi", 9000);
    }

    public boolean searchProduct(String product) {
        return products.containsKey(product);
    }
}
