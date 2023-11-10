
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        /*
        1. Statik Olmayan Inner Classlar
        2. Statik Inner Classlar
        3. Lokal(Yerel) Inner Classlar
        4. Anonymous(Anonim) Inner Classlar
        
        */
        
        Matematik.Factorial factorial = new Matematik().new Factorial();
        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan alan = new Matematik().new Alan();
        Matematik.Alan.DaireAlan daire_alan = new Matematik().new Alan().new DaireAlan();
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Bir sayı giriniz:");
        
        int sayi = scanner.nextInt();
        
        if (asal.asal_mi(sayi)) {
            
            System.out.println("Bu sayı Asaldır.");
            
        }
        else {
            
            System.out.println("Bu sayı asal değildir..");
        }
        factorial.faktoriyel();
        //alan.daire_alan(5);
        daire_alan.daire_alan(6);
        
    }
    
}
