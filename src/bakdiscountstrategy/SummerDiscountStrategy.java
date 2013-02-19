package bakdiscountstrategy;

public class SummerDiscountStrategy implements DiscountStrategy {
    //The summer percentage
    private final double PER = 0.25;
    @Override
    public double getDiscountAmt(double productPrice, int qty) {
        return (productPrice * PER) * qty;
    }
    
}
