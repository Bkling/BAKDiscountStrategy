package bakdiscountstrategy;

public class Customer {

    //Properties of a customer 
    private String custID;
    private String custName;
    private String phone;
    private String address;
    private String city;
    private String zip;
    private String state;

    //Customer Constructor
    public Customer(String custID, String custName) {
        this.custID = custID;
        this.custName = custName;
    }

    //Getters and Setters for the properties
    public final String getCustID() {
        return custID;
    }

    public final void setCustID(String custID) {
        //Needs Validation
        this.custID = custID;
    }

    public final String getCustName() {
        return custName;
    }

    public final void setCustName(String custName) {
        //Needs Validation
        this.custName = custName;
    }

    public final String getPhone() {
        return phone;
    }

    public final void setPhone(String phone) {
        //Needs Validation
        this.phone = phone;
    }

    public final String getAddress() {
        return address;
    }

    public final void setAddress(String address) {
        //Needs Validation
        this.address = address;
    }

    public final String getCity() {
        return city;
    }

    public final void setCity(String city) {
        //Needs Validation
        this.city = city;
    }

    public final String getZip() {
        return zip;
    }

    public final void setZip(String zip) {
        //Needs Validation
        this.zip = zip;
    }

    public final String getState() {
        return state;
    }

    public final void setState(String state) {
        //Needs Validation
        this.state = state;
    }
}
