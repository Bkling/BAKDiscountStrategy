package bakdiscountstrategy;

public class CashRegister {

    //Properties of a Cash Register
    private Receipt receipt;

    public void startNewSale(String custID) {
        receipt = new Receipt(custID);
    }

    public void addItemToSale(String prodID, int qty) {
        receipt.addLineItem(prodID, qty);
    }

    public void getOutput() {
        System.out.println(receipt.getDisplay());
    }
}
