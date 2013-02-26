package bakdiscountstrategy;

public class NoDiscountStrategy implements DiscountStrategy {

    //no percentage
    private double per = 0.0;

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
