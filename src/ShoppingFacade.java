public class ShoppingFacade {
    ProductCatalog productCatalog;
    InventoryManager inventoryManager;
    PaymentProcessor paymentProcessor;
    ShippingService shippingService;

    public ShoppingFacade() {
        productCatalog = new ProductCatalog();
        inventoryManager = new InventoryManager();
        paymentProcessor = new PaymentProcessor();
        shippingService = new ShippingService();
    }

    public void placeOrder(String product) {
        if (productCatalog.searchProduct(product) && inventoryManager.verifyAvailability(product)) {
            paymentProcessor.processPayment();
            shippingService.calculateShipping();
            shippingService.arrangeShipping();
        }
        else {
            System.out.println("Invalid product");
        }
    }
}
