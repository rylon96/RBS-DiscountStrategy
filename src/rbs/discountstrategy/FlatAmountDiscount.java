package rbs.discountstrategy;
public class FlatAmountDiscount implements DiscountStrategy {
    
    private double discountRate;

    public FlatAmountDiscount(double discountRate) {
        //Needs Validation
        setDiscountRate(discountRate);
    }
    
    @Override
    public final double getDiscountAmount(int qty, double unitCost) {
        //needs validation
        return unitCost - discountRate;
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        //needs validation
        this.discountRate = discountRate;
    }


    
}
