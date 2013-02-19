package bakdiscountstrategy;

public class Product {

    //Properties of a product
    private String productID;
    private double productPrice;
    private String description;
    private DiscountStrategy DiscountStrategy;

    //Product Constructor
    public Product(String productID, double productPrice, String description, DiscountStrategy DiscountStrategy) {
        this.productID = productID;
        this.productPrice = productPrice;
        this.description = description;
        this.DiscountStrategy = DiscountStrategy;
    }

    //Getters and Setters
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        //Needs Validation
        this.productID = productID;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        //Needs Validation
        this.productPrice = productPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        //Needs Validation
        this.description = description;
    }

    public bakdiscountstrategy.DiscountStrategy getDiscountStrategy() {
        return DiscountStrategy;
    }

    public void setDiscountStrategy(bakdiscountstrategy.DiscountStrategy DiscountStrategy) {
        //Needs Validation
        this.DiscountStrategy = DiscountStrategy;
    }
}
