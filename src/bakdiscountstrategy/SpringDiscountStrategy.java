package bakdiscountstrategy;

/**
 * This class implements the discount strategy.
 *
 * @author Benjamin Kling, bklingf@my.wctc.edu, version 1.00
 */
public class SpringDiscountStrategy implements DiscountStrategy {

    //The spring percentage
    private double per = 0.15;

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
     * This method gets a percent
     *
     * @return - a percentage
     */
    public double getPer() {
        return per;
    }

    /**
     * This method sets a percent using an argument
     *
     * @param per - a valid percentage
     */
    public void setPer(double per) {
        //Needs Validation
        this.per = per;
    }
}
