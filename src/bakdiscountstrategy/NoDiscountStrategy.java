package bakdiscountstrategy;

public class NoDiscountStrategy implements DiscountStrategy {
    //no percentage
    private final double PER = 0.0;
    @Override
    public double getDiscountAmt(double productPrice, int qty) {
        return (productPrice * PER) * qty;
    }
}
