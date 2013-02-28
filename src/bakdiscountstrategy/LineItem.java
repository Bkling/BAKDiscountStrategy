package bakdiscountstrategy;

/**
 * This class represents a line item in a receipt class.
 *
 * @author Benjamin Kling, bkling@my.wctc.edu, version 1.00
 */
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

    /**
     * This method gets the product id
     *
     * @return - a product id
     */
    public final String getProduct() {
        return (product.getProductID());
    }

    /**
     * This method sets a product using an argument
     *
     * @param product - a valid product
     */
    public final void setProduct(Product product) {
        //Needs Validation
        this.product = product;
    }

    /**
     * This method gets a quantity
     *
     * @return - a quantity
     */
    public final int getQty() {
        return qty;
    }

    /**
     * This method sets a quantity using an argument
     *
     * @param qty - a valid quantity
     */
    public final void setQty(int qty) {
        //Needs Validation
        this.qty = qty;
    }

    /**
     * This method gets the description of a product
     *
     * @return - a product description
     */
    public final String getDescription() {
        return product.getDescription();
    }

    /**
     * This method gets the discount of a product
     *
     * @return - a product discount
     */
    public final double getDiscount() {
        return (product.getDiscount(qty));
    }

    /**
     * This method gets the product amount
     *
     * @return - a product amount price
     */
    public final double getProductAmount() {
        return product.getProductPrice() * qty;
    }

    //Sorts through the Product Array
    /**
     * This method gets the product id using an argument
     *
     * @param prodId - uses the product id
     * @return - a valid product id
     */
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
