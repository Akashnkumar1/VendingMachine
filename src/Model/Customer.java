package Model;

public class Customer {
    private String UserName;
    private String name;
    private String email;
    Cart cart;

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Customer(String userName, String name, String email, String location, String preferredPaymentMethod) {
        this.UserName = userName;
        this.name = name;
        this.email = email;
        this.location = location;
        this.preferredPaymentMethod = preferredPaymentMethod;

    }

    public void addToCart(String preferredPaymentMethod){
        cart = new Cart(this.preferredPaymentMethod);
    }


    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPreferredPaymentMethod() {
        return preferredPaymentMethod;
    }

    public void setPreferredPaymentMethod(String preferredPaymentMethod) {
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    private String location;
    private String preferredPaymentMethod;
}
