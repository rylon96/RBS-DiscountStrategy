package rbs.discountstrategy;
public class FlatAmountDiscount implements DiscountStrategy {
    
    private double discountRate;

    public FlatAmountDiscount(double discountRate) {
        setDiscountRate(discountRate);
    }
    
    @Override
    public double getDiscountAmount(int qty, double unitCost) {
        //needs validation
        return qty * unitCost - discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        //needs validation
        this.discountRate = discountRate;
    }


    
}
