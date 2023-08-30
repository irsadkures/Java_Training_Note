//-------------------------------------------------------------------------------------------------------------
//                                                                                                     for loop
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       /*
        for (baslatma ; kosul ; artırma veya azaltma işlemleri) {
            Döngü koşulumuz doğru olduğu sürece burası çalışacak.
        
        }
        
        */
       
      /* int i;
       
       for (i = 0; i < 5 ; i++) {
           
           System.out.println("i = " + i);
           
       } */
      
     /* for (int i = 0; i < 5 ; i++) {
          System.out.println("i = " + i);
          
      } */
     
     /*for (int i = 10 ; i >= 0 ; i--) {
         
         System.out.println("i = " + i);
         
     }*/
     
     /*int i = 0;
     
     for(; i < 5 ;i++) {
         System.out.println("Java Öğreniyorum...");
     }*/
     
     /*int i = 0;
     int j = 10;
     
     for (; i < 10 && j > 0; i++,j--){
         
         System.out.println("i = " + i);
         System.out.println("j = " + j);
     }*/
     
     /*for (int i = 2 ; i < 100 ; i *= 2){
         System.out.println("i = " + i);
     }*/
     // 5! = 5 4 3 2 1
     
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Bir sayı giriniz:");
     
     int faktoriyel = 1;
     
     int sayi = scanner.nextInt();
     
     for (int i = 1; i <= sayi;i++) {
         
         faktoriyel *= i;
         System.out.println("Faktoriyel = " + faktoriyel + " i = " + i);
         
     }
        System.out.println("Faktöriyel = " + faktoriyel);
    } 
}        
//-------------------------------------------------------------------------------------------------------------
//                                                                                                   While loop                                                       
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        while(döngü koşulu) {
            // Koşul doğru olduğu sürece çalışır.
        }
        
        */
        /*for (int i = 0;i <10 ; i++) {
            System.out.println("i = " + i);
        }*/
        /*Scanner scanner  = new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz:");
        
        int sayi = scanner.nextInt();
        
        int faktoriyel = 1;
        
        while (sayi > 0){
            
            faktoriyel *= sayi;
            sayi--;
            
        }
        System.out.println("Faktoriyel =" + faktoriyel); */
        
        int i = 0;
        
        while (i < 10 ) {
            
            System.out.println("i = " + i );
            i--;
              
        }
                  
    }
    
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                              do - while loop   
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        /*
        do {
            // Koşul doğru olduğu sürece
            // whiledan farkı en az bir kere çalışmasının garanti olması.
        
        }while(koşul);
        
        
        */
       /* int i = 0;
        
        do {
            System.out.println("i = " + i);
            i++;
            
        }while(i < 5);*/
       
       // 1234
       
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("Bir sayı giriniz:");
        
        int sayi = scanner.nextInt();
        int toplam = 0;
        
        do {
            toplam += sayi % 10;
            
            sayi /= 10;
            System.out.println("Sayı: " + sayi);
        }while(sayi > 0);
        
        System.out.println("Rakamları Toplamı = " + toplam);
             
    }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                           Break and Continue
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        /*
            break anahtar kelimesi
         
            Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karşılaştığı zaman çalışmasını durdurur.
            Böylelikle döngü hiçbir koşula bağlı kalmadan sonlanmış olur.
            
            break ifadesi sadece ve sadece içinde bulunduğu döngüyü sonlandırır. Eğer iç içe döngüler varsa
            ve içteki döngüde break kullanılmışsa sadece içteki döngü sona erer.
         
            continue anahtar kelimesi 
            
            Döngü herhangi bir yerde ve herhangi bir zamanda continue ifadesiyle karşılaştığı zaman geri kalan 
            işlemlerini yapmadan direk döngü bloğunun başına döner.
        
            
            
        */
        /*Scanner scanner = new Scanner(System.in);
        
        while(true) {
            
            int islem = scanner.nextInt();
            
            if (islem == -1){
                System.out.println("Döngüden çıkılıyor....");
                break;
            }
            System.out.println("İşlem :" + islem);
            
        }*/
        
        int i = 0;
        
        while (i < 10) {
            
            if (i == 3 || i == 5) {
                i++;
                continue;
            }
            System.out.println("i = " + i );
            i++;
            
        }
               
    }

}

public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        break;
      }
      System.out.println(i);
    }  
  }
}

public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        continue;
      }
      System.out.println(i);
    }  
  }
}


public class Main {
  public static void main(String[] args) {
    int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
      if (i == 4) {
        break;
      }
    }  
  }
}


public class Main {
  public static void main(String[] args) {
    int i = 0;
    while (i < 10) {
      if (i == 4) {
        i++;
        continue;
      }
      System.out.println(i);
      i++;
    }  
  }
}


