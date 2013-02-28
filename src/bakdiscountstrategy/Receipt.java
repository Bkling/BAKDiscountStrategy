package bakdiscountstrategy;

import java.text.SimpleDateFormat;
import java.util.*;
/**
 * This class represents a receipt in a business.
 * @author Benjamin Kling, bkling@my.wctc.edu
 * version 1.00
 */
public class Receipt {

    //Properties of a Receipt
    private Customer customer;
    private LineItem lineItems[] = new LineItem[0];
    private String date;
    private String format = "MM/dd/yyyy hh:mm a";

    //Receipt Constructor
    public Receipt(String custID) {
        customer = getCustomer(custID);
    }
    //Date object
    Date receiptDate = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat(format);
    String formattedDate = sdf.format(receiptDate);
    //Array of Customers
    Customer[] customers = {
        new Customer("6175", "Benjamin A. Kling"),
        new Customer("8045", "Brian A. Kling"),
        new Customer("8048", "Barbara A. Kling"),
        new Customer("8041", "Betsy A. Kling")
    };

    //Sort through the Customer Array
    public final Customer getCustomer(String custID) {
        Customer customer = null;
        for (Customer c : customers) {
            if (custID.equals(c.getCustID())) {
                customer = c;
                break;
            }
        }
        return customer;
    }

    public final void setCustomer(Customer customer) {
        //Needs Validation
        this.customer = customer;
    }

    public final LineItem[] getLineItems() {
        return lineItems;
    }

    public final void setLineItems(LineItem[] lineItems) {
        //Needs Validation
        this.lineItems = lineItems;
    }

    public final void addLineItem(String prodID, int qty) {
        LineItem item = new LineItem(prodID, qty);
        addItemToArray(item);
    }

    private final void addItemToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

    public final double getTotalBeforeDiscount() {
        double total = 0.0;
        for (LineItem item : lineItems) {
            total += item.getProductAmount();
        }
        return total;
    }

    public final double getTotalAfterDiscount() {
        double total = 0.0;
        for (LineItem item : lineItems) {
            total += item.getDiscount();
        }
        return total;
    }

    public final String getDisplay() {
        String data;
        data = "Welcome to Kohl's. Expect Great Things \n";
        data += "------------------------------------------- \n";
        data += "Customer Name: " + customer.getCustName() + "\n";
        data += "Date of Purchase: " + formattedDate + "\n";
        data += "------------------------------------------- \n";
        for (int i = 0; i < lineItems.length; i++) {
            data += "Item Name: " + lineItems[i].getDescription() + "\n";
            data += "Item Number: " + lineItems[i].getProduct() + "\n";
            data += "Quantity: " + lineItems[i].getQty() + "\n";
            data += "Product Price: " + lineItems[i].getProductAmount() + "\n";
            data += "Discount Amount: " + lineItems[i].getDiscount() + "\n";
            data += "--------------------------------------- \n";
        }
        data += "Total Before Discount: " + getTotalBeforeDiscount() + "\n";
        data += "Money Saved With Discount: " + getTotalAfterDiscount() + "\n";
        double totalBill = getTotalBeforeDiscount() - getTotalAfterDiscount();
        data += "Total Bill: " + totalBill;
        return data;
    }
}
