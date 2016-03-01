package rbs.discountstrategy;
public class Printer {
    private Register register;
    private Receipt receipt;
    
    public final void printReceipt(){
        receipt.getRecieptToBePrinted();
    }

    public final Receipt getReceipt() {
        return receipt;
    }

    public final void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }
    
    
    
}
