package rbs.discountstrategy;
public class Customer {
    
    private String customerId;
    private String customerName;
    

    public Customer(String customerID, String customerName) {
        setCustomerId(customerID);
        setCustomerName(customerName);
    }

    public final String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String customerName) {
        //Needs Validation
        this.customerName = customerName;
    }

    public final String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String customerId) {
        //Needs Validation
        this.customerId = customerId;
    }
    
}
