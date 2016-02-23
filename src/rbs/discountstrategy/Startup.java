package rbs.discountstrategy;
public class Startup {
    public static void main(String[] args) {
        //KLUDGE: Do Config here
        DatabaseStrategy db = new FakeDatabase();
        
        
        //Start Talking to Objects
        Register register = new Register();
        register.startNewSale("100", db);
    }
    
}
