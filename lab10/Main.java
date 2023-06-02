public class Main {
    public static void main(String[] args) {
        CompositeComponent form = new FormCompositeComponent("checkout");
        Component name = new TextInputComponent("name");
        Component password = new PasswordInputComponent("password");
        Component ageCheck = new CheckboxInputComponent("ageCheck");

        CompositeComponent addressDiv = new FormCompositeComponent("address section");
        Component street = new TextInputComponent("street");
        Component building = new TextInputComponent("building");
        Component apartment = new TextInputComponent("apartment");

        Component submit = new SubmitButtonComponent("order");

        form.addComponent(name);
        form.addComponent(password);
        form.addComponent(ageCheck);
        form.addComponent(addressDiv);
        addressDiv.addComponent(street);
        addressDiv.addComponent(building);
        addressDiv.addComponent(apartment);
        form.addComponent(submit);

        form.render();
    }
}