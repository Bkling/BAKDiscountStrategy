package bakdiscountstrategy;

public class WinterDiscountStrategy implements DiscountStrategy {

    //The winter percentage
    private double per = 0.4;

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
