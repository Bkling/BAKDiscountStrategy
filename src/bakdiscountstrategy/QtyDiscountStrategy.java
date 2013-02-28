package bakdiscountstrategy;

/**
 * This class implements the discount strategy.
 *
 * @author Benjamin Kling, bkling@my.wctc.edu, version 1.00
 */
public class QtyDiscountStrategy implements DiscountStrategy {

    //Qty percentage
    private double per = 0.1;
    private int minQty = 3;
    private double noDiscount = 0.0;

    /**
     * This method overrides the discount strategy interface
     *
     * @param productPrice - uses a product price to determine discount
     * @param qty - uses a quantity to determine discount
     * @return - a discount amount
     */
    @Override
    public double getDiscountAmt(double productPrice, int qty) {
        if (qty >= minQty) {
            return (productPrice * qty) * per;
        } else {
            return noDiscount;
        }
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

    /**
     * This method gets a minimum quantity
     *
     * @return - a minimum quantity
     */
    public int getMinQty() {
        return minQty;
    }

    /**
     * This method sets a minimum quantity using an argument
     *
     * @param minQty - a valid minimum quantity
     */
    public void setMinQty(int minQty) {
        //Needs Validation
        this.minQty = minQty;
    }
}
