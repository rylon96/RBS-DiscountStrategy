package rbs.discountstrategy;
public class FakeDatabase {
    private Customer[] customers = {
      new Customer("100","Billy Bob"),
      new Customer("200","Francis Ajax"),
      new Customer("300","Peter Willy")
    };
    
    
    private Product[] products = {
        new Product("001","Green Hat", 11.99, new PercentOffDiscount(.10)),
        new Product("002","Blue Shirt", 9.99, new FlatAmountDiscount(5.00)),
        new Product("003","Red Pants", 15.99, new NoDiscount())
    };
    
}
