package bakdiscountstrategy;

public class FallDiscountStrategy implements DiscountStrategy {
    //The fall percentage
    private final double PER = 0.2;
    @Override
    public double getDiscountAmt(double productPrice, int qty) {
        return (productPrice * PER) * qty;
    }
}
