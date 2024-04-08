public class ShippingSystem
{
    public double calculateShippingCost(int itemId, String destination) {
        System.out.println("Calculating shipping cost for item " + itemId + " to " + destination);
        // Implementation logic here
        return 10.0; // Placeholder return value
    }

    public void shipOrder(int orderId, String destination) {
        System.out.println("Shipping order " + orderId + " to " + destination);
        // Implementation logic here
    }
}
