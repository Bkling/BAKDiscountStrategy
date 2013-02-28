package bakdiscountstrategy;
/**
 * This class is the interface of my discount strategy objects.
 * @author Benjamin Kling, bkling@my.wctc.edu
 * version 1.00
 */
public interface DiscountStrategy {

    //This is the method that the Discount Strategies will override
    public abstract double getDiscountAmt(double productPrice, int qty);
}
