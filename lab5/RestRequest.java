public class RestRequest {
    private final Object object;

    public RestRequest(Object object) {
        this.object = object;
    }

    public Object getObjectToUpdate() {
        return object;
    }
}