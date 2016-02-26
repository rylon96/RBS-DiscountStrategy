package rbs.discountstrategy;
public class Receipt {
    private DatabaseStrategy db;
    private Customer customer;
    private LineItem[] lineItems;
    
    public Receipt(String customerId, DatabaseStrategy db){
        setDb(db);
        setCustomer(db.findCustomerById(customerId));
        lineItems = new LineItem[0];
    }
    public final void addItemToReceipt(String productId, int qty){
        LineItem item = new LineItem(productId,qty, db);
        
        addItemToArray(lineItems, item);
    }
    private void addItemToArray(LineItem[] origArray, LineItem item){
        LineItem[] tempArray = new LineItem[origArray.length + 1];
       System.arraycopy(origArray, 0, tempArray, 0, origArray.length);
       tempArray[tempArray.length - 1] = item;
       origArray = tempArray;
       lineItems = origArray;
    }
    
    public final String getRecieptData(){
    
    String data; 
    data = "Date: " + "1/2/2016" + "\n" 
            + "Thank you for shopping at Kohls \n" 
            + "ProductID        Product        Cost        Qty        Discount \n";
    
    return data;
    
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

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }
    
}