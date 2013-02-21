package bakdiscountstrategy;

public interface DiscountStrategy {

    //This is the method that the Discount Strategies will override
    public abstract double getDiscountAmt(double productPrice, int qty);
}
