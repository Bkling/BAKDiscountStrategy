package bakdiscountstrategy;

public interface DiscountStrategy {
    //This is the method that the Discount Strategies will override
    public abstract double getDiscount(double productPrice, int qty);
}
