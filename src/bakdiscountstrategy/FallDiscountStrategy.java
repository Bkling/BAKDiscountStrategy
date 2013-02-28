package bakdiscountstrategy;
/**
 * This class implements the discount strategy class.
 * @author Benjamin Kling, bkling@my.wctc.edu
 * version 1.00
 */
public class FallDiscountStrategy implements DiscountStrategy {

    //The fall percentage
    private  double per = 0.2;

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
