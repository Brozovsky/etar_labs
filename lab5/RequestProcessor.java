public abstract class RequestProcessor {
    public String processRequest(RestRequest restRequest) {
        boolean isValid = false;
        boolean isUpdated = false;
        Object entity = parseRequest(restRequest);
        beforeValidate(entity);
        isValid = validateEntity(entity);
        afterValidate(entity, isValid);
        if (isValid) {
            beforeUpdate(entity);
            isUpdated = updateData(entity);
            afterUpdate(entity, isUpdated);
        }
        return generateResponse(entity, isValid, isUpdated);
    }

    public void beforeValidate(Object entity) {
        // empty hook
    }

    public void afterValidate(Object entity, boolean isValid) {
        // empty hook
    }

    public void beforeUpdate(Object entity) {
        // empty hook
    }

    public void afterUpdate(Object entity, boolean isUpdated) {
        // empty hook
    }

    public abstract Object parseRequest(RestRequest restRequest);
    public abstract boolean validateEntity(Object entity);
    public abstract boolean updateData(Object entity);
    public abstract String generateResponse(Object entity, boolean isValid, boolean isUpdated);
}