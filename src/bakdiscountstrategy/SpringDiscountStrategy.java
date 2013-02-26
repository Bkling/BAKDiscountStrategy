package bakdiscountstrategy;

public class SpringDiscountStrategy implements DiscountStrategy {

    //The spring percentage
    private  double per = 0.15;

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
