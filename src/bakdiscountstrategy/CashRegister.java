package bakdiscountstrategy;

public class CashRegister {

    //Properties of a Cash Register
    private Receipt receipt;

    public final void startNewSale(String custID) {
        receipt = new Receipt(custID);
    }

    public final void addItemToSale(String prodID, int qty) {
        receipt.addLineItem(prodID, qty);
    }

    public final void getOutput() {
        System.out.println(receipt.getDisplay());
    }
}
