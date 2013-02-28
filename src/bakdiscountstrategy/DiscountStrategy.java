package bakdiscountstrategy;

/**
 * This class is the interface of my discount strategy objects.
 *
 * @author Benjamin Kling, bkling@my.wctc.edu, version 1.00
 */
public interface DiscountStrategy {

    //This is the method that the Discount Strategies will override
    /**
     * This method abstract and all lower level classes have to override it
     *
     * @param productPrice - uses a product price to determine the discount
     * @param qty - uses a quantity to determine the discount
     * @return - a discount amount
     */
    public abstract double getDiscountAmt(double productPrice, int qty);
}
