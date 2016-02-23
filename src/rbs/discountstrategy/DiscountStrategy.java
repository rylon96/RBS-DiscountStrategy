package rbs.discountstrategy;
public interface DiscountStrategy {
    
    public abstract double getDiscountAmount(int qty, double unitCost);
    
}
