package bakdiscountstrategy;

public class Receipt {

    //Properties of a Receipt
    private Customer customer;
    private LineItem lineItems[] = new LineItem[0];

    //Receipt Constructor
    public Receipt(String custID) {
        customer = getCustomer(custID);
    }
    //Array of Customers
    Customer[] customers = {
        new Customer("6175", "Benjamin A. Kling"),
        new Customer("8045", "Brian A. Kling"),
        new Customer("8048", "Barbara A. Kling"),
        new Customer("8041", "Betsy A. Kling")
    };

    //Sort through the Customer Array
    public Customer getCustomer(String custID) {
        Customer customer = null;
        for (Customer c : customers) {
            if (custID.equals(c.getCustID())) {
                customer = c;
                break;
            }
        }
        return customer;
    }

    public void setCustomer(Customer customer) {
        //Needs Validation
        this.customer = customer;
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        //Needs Validation
        this.lineItems = lineItems;
    }

    public void addLineItem(String prodID, int qty) {
        LineItem item = new LineItem(prodID, qty);
        addItemToArray(item);
    }

    private void addItemToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

    public double getTotalBeforeDiscount() {
        double total = 0.0;
        for (LineItem item : lineItems) {
            total += item.getProductAmount();
        }
        return total;
    }

    public double getTotalAfterDiscount() {
        double total = 0.0;
        for (LineItem item : lineItems) {
            total += item.getDiscount();
        }
        return total;
    }

    public String getDisplay() {
        String data;
        data = "Welcome to Kohl's. Expect Great Things \n";
        data += "------------------------------------------- \n";
        data += "Customer Name: " + customer.getCustName() + "\n";
        data += "------------------------------------------- \n";
        for (int i = 0; i < lineItems.length; i++) {
            data += "Item Name: " + lineItems[i].getDiscription() + "\n";
            data += "Item Number: " + lineItems[i].getProduct() + "\n";
            data += "Quantity: " + lineItems[i].getQty() + "\n";
            data += "Product Price: " + lineItems[i].getProductAmount() + "\n";
        }
        data += "------------------------------------------- \n";
        data += "Total Before Discount: " + getTotalBeforeDiscount() + "\n";
        data += "Money Saved With Discount: " + getTotalAfterDiscount() + "\n";
        double totalBill = getTotalBeforeDiscount() - getTotalAfterDiscount();
        data += "Total Bill: " + totalBill;
        return data;
    }
}
