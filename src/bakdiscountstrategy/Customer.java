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
    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        //Needs Validation
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        //Needs Validation
        this.custName = custName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        //Needs Validation
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        //Needs Validation
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        //Needs Validation
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        //Needs Validation
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        //Needs Validation
        this.state = state;
    }
}
