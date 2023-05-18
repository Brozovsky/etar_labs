public class OrderRequestProcessor extends RequestProcessor {
    @Override
    public Object parseRequest(RestRequest restRequest) {
        return restRequest.getObjectToUpdate();
    }

    @Override
    public boolean validateEntity(Object entity) {
        if (entity instanceof Order) {
            Order order = (Order) entity;
            return order.getUser() != null || order.getProducts() != null;
        }
        return false;
    }

    @Override
    public boolean updateData(Object entity) {
        System.out.println("Updating order in database...");
        return true;
    }

    @Override
    public String generateResponse(Object entity, boolean isValid, boolean isUpdated) {
        if (!isValid) {
            return "Order fields are invalid.";
        }
        if (!isUpdated) {
            return "Order update failed. Try again.";
        }
        return "Order successfully updated: " + entity.toString();
    }
}