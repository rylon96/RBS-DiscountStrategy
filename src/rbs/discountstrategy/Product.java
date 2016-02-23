package rbs.discountstrategy;
public class Product {
    private String productName;
    private String productId;
    private String unitCost;

    public Product(String productName, String productId, String unitCost) {
        setProductName(productName);
        setProductId(productId);
        setUnitCost(unitCost);
    }

    public String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) {
        //Needs Validation
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public final void setProductId(String productId) {
        //Needs Validation
        this.productId = productId;
    }
    
    public String getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(String unitCost) {
        //Needs Validation
        this.unitCost = unitCost;
    }
}
