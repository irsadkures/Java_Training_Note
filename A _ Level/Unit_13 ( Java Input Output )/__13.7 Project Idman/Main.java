
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Main {
    public static void main(String[] args) {
        // Idman Oluşturma Programı
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Idman Programına Hoşgeldiniz...");
        
        String idmanlar = "Geçerli Hareketler...\n"
                          + "Burpee\n"
                          +"Pushup(Şınav)\n"
                          +"Situp(Mekik)\n"
                          +"Squat";
        System.out.println(idmanlar);
        
        System.out.println("Bir idman oluşturun...");
        
        System.out.print("Burpee Sayısı : ") ;
        int burpee = scanner.nextInt();
        System.out.print("Pushup Sayısı : ") ;
        int pushup = scanner.nextInt();
        System.out.print("Situp Sayısı : ") ;
        int situp = scanner.nextInt();
        System.out.print("Squat Sayısı : ") ;
        int squat = scanner.nextInt();
        
        scanner.nextLine();
        
    
        Idman idman = new Idman(burpee, pushup, situp, squat);
        
        System.out.println("İdmanınız Başlıyor.....");
        
        int i =  1;
        
        try(FileWriter writer = new FileWriter("log.txt")) {
            writer.write("Idman Programı...\n");
            writer.write("Burpee Sayısı : " + idman.getBurpee_sayisi() + " \n");
            writer.write("Pushup Sayısı : " + idman.getPushup_sayisi()+ " \n");
            writer.write("Situp Sayısı : " + idman.getSitup_sayisi()+ " \n");
            writer.write("Squat Sayısı : " + idman.getSquat_sayisi()+ " \n");
           
          
        while (idman.idmanBittiMi() == false){
            
            System.out.print("Hareket Türü(Burpee,Pushup,Situp,Squat) : ");
            String tur = scanner.nextLine();
            System.out.print("Bu hareketten kaç tane yapacaksınız ? : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur, sayi);
            
            writer.write(i + ".İşlem ---------->  Hareket : " + tur + " Sayı : " + sayi + "\n");
            i++;
            
            
        }
        
        System.out.println("Idmanını başarıyla bitirdin....");
    
    
    }   catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
