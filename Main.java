public class Main {
    public static void main(String[] args) {
        DeliveryStrategy pickupStrategy = new PickupStrategy();
        DeliveryStrategy externalDeliveryStrategy = new ExternalDeliveryStrategy();
        DeliveryStrategy ownDeliveryStrategy = new OwnDeliveryStrategy();

        OrderContext orderContext = new OrderContext(pickupStrategy);
        orderContext.calculateCost();

        orderContext.setDeliveryStrategy(externalDeliveryStrategy);
        orderContext.calculateCost();

        orderContext.setDeliveryStrategy(ownDeliveryStrategy);
        orderContext.calculateCost();
    }
}