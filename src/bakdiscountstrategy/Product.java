package bakdiscountstrategy;

/**
 * This class represents a product that a business would sell.
 *
 * @author Benjamin Kling, bkling@my.wctc.edu, version 1.00
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
    /**
     * This method gets a product id
     *
     * @return - a product id
     */
    public final String getProductID() {
        return productID;
    }

    /**
     * This method sets a product id using an argument
     *
     * @param productID - a valid product id
     */
    public final void setProductID(String productID) {
        //Needs Validation
        this.productID = productID;
    }

    /**
     * This method gets the product price
     *
     * @return - a product price
     */
    public final double getProductPrice() {
        return productPrice;
    }

    /**
     * This method sets a product price using an argument
     *
     * @param productPrice - a valid product price
     */
    public final void setProductPrice(double productPrice) {
        //Needs Validation
        this.productPrice = productPrice;
    }

    /**
     * This method gets a description of a product
     *
     * @return - a product description
     */
    public final String getDescription() {
        return description;
    }

    /**
     * This method sets a product description using an argument
     *
     * @param description - a valid product description
     */
    public final void setDescription(String description) {
        //Needs Validation
        this.description = description;
    }

    /**
     * This method gets a discount strategy
     *
     * @return - a discount strategy
     */
    public final DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    /**
     * This method sets a discount strategy using an argument
     *
     * @param DiscountStrategy - a valid discount strategy
     */
    public final void setDiscountStrategy(DiscountStrategy DiscountStrategy) {
        //Needs Validation
        this.discountStrategy = DiscountStrategy;
    }

    /**
     * This method gets the discount of a product
     *
     * @param qty - uses a quantity amount to determine product price
     * @return - a discount amount
     */
    public final double getDiscount(int qty) {
        return (discountStrategy.getDiscountAmt(productPrice, qty));
    }
}
