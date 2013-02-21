package bakdiscountstrategy;

public class SpringDiscountStrategy implements DiscountStrategy {

    //The spring percentage
    private final double PER = 0.15;

    @Override
    public double getDiscountAmt(double productPrice, int qty) {
        return (productPrice * PER) * qty;
    }
}
