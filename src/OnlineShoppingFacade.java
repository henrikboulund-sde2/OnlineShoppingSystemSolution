public class OnlineShoppingFacade
{
    private InventoryManagementSystem inventorySystem;
    private PaymentProcessingSystem paymentSystem;
    private ShippingSystem shippingSystem;

    public OnlineShoppingFacade()
    {
        this.inventorySystem = new InventoryManagementSystem();
        this.paymentSystem = new PaymentProcessingSystem();
        this.shippingSystem = new ShippingSystem();
    }

    public void placeOrder(int customerId, int itemId, int quantity, String destination)
    {
        inventorySystem.checkStockAvailability(itemId);
        inventorySystem.updateStock(itemId, -quantity);
        double totalAmount = calculateTotalAmount(itemId, quantity);
        paymentSystem.processPayment(customerId, totalAmount);
        boolean paymentVerified = paymentSystem.verifyPayment(customerId, totalAmount);
        if (paymentVerified)
        {
            double shippingCost = shippingSystem.calculateShippingCost(itemId, destination);
            shippingSystem.shipOrder(itemId, destination);
            System.out.println("Order placed successfully!");
        }
        else
        {
            System.out.println("Payment verification failed. Order not placed.");
        }
    }

    private double calculateTotalAmount(int itemId, int quantity)
    {
        // Logic to calculate total amount based on item price and quantity
        return 100.0 * quantity; // Placeholder logic
    }
}
