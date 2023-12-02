
public class Main {
    public static void main(String[] args) {
        /*
        try {
            // Exception Oluşturabilecek Kodlar
        }
        
        catch(Exception_Türü e) {
            // Exception Durumunda Yapılacak İşlemler
        }
        */
        
       // int a = 30 / 0; // Unchecked Exception
       // int[] a = {1,2,3,4,5};
        
        // System.out.println(a[6]);
        
        //System.out.println("Burası çalışıyor...");
        
        try {
            int[] a = {1,2,3,4,5};
            System.out.println(a[3]);
            int b = 30 / 12;
            
            
            
            
            
        }
        
        catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez...");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Arrayin boyunu aştınız...");
        }
        catch (Exception e) {
            System.out.println("Bir hata oluştu...");
            e.printStackTrace();
            
        }
        
        
        System.out.println("Burası Çalışıyor....");
    }
    
    
    
    
}
