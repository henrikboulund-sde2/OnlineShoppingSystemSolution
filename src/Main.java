public class Main
{
    public static void main(String[] args)
    {
        // Simulate order placement
        OnlineShoppingFacade facade = new OnlineShoppingFacade();
        facade.placeOrder(123, 456, 2, "Address");
    }
}
