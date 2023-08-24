//-------------------------------------------------------------------------------------------------------------
//                                                                                   Karşılaştırma operatörleri
public class Main {
    public static void main(String[] args) {
        /*
        Karşılaştırma Operatörleri
        
        == ---> Eşit mi ? 
        != ---> Eşit Değil mi ?
        > ----> Büyük mü ?
        >= ---> Büyük veya Eşit mi ?
        < ----> Küçük mü ? 
        <= ----> Küçük veya Eşit mi ? 
        
        */
        System.out.println(3 == 4);
        System.out.println(3 != 4);
        System.out.println(2 > 1);
        System.out.println(2 >= 3);
        System.out.println(2 < 1);
        System.out.println(2 <= 1);
        System.out.println("techdil" == "techdil");  
    }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                        Mantıksal Operatörler
public class Main {

    public static void main(String[] args) {
          /*
          Mantıksal Operatörler
          && --> and Operatörü
          Bütün sonuçlar kendi içinde true ise genel sonuç true, en az birisi bile false ise genel sonuç false olur.
          
          || --> or Operatörü
          Sonuçlardan en az birisi bile true ise genel sonuç true,hepsi false ise genel sonuç false olur.
        
          ! ---> not Operatörü       
          */
          /*
          System.out.println(3 == 3);
          System.out.println(2 < 3);
          System.out.println("techdil" =="techdil");*/
          
          
          //System.out.println(3 != 3 || 2 > 3 || "techdil" !="techdil");
          
          //System.out.println(!(3 < 4));
          
          System.out.println(!((3 < 4 && "techdil" == "techdil") || 3.4 > 2.1));  
    }  
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                                   if ve else
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        if (kosul) {
            Koşul sağlanınca(true) bu blok çalışır. 
        }
        else {
            Bu bloğun üstündeki herhangi bir koşul sağlanmadığında bu blok çalışır.
        }
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin:");
        int sayi = scanner.nextInt();
        if (sayi < 0) {
            System.out.println("Negatif");    
        }
        else {
            System.out.println("Pozitif veya 0"); 
        }    
    }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                         if / else if / else
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        /*
        if (kosul) {
        
        
        }
        else if (baska bir kosul) {
        
        }
        
        else if (baska bir kosul) {
        
        }
        
                //
                //
        else {
        
            
        }
        
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz:");
        int not = scanner.nextInt();
        
        if (not >= 90) {
            System.out.println("AA");
            
        }
        else if (not >=  85) {
            System.out.println("BA");

        }
        else if (not >=  80) {
            System.out.println("BB");

        }
        else if (not >=  75) {
            System.out.println("CB");

        }
        else if (not >=  70) {
            System.out.println("CC");

        }
        else if (not >=  65) {
            System.out.println("DC");

        }
        else if (not >=  60) {
            System.out.println("DD");

        }
        
        else {
            System.out.println("Dersten Kaldınız...");

            
        }              
    }
}

                                                                                         
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz:");
        int not = scanner.nextInt();
        
        if (not >= 90) {
            System.out.println("AA");
            
        }
        if (not >=  85) {
            System.out.println("BA");

        }
        if (not >=  80) {
            System.out.println("BB");

        }
        if (not >=  75) {
            System.out.println("CB");

        }
        if (not >=  70) {
            System.out.println("CC");

        }
        if (not >=  65) {
            System.out.println("DC");

        }
        if (not >=  60) {
            System.out.println("DD");

        }
        
        else {
            System.out.println("Dersten Kaldınız...");

            
        }              
    }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                         Switch Case Yapıları
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        /*
        switch(op) {
            case durum1:
                islemler
                break
            case durum2:
                islemler
                
                break
                //
                //
            default:
                islemler
                break
        }
        
        */
        
        Scanner scanner = new Scanner(System.in);
        int islem = scanner.nextInt();
        
