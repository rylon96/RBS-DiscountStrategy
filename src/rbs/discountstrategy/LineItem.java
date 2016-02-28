package rbs.discountstrategy;
public class LineItem {
    private Product product;
    private int qty;

    public LineItem(String productId, int qty, DatabaseStrategy db) {
        setProduct(db.findProductById(productId));
        setQty(qty);
    }
    //Pre Discount
    public final double getLineItemSubTotal(){
        return qty * product.getUnitCost();
    }
    
    public final double getLineItemDiscount(){
        return product.getDiscount().getDiscountAmount(qty, product.getUnitCost());
    }
    //Post Discount
    //public final double getLineItemTotal(){
    //    return qty * product.getUnitCost() - 
    //}
    
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
    
    
}
