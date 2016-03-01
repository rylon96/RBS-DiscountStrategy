package rbs.discountstrategy;
public class LineItem {
    private Product product;
    private int qty;
    private double tax = 0.05;

    public LineItem(String productId, int qty, DatabaseStrategy db) {
        setProduct(db.findProductById(productId));
        setQty(qty);
    }
    //Pre Discount and Tax
    public final double getLineItemSubTotal(){
        return qty * product.getUnitCost();
    }
    
    public final double getLineItemTax(){
       
        
        return qty * product.getUnitCost() * tax;
    }
    
    public final double getLineItemDiscount(){
        return product.getDiscount().getDiscountAmount(qty, product.getUnitCost());
    }
    //Post Discount and Tax
    public final double getLineItemDiscountTaxSubTotal(){
        return qty * product.getUnitCost() - getLineItemDiscount() - getLineItemTax();
    }
    
    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        //Needs Validation
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        //Needs Validation
        this.qty = qty;
    }

    public final double getTax() {
        return tax;
    }

    public final void setTax(double tax) {
        this.tax = tax;
    }
    
    
}
