package rbs.discountstrategy;
public class NoDiscount implements DiscountStrategy{
    
    private final int NO_DISCOUNT = 0;
    
    @Override
    public final double getDiscountAmount(int qty, double unitCost) {
        //Needs Validation
    return NO_DISCOUNT;
        
    }
    
}
