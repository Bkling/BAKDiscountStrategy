package bakdiscountstrategy;

/**
 * This class is a down-graded version of what a cash register does.
 *
 * @author Benjamin Kling, bkling@my.wctc.edu, version 1.00
 */
public class CashRegister {

    //Properties of a Cash Register
    private Receipt receipt;

    /**
     * This method starts a new sale and talks to the receipt class
     *
     * @param custID - uses a customer id to start a new sale
     */
    public final void startNewSale(String custID) {
        receipt = new Receipt(custID);
    }

    /**
     * THis method adds a item to a sale and talks to the receipt class
     *
     * @param prodID - uses a product id to add an item to a sale
     * @param qty - uses a quantity to add an item to a sale
     */
    public final void addItemToSale(String prodID, int qty) {
        receipt.addLineItem(prodID, qty);
    }

    /**
     * This method gets the output from the receipt class
     */
    public final void getOutput() {
        System.out.println(receipt.getDisplay());
    }
}
