package rbs.discountstrategy;
public class Customer {
    
    private String customerName;
    private String customerId;

    public Customer(String customerName, String customerID) {
        setCustomerName(customerName);
        setCustomerId(customerID);
    }

    public String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String customerName) {
        //Needs Validation
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String customerId) {
        //Needs Validation
        this.customerId = customerId;
    }
    
}
