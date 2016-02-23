package rbs.discountstrategy;
public class Product {
    private String productName;
    private String productId;
    private double unitCost;
    private DiscountStrategy discount;

    public Product(String productName, String productId, double unitCost, DiscountStrategy discount) {
        setProductName(productName);
        setProductId(productId);
        setUnitCost(unitCost);
        setDiscount(discount);
        
    }

    public final String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) {
        //Needs Validation
        this.productName = productName;
    }

    public final String getProductId() {
        return productId;
    }

    public final void setProductId(String productId) {
        //Needs Validation
        this.productId = productId;
    }
    
    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(double unitCost) {
        //Needs Validation
        this.unitCost = unitCost;
    }

    public final DiscountStrategy getDiscount() {
        return discount;
    }

    public final void setDiscount(DiscountStrategy discount) {
        //Needs Validation
        this.discount = discount;
    }
    
}
