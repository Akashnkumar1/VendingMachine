package Model;

import java.util.Random;

public class Cart{
    private String ProductId;
    private String ProductName;
    private double ProductPrice;
    private String Description;
    private double totalPrice=0;

    private Product product;
    private String preferredPaymentMethod;

    public Cart(String preferredPaymentMethod) {
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public Product getProduct() {
        return product;
    }

    public String genProdId(){
        Random random = new Random();
        int leftlimit = 97;
        int rightlimit = 122;
        return random.ints(leftlimit, rightlimit + 1).limit(10).
                collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }

    public void addProduct(String productName, double ProductPrice, String Description){
        product = new Product(genProdId(), productName, ProductPrice, Description);
        totalPrice+=ProductPrice;
    }

    public double getTotalPrice() {
        if(preferredPaymentMethod.equals("Card")) return 2*totalPrice;
        return totalPrice;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(double productPrice) {
        ProductPrice = productPrice;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

}
