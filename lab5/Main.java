import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Apple", 5, true);
        Product p2 = new Product("Tea", 7, true);
        User user = new User("user", "password", "email");
        Order order = new Order(user, Arrays.asList(p1, p2));

        RestRequest productRestRequest = new RestRequest(p1);
        ProductRequestProcessor productRequestProcessor = new ProductRequestProcessor();
        System.out.println(productRequestProcessor.processRequest(productRestRequest));

        RestRequest productRestRequest2 = new RestRequest(new Product("Sugar Honey Ice & Tea", -15, false));
        ProductRequestProcessor productRequestProcessor2 = new ProductRequestProcessor();
        System.out.println(productRequestProcessor2.processRequest(productRestRequest2));

        RestRequest userRestRequest = new RestRequest(user);
        UserRequestProcessor userRequestProcessor = new UserRequestProcessor();
        System.out.println(userRequestProcessor.processRequest(userRestRequest));

        RestRequest orderRestRequest = new RestRequest(order);
        OrderRequestProcessor orderRequestProcessor = new OrderRequestProcessor();
        System.out.println(orderRequestProcessor.processRequest(orderRestRequest));
    }
}