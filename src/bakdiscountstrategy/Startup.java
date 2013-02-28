package bakdiscountstrategy;

/**
 * This class represents the start up of a sale.
 *
 * @author Benjamin Kling, bkling@my.wctc.edu, version 1.00
 */
public class Startup {
/**
 * This method is the start up of the project
 * @param args - uses args to run program
 */
    public static void main(String[] args) {
        //Create a CashRegister Object
        CashRegister cr = new CashRegister();
        //Strat an New Sale
        cr.startNewSale("6175");
        //Add and Item to the Sale
        cr.addItemToSale("AC130", 1);
        cr.addItemToSale("B23R", 1);
        cr.addItemToSale("M216", 2);
        //Display the Receipt
        cr.getOutput();
    }
}
