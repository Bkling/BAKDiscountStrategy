package bakdiscountstrategy;

/**
 * This is partial class that represents a customer of a business.
 *
 * @author Benjamin Kling, bkling@my.wctc.edu, version 1.00
 */
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
    /**
     * This method gets a customer id
     *
     * @return - a customer id
     */
    public final String getCustID() {
        return custID;
    }

    /**
     * This method sets a customer id using an argument
     *
     * @param custID - must be a valid id
     */
    public final void setCustID(String custID) {
        //Needs Validation
        this.custID = custID;
    }

    /**
     * This method gets a customer name
     *
     * @return - a customer name
     */
    public final String getCustName() {
        return custName;
    }

    /**
     * This method sets a customer name using an argument
     *
     * @param custName - must be a valid name
     */
    public final void setCustName(String custName) {
        //Needs Validation
        this.custName = custName;
    }

    /**
     * This method gets a customer phone
     *
     * @return - a customer phone number
     */
    public final String getPhone() {
        return phone;
    }

    /**
     * This method sets a customer phone using an argument
     *
     * @param phone - must be a valid phone number
     */
    public final void setPhone(String phone) {
        //Needs Validation
        this.phone = phone;
    }

    /**
     * This method gets a customer address
     *
     * @return - a customer address
     */
    public final String getAddress() {
        return address;
    }

    /**
     * This method sets a customer address using an argument
     *
     * @param address - must be a valid address
     */
    public final void setAddress(String address) {
        //Needs Validation
        this.address = address;
    }

    /**
     * This method gets a customer city
     *
     * @return - a customer city
     */
    public final String getCity() {
        return city;
    }

    /**
     * This method sets a customer city using an argument
     *
     * @param city - must be a valid city
     */
    public final void setCity(String city) {
        //Needs Validation
        this.city = city;
    }

    /**
     * This method gets a customer zip code
     *
     * @return - a customer zip code
     */
    public final String getZip() {
        return zip;
    }

    /**
     * This method sets a customer zip code using an argument
     *
     * @param zip - must be a valid zip code
     */
    public final void setZip(String zip) {
        //Needs Validation
        this.zip = zip;
    }

    /**
     * This method gets a customer state
     *
     * @return - a customer state
     */
    public final String getState() {
        return state;
    }

    /**
     * This method sets a customer state
     *
     * @param state - must be a valid state
     */
    public final void setState(String state) {
        //Needs Validation
        this.state = state;
    }
}
