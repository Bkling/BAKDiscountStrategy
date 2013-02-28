package bakdiscountstrategy;

/**
 * This class implements the discount strategy class.
 *
 * @author Benjamin Kling, bkling@my.wctc.edu, version 1.00
 */
public class FallDiscountStrategy implements DiscountStrategy {

    //The fall percentage
    private double per = 0.2;

    /**
     * This method overrides the DiscountStrategy interface
     *
     * @param productPrice - uses a product price to determine discount
     * @param qty - uses a quantity to determine discount
     * @return - a discount amount
     */
    @Override
    public double getDiscountAmt(double productPrice, int qty) {
        return (productPrice * per) * qty;
    }

    //Getters and Setters
    /**
     * This method gets the percent
     *
     * @return - a percentage
     */
    public double getPer() {
        return per;
    }

    /**
     * This method sets the percentage of a discount
     *
     * @param per - a valid percentage
     */
    public void setPer(double per) {
        //Needs Validation
        this.per = per;
    }
}
