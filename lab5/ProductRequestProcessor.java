public class ProductRequestProcessor extends RequestProcessor {
    @Override
    public Object parseRequest(RestRequest restRequest) {
        return restRequest.getObjectToUpdate();
    }

    @Override
    public boolean validateEntity(Object entity) {
        if (entity instanceof Product) {
            Product product = (Product) entity;
            return !product.getName().isEmpty() && !(product.getPrice() <= 0);
        }
        return false;
    }

    @Override
    public void afterValidate(Object entity, boolean isValid) {
        if (!isValid){
            System.out.println("Product validation failed. Sending message to admin...");
        }
    }

    @Override
    public boolean updateData(Object entity) {
        System.out.println("Updating product in database...");
        return true;
    }

    @Override
    public String generateResponse(Object entity, boolean isValid, boolean isUpdated) {
        if (!isValid) {
            return "Product fields are invalid.";
        }
        if (!isUpdated) {
            return "Product update failed. Try again.";
        }
        return "Product successfully updated.";
    }
}