//-------------------------------------------------------------------------------------------------------------
//                                                                                                      Örnek_1
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*

        While döngüsü yardımıyla bir tane ATM programı yapmaya çalışın.
        
        İşlemler 
        1.İşlem : Bakiye Öğrenme
        2.İşlem : Para Çekme
        3.İşlem : Para Yatırma
        Çıkış : q
        
        */
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1.İşlem : Bakiye Öğrenme\n"
                          + "2.İşlem : Para Çekme\n"
                          + "3.İşlem : Para Yatırma\n"
                          + "Çıkış için q'a basın";
        
        System.out.println("*************************");
        System.out.println(islemler);
        System.out.println("*************************");
        
        while (true) {
            
            System.out.print("İşlemi Seçiniz: ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (islem.equals("1")){
                System.out.println("Bakiyeniz : " + bakiye);
            }
            else if (islem.equals("2")){
                System.out.print("Çekmek istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                if (bakiye - tutar < 0) {
                    
                    System.out.println("Yeterli Bakiye Yok . Bakiyeniz : " + bakiye);
                }
                else {
                    bakiye -= tutar;
                    System.out.println("Yeni bakiyeniz : " + bakiye);
                }
                
                
            }
            else if (islem.equals("3")){
                System.out.print("Yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                bakiye += tutar;
                
                System.out.println("Yeni Bakiyeniz  : " + bakiye);
                
            }
            else {
                System.out.println("Geçersiz İşlem...");
            }  
        } 
        
    }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                                      Örnek_2
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Girilen bir sayının armstrong sayısını olup olmadığını bulmaya çalışın.
        Örneğin, 4 basamaklı bir sayının armstrong sayısı olması için şu şartı sağlaması gerekmektedir.
        1634 = 1^4 + 6^4 + 3^4 + 4^4 (Buradaki 4 basamak sayısı)
        371 = 3^3 + 7^3 + 1^3 (Buradaki 3 basamak sayısı)
    
        Bu programı do while döngüsü yardımıyla yapabilirsiniz.
        */
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayıyı Giriniz: ");
        int sayi = scanner.nextInt();
        System.out.print("Basamak Sayısı : ");
        int basamak_sayisi = scanner.nextInt();
        
        int gecici_sayi = sayi;
        int toplam = 0;
        
        do {
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi /= 10;
            
            toplam += Math.pow(basamak_degeri,basamak_sayisi);
            
        }while(gecici_sayi > 0);
        
        if (sayi == toplam) {
            
            System.out.println("Bu sayı bir armstrong sayısıdır...");
        }
        else {
            System.out.println("Bu sayı bir armstrong sayısı değildir...");
        }
         
    }
}

//-------------------------------------------------------------------------------------------------------------
//                                                                                                      Örnek_3
public class Main {
    public static void main(String[] args) {
      // İç içe for döngüsü kullanarak bir çarpım tablosu oluşturun.
      
      for (int i = 1 ; i <= 10 ; i++) {
          System.out.println("***********************************");
          for (int j = 1 ; j <= 10 ; j++) {
              
              System.out.println( i  + " x " + j + " = " + (i * j));
              
          }
          System.out.println("***********************************");
          
      }
      
    }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                                      Örnek_4
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        // while döngüsü yardımıyla bir kullanıcı girişi yazmaya çalışın.
        
        Scanner scanner = new Scanner(System.in);
        
        int giris_hakki = 3;
        
        String sys_kullanici_adi = "Mustafa Murat";
        String sys_parola = "12345";
        
        System.out.println("*****************************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz...");
        System.out.println("*****************************");
        
        while (true) {
            System.out.print("Kullanıcı Adı : ");
            String kullanici = scanner.nextLine();
            System.out.print("Parola : ");
            String parola = scanner.nextLine();
            
            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Hoşgeldiniz, " + kullanici);
                break;
            }
            else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
                
                System.out.println("Parolanız Yanlış...");
                giris_hakki -= 1;
                
                System.out.println("Giriş Hakkı : " + giris_hakki);
                
                
            }
            else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                
                System.out.println("Kullanıcı Adınız Yanlış...");
                giris_hakki -= 1;
                System.out.println("Giriş Hakkı : " + giris_hakki);

                
            }
            else {
                System.out.println("Kullanıcı Adınız ve Parolanız Yanlış...");
                
                giris_hakki -= 1;
                System.out.println("Giriş Hakkı : " + giris_hakki);

                
            }
            if (giris_hakki == 0){
                
                System.out.println("Giriş hakkınız bitti. Tekrar Bekleriz....");
                break;
            }
           
        }
    }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                                      Örnek_5
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Faiz Uygulaması
        Kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği
        bilgisini alın ve her sene sonunda toplam para miktarını ekrana yazdırın.
        
        Faiz Oranı : %6 Faiz Oranı

        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz. Faiz Oranı %6");
        
        int anapara,vade;
        System.out.print("Yatırmak istediğiniz tutar : ");
        anapara = scanner.nextInt();
        System.out.print("Paranızı kaç yıl vadeli yatırmak istiyorsunuz ? ");
        vade = scanner.nextInt();
        
        double toplampara = anapara;
        double faizOrani = 0.06;
        
        for (int i =  1 ;  i<= vade ; i++) {
            
            toplampara = (toplampara * faizOrani) + toplampara;
            
            System.out.println(i + ".yılın sonunda toplam para : " + (int)toplampara);
            
            
        }     
        
    }
}

