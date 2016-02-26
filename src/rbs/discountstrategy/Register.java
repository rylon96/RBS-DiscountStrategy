package rbs.discountstrategy;
public class Register {
    private Receipt receipt;
    private String storeName;
    
    public final void startNewSale(String customerId, DatabaseStrategy db){
        //needs validation
        receipt = new Receipt(customerId, db);
    }
    
    public final void endSale(){
        
    }
    
    public final  void addItemToSale(String productId, int qty){
        receipt.addItemToReceipt(productId, qty);
    }

    public final Receipt getReceipt() {
        return receipt;
    }

    public final void setReceipt(Receipt receipt) {
        //Needs validation
        this.receipt = receipt;
    }
    
}
