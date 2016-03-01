package rbs.discountstrategy;
public class PercentOffDiscount implements DiscountStrategy{

    private double discountRate;
    
    public PercentOffDiscount(double discountRate){
        setDiscountRate(discountRate);
    }
    
    @Override
    public final double getDiscountAmount(int qty, double unitCost) {
        //Needs Validation
        return unitCost * qty * discountRate;
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        //Needs Validation
        this.discountRate = discountRate;
    }


    
}
