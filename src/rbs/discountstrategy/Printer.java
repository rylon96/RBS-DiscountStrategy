package rbs.discountstrategy;
public class Printer {
    private Receipt receipt;
    
    
    public final void printReceipt(){
        getReceipt().getRecieptFormat();
        getReceipt().getRecieptData();        
    }

    public final Receipt getReceipt() {
        return receipt;
    }

    public final void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }
    
    
    
}
