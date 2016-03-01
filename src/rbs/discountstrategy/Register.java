package rbs.discountstrategy;
public class Register {
    private Receipt receipt;
    private Printer printer;
    private String storeName;
    
    public final void startNewSale(String customerId, DatabaseStrategy db){
        //needs validation
        receipt = new Receipt(customerId, db);
        printer = new Printer();
    }
    
    public final void endSale(){
        //printer.printReceipt();
        receipt.getRecieptToBePrinted();
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

    public final Printer getPrinter() {
        return printer;
    }

    public final void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    
    
    
}
