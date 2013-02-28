package bakdiscountstrategy;
/**
 * This class represents a product that a business would sell.
 * @author Benjamin Kling, bkling@my.wctc.edu
 * version 1.00
 */
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
    public final String getProductID() {
        return productID;
    }

    public final void setProductID(String productID) {
        //Needs Validation
        this.productID = productID;
    }

    public final double getProductPrice() {
        return productPrice;
    }

    public final void setProductPrice(double productPrice) {
        //Needs Validation
        this.productPrice = productPrice;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(String description) {
        //Needs Validation
        this.description = description;
    }

    public final DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public final void setDiscountStrategy(DiscountStrategy DiscountStrategy) {
        //Needs Validation
        this.discountStrategy = DiscountStrategy;
    }

    public final double getDiscount(int qty) {
        return (discountStrategy.getDiscountAmt(productPrice, qty));
    }
}
