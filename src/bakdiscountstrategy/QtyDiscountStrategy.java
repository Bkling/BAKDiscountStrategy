package bakdiscountstrategy;
/**
 * This class implements the discount strategy.
 * @author Benjamin Kling, bkling@my.wctc.edu
 * version 1.00
 */
public class QtyDiscountStrategy implements DiscountStrategy {

    //Qty percentage
    private double per = 0.1;
    private int minQty = 3;
    private double noDiscount = 0.0;

    @Override
    public double getDiscountAmt(double productPrice, int qty) {
        if (qty >= minQty) {
            return (productPrice * qty) * per;
        } else {
            return noDiscount;
        }
    }

    //Getters and Setters
    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

    public int getMinQty() {
        return minQty;
    }

    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }
}
