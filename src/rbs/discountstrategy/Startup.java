package rbs.discountstrategy;
public class Startup {
    public static void main(String[] args) {
        //KLUDGE: Do Config here
        DatabaseStrategy db = new FakeDatabase();
        
        
        //Start Talking to Objects
        Register register = new Register(); 
        Printer printer = new Printer();
       
        register.startNewSale("100", db);
        
        //Test 1
       
        
        //Test 2
        register.addItemToSale("001", 2);
        register.addItemToSale("002", 2);
        register.addItemToSale("003", 6);
        
        LineItem[] items = register.getReceipt().getLineItems();
        
        register.endSale();
        
        
        
        //printer.printReceipt();
                    
        }
        

        
    }
    

