package bakdiscountstrategy;

/**
 * This class implements the discount strategy.
 *
 * @author Benjamin Kling, bkling@my.wctc.edu, version 1.00
 */
public class NoDiscountStrategy implements DiscountStrategy {

    //no percentage
    private double per = 0.0;

    /**
     * This method overrides the discount strategy interface
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
     * This method sets a percentage of a discount
     *
     * @param per - a valid percentage
     */
    public void setPer(double per) {
        //Needs Validation
        this.per = per;
    }
}
