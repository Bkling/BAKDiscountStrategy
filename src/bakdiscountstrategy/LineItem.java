package bakdiscountstrategy;

public class LineItem {

    //Properties of a line item
    private Product product;
    private int qty;
    //The array of products the store sells
    Product products[] = {
        new Product("AC130", "Sweeny Todd Movie", 24.95, new WinterDiscountStrategy()),
        new Product("B23R", "Nerf Nstrike Dart Gun", 19.99, new NoDiscountStrategy()),
        new Product("M216", "Head & Shoulders Shampoo", 6.39, new SummerDiscountStrategy()),
        new Product("R180", "Frying Pan", 15.95, new SpringDiscountStrategy())
    };

    //Line Item Constructor
    public LineItem(String prodID, int qty) {
        product = getProductID(prodID);
        this.qty = qty;
    }

    public final String getProduct() {
        return (product.getProductID());
    }

    public final void setProduct(Product product) {
        //Needs Validation
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        //Needs Validation
        this.qty = qty;
    }

    public final String getDiscription() {
        return product.getDescription();
    }

    public final double getDiscount() {
        return (product.getDiscount(qty));
    }

    public final double getProductAmount() {
        return product.getProductPrice() * qty;
    }

    //Sorts through the Product Array
    public final Product getProductID(String prodId) {
        Product product = null;
        for (Product p : products) {
            if (prodId.equals(p.getProductID())) {
                product = p;
                break;
            }
        }
        return product;
    }
}
