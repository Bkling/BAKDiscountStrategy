package bakdiscountstrategy;

public class QtyDiscountStrategy implements DiscountStrategy {

    //Qty percentage
    private final double PER = 0.1;
    private final int minQty = 3;
    private final double noDiscount = 0.0;

    @Override
    public double getDiscountAmt(double productPrice, int qty) {
        if (qty >= minQty) {
            return (productPrice * qty) * PER;
        } else {
            return noDiscount;
        }
    }
}
