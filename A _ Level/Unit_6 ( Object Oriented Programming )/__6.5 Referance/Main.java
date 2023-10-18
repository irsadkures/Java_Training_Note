
public class Main {
    
    public static void main(String[] args) {
        
        Account account1 = new Account("irşad küreş","example@gmail.com","123456");
        
        Account account2 = account1;
        
        //Account account3 = new Account();
        
        if (account1 == account2 ) {
            System.out.println("Aynı Objeyi gösteriyorlar...");
            
        }
        else {
            System.out.println("Aynı Objeyi göstermiyorlar....");
        }
        
        new Account("irşad küreş","example@gmail.com","123456").bilgilerigoster();
        
        
        
        
    }
    
}
