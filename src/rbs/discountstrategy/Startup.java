package rbs.discountstrategy;
public class Startup {
    public static void main(String[] args) {
        //KLUDGE: Do Config here
        DatabaseStrategy db = new FakeDatabase();
        
        
        //Start Talking to Objects
        Register register = new Register();
        register.startNewSale("100", db);
        
        //Test 1
        Customer customer = register.getReceipt().getCustomer();
        System.out.println("Customer " + customer.getCustomerName()+ " found and added to receipt");
        
        //Test 2
        register.addItemToSale("001", 2);
        
        LineItem[] items = register.getReceipt().getLineItems();
        
        for(LineItem item : items){
            System.out.println(item.getProduct().getProductName());    
        }
        
    }
    
}