        switch(islem){
            case 1:
                System.out.println("1.işlem");
                
            case 2:
                System.out.println("2.işlem");
                break;
            case 3:
                System.out.println("3.işlem");
                
            case 4:
                System.out.println("4.işlem");
                
            default:
                System.out.println("Geçersiz işlem...");
                break;    
        }
    }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                                      Örnek_1
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan Alınan 3 Sayıdan En Büyük Sayıyı Bulma
        Scanner scanner =  new Scanner(System.in);
        
        System.out.print("Birinci Sayı : ");
        int a = scanner.nextInt();
        System.out.print("İkinci Sayı : ");
        int b  = scanner.nextInt();
        System.out.print("Üçüncü Sayı : ");
        int c  = scanner.nextInt();
       
        int maks = -1;
        
        if ( a >= b && a >= c) {
            
            maks = a;
        }
        else if (b >= a && b >= c) {
            
            maks = b;
        }
        else {
            
            maks = c;
            
        }
        
        System.out.println("Maksimum Sayı : " + maks);
        
    }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                                      Örnek_2
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alınan boy ve kilo değerlerine göre beden kitle indeksini hesaplayın ve şu kurallara göre ekrana şu yazıları yazdırın.

            Beden Kitle İndeksi: Kilo / Boy(m) *  Boy(m)

            BKİ 18.5'un altındaysa -------> Zayıf

            BKİ 18.5 ile 25 arasındaysa ------> Normal

            BKİ 25 ile 30 arasındaysa --------> Fazla Kilolu

            BKİ 30'un üstündeyse -------------> Obez

        */
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kilonuz:");
        int kilo = scanner.nextInt();
        
        System.out.print("Boy (Örnek : 1,72): ");
        double boy = scanner.nextDouble();
        
        double bki = (kilo / (boy  * boy));
        
        
        if (bki < 18.5) {
            System.out.println("Zayıf");
        }
        else if (bki >= 18.5 && bki < 25) {
            System.out.println("Normal");
        }
        else if (bki >= 25 && bki < 30) {
            System.out.println("Fazla Kilolu");
        }
        else {
            System.out.println("Obez");
        }
    }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                                      Örnek_3
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Switch Case Kullanarak 4 işlem yapan bir hesap makinesi tasarlamaya çalışın.
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        String islemler = "1. Toplama İşlemi\n"
                          +"2. Çıkarma İşlemi\n"
                          +"3. Çarpma İşlemi\n"
                          +"4. Bölme İşlemi";
        System.out.println(islemler);
        System.out.println("************************************");
        System.out.println("İşlemi Seçiniz:");
        String islem = scanner.nextLine();
        int a;
        int b;
        
        switch(islem){
            case "1":
                System.out.print("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.print("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Toplamları : " + (a+b));
                break;
            case "2":
                System.out.print("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.print("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Farkları : " + (a-b));
                break;
            case "3":
                System.out.print("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.print("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Çarpımları : " + (a * b));
                break;
            case "4":
                System.out.print("Birinci Sayı: ");
                a = scanner.nextInt();
                System.out.print("İkinci Sayı: ");
                b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Bölümü : " + ((double)a / b));
                break;
            default:
                System.out.println("Geçersiz İşlem");
        
        }

    }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                                      Örnek_4
import java.util.Scanner;
public class Main {
    /*
    Kullanıcıdan Vize1,Vize2  ve Final notunu alarak bir harf hesaplama sistemi yapmaya çalışın. 
    Ayrıca kullanıcıdan okuldaki genel ortalamasını alarak,  
    DD alma ve 2.50’nin altında olma koşuluna göre ekrana bir tavsiye mesajı yazdırın. 

    Vize1 toplam notun %30'una etki edecek.

    Vize2 toplam notun %30'una etki edecek.

    Final toplam notun %40'ına etki edecek.


    Toplam Not >=  90 -----> AA

    Toplam Not >=  85 -----> BA

    Toplam Not >=  80 -----> BB

    Toplam Not >=  75 -----> CB

    Toplam Not >=  70 -----> CC

    Toplam Not >=  65 -----> DC

    Toplam Not >=  60 -----> DD

    Toplam Not >=  55 -----> FD

    Toplam Not <  55 -----> FF

    */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vize1 : ");
        int vize1  = scanner.nextInt();
        System.out.print("Vize2 : ");
        int vize2  = scanner.nextInt();
        System.out.print("Final : ");
        int finalnot  = scanner.nextInt();
        System.out.print("Okul Ortalamanız:");
        double ortalama = scanner.nextDouble();
        
        double toplamnot = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalnot * 4 / 10.0);
        
        if (toplamnot >= 90) {
            
            System.out.println("AA aldınız...");
        }
        else if (toplamnot >= 85) {
            System.out.println("BA aldınız...");
        }
        else if (toplamnot >= 80) {
            System.out.println("BB aldınız...");
        }
        else if (toplamnot >= 75) {
            System.out.println("CB aldınız...");
        }
        else if (toplamnot >= 70) {
            System.out.println("CC aldınız...");
        }
        else if (toplamnot >= 65) {
            System.out.println("DC aldınız...");
        }
        else if (toplamnot >= 60) {
            System.out.println("DD aldınız...");
            
            if (ortalama < 2.50) {
                
                System.out.println("DD aldınız ve Not ortalamanız düşük. Bu dersi tekrardan almayı düşünebilirsiniz.");
            }
        }
        else if (toplamnot >= 55) {
            System.out.println("FD aldınız ve Kaldınız...");
        }
        else {
            System.out.println("FF aldınız ve Kaldınız...");
        }
    }
}
