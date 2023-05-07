public class OrderContext {
    private DeliveryStrategy deliveryStrategy;

    public OrderContext(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public void calculateCost() {
        deliveryStrategy.calculateDeliveryCost();
    }
}