package rbs.discountstrategy;
public class Receipt {
    private DatabaseStrategy db;
    private Customer customer;
    
    public Receipt(String customerId, DatabaseStrategy db){
        setDb(db);
        setCustomer(db.findCustomerById(customerId));
    }

    public final DatabaseStrategy getDb() {
        return db;
    }

    public final void setDb(DatabaseStrategy db) {
        this.db = db;
    }

    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
}
