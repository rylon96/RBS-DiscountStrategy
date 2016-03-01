package rbs.discountstrategy;
public class LineItem {
    private Product product;
    private Receipt receipt;
    private int qty;

    public LineItem(String productId, int qty, DatabaseStrategy db) {
        setProduct(db.findProductById(productId));
        setQty(qty);
    }
    //Pre Discount and Tax
    public final double getLineItemSubTotal(){
        return qty * product.getUnitCost();
    }
    
    public final double getLineItemTax(){
        double tax = 0.05;
        
        return qty * product.getUnitCost() * tax;
    }
    
    public final double getLineItemDiscount(){
        return product.getDiscount().getDiscountAmount(qty, product.getUnitCost());
    }
    //Post Discount and Tax
    public final double getLineItemDiscountTaxSubTotal(){
        return qty * product.getUnitCost() - getLineItemDiscount() - getLineItemTax();
    }
    
    //Pre Discount
    
    //How do I calculate the total.
    //Need Help
    //public final double getLineItemTotal(){}
    //public final double getLineItemDiscountTotal(){}
    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        this.qty = qty;
    }

    public final Receipt getReceipt() {
        return receipt;
    }

    public final void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }
    
    
}
