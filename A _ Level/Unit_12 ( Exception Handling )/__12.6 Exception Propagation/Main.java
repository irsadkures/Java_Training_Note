
public class Main {
    
    public static void ucuncufonksiyon() {
        
        int a = 12 / 0;
         
        
    }
    
    public static void ikincifonksiyon() {
       
        
        try {
            ucuncufonksiyon();
         } catch (Exception e) {
            System.out.println("aaaaaaaaaa");
         }
       
    }
    public static void birincifonksiyon() {
        
        ikincifonksiyon();
        
    }
    public static void main(String[] args) {
        
        birincifonksiyon();
        
        
    }
}
