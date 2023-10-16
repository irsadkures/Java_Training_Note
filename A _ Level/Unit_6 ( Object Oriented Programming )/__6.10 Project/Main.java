
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        Çalışanlar Programı
        
        Calisan Sınıfı Şeklinde Bir Üst Sınıf
        
        Calisan Sınıfından Türeyen Yazilimci adında Bir Alt Sınıf
        Calisan Sınıfından Türeyen Yonetici adında Bir Alt Sınıf

        */
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Çalışanlar Programına Hoşgeldiniz...");
        
        String islemler = "İşlemler...\n"
                          + "1. Yazılımcı İşlemleri\n"
                          + "2. Yönetici İşlemleri\n"
                          + "Çıkış İçin q'ya basın";
        System.out.println("**********************************");
        System.out.println(islemler);
        System.out.println("**********************************");
        
        while (true) {
            System.out.print("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                
                System.out.println("Programdan Çıkılıyor...");
                break;
                
            }
            else if (islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("irşad küreş","techdil", 567,"Python,C,Java");
                String yazilimci_islem = "1. Format At\n"
                                         +"2. Bilgileri Göster\n"
                                         + "Çıkış için q'ya basın";
                System.out.println(yazilimci_islem);
                
                while (true) {
                    System.out.print("İşlemi Seçiniz : ");
                    String y_islem = scanner.nextLine();
                    
                    if (y_islem.equals("q")) {
                        System.out.println("Yazılımcı İşlemlerinden Çıkılıyor...");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        
                        System.out.print("İşletim Sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                        
                    }
                    else if (y_islem.equals("2")){
                        
                        yazilimci.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz Yazılımcı İşlemi...");
                    }
                    
                }
                
            }
            else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("ali","devlet", 123, 10);
                
                String yonetici_islem = "Yönetici İşlemleri\n"
                                        + "1. Zam Yap\n"
                                        + "2. Bilgileri Göster\n"
                                        + "Çıkış için q'ya basın";
                System.out.println(yonetici_islem);
                
                while (true) {
                    System.out.println("İşlemi Seçiniz: ");
                    String y_islem = scanner.nextLine();
                    
                    if (y_islem.equals("q")){
                        System.out.println("Yönetici İşlemlerinden Çıkılıyor...");
                        break;
                        
                    }
                    else if (y_islem.equals("1")) {
                        System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz : ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                        
                    }
                    else if (y_islem.equals("2")){
                        yonetici.bilgileriGoster();
                        
                    }
                    else {
                        System.out.println("Geçersiz Yönetici İşlemi....");
                    }
                    
                    
                }
                
            }
            else {
                System.out.println("Geçersiz İşlem....");
            }
            
            
        }
        
        
    }
}
