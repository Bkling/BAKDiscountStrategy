package bakdiscountstrategy;

public class SummerDiscountStrategy implements DiscountStrategy {

    //The summer percentage
    private double per = 0.25;

    @Override
    public double getDiscountAmt(double productPrice, int qty) {
        return (productPrice * per) * qty;
    }

    //Getters and Setters
    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }
}
