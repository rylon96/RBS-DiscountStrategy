package rbs.discountstrategy;
public interface DatabaseStrategy {
    Customer findCustomerById(String customerId);
    
    Product findProductById(String productId);
}
