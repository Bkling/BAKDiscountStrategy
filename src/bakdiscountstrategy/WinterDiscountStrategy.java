package bakdiscountstrategy;

public class WinterDiscountStrategy implements DiscountStrategy {

    //The winter percentage
    private final double PER = 0.4;

    @Override
    public double getDiscountAmt(double productPrice, int qty) {
        return (productPrice * PER) * qty;
    }
}
