package bakdiscountstrategy;

public class Product {

    //Properties of a product
    private String productID;
    private double productPrice;
    private String description;
    private DiscountStrategy discountStrategy;

    //Product Constructor
    public Product(String productID, String description, double productPrice, DiscountStrategy discountStrategy) {
        this.productID = productID;
        this.description = description;
        this.productPrice = productPrice;
        this.discountStrategy = discountStrategy;
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
        return discountStrategy;
    }

    public void setDiscountStrategy(bakdiscountstrategy.DiscountStrategy DiscountStrategy) {
        //Needs Validation
        this.discountStrategy = DiscountStrategy;
    }

    public double getDiscount(int qty) {
        return (discountStrategy.getDiscountAmt(productPrice, qty));
    }
}
