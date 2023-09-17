//-------------------------------------------------------------------------------------------------------------
//                                                                                                     Function
import java.util.Scanner;

public class Main {
    public static void selamlama(){
        
        System.out.println("Merhaba Nasılsınız ?");
        System.out.println("Selamlar...");
        
   }
    public static void faktoriyel(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = scanner.nextInt();
        
        int faktoriyel = 1;
        
        while(sayi > 0) {
            
            faktoriyel *= sayi;
            
            sayi--;
        }
        System.out.println("Faktöriyel = " + faktoriyel);
        
    }
    public static void main(String[] args) {
       
        faktoriyel();
        
        faktoriyel();
                 
    }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                         Parameter in Function
public class Main {
    public static void toplama(int a,int b,int c) {
        
        System.out.println("Toplamları = " + (a+b+c));
        
    }
    public static void selamlama(String isim){
        
        System.out.println("Selamlar " + isim);
    }
    public static void main(String[] args) {
    
        /*selamlama("Techdil");
        selamlama("irşad");*/
        
        toplama(3,4,5);
        
        toplama(10,12,20);      
    
    }
}

public class Main {
    static void myMethod(String fname, int age) {
      System.out.println(fname + " is " + age);
    }
  
    public static void main(String[] args) {
      myMethod("irşad", 5);
      myMethod("küreş", 8);
      myMethod("techdil", 31);
    }
  }

  public class Main {

    static void checkAge(int age) {
  
      if (age < 18) {
        System.out.println("Can not come in - You are not old enough!"); 
        
      } else {
        System.out.println("can come in - You are old enough!"); 
      }
      
    } 
  
    public static void main(String[] args) { 
      checkAge(20); 
    } 
  }
//-------------------------------------------------------------------------------------------------------------
//                                                                                           Return in Function
public class Main {
    public static int ikiilecarp(int a) {
        return a*2;
        
    }
    public static int ikiiletopla(int a) {
        
        return a + 2;
    }
    public static int dortilecarp(int a) {
        
        return a * 4;
        
    }
    public static void main(String[] args) {
        
       
        System.out.println("Sonuç " + dortilecarp(ikiiletopla(dortilecarp(4))));
        
    }
}

public class Main {
    static int myMethod(int x, int y) {
      return x + y;
    }
  
    public static void main(String[] args) {
      int z = myMethod(5, 3);
      System.out.println(z);
    }
  }
  
//-------------------------------------------------------------------------------------------------------------
//                                                                                      Overloading in Function
public class Main {
    public static void skorhesapla(String isim, int puan) {
        
        System.out.println(isim + " adlı oyuncunun " + puan + " puanı var");
        
    }
    public static void skorhesapla(int puan) {
        System.out.println("İsimsiz oyuncunun " + puan + " puanı var");
        
    }
    public static void skorhesapla(String isim) {
        System.out.println(isim + " adlı oyuncunun hiç puanı yok.");
    }
   /* public static void toplama(String a,String b) {
        
        System.out.println(a + " " + b);
    }
    public static void toplama(int a,int b) {
        System.out.println("Toplamları = " + (a+b));
        
    }
    public static void toplama(int a,int b,int c) {
        
        System.out.println("Toplamları = " + (a+b+c));
        
    }*/
    
    
    public static void main(String[] args) {
        
        /*toplama(3,4,5);
        toplama(2,5);
        toplama("irşad küreş","techdil");*/
        skorhesapla("irşad",1000);
        skorhesapla("irşad");
        skorhesapla(1500);
            
    }
}

public class Main {
    static int plusMethod(int x, int y) {
      return x + y;
    }
    
    static double plusMethod(double x, double y) {
      return x + y;
    }
    
    public static void main(String[] args) {
      int myNum1 = plusMethod(8, 5);
      double myNum2 = plusMethod(4.3, 6.26);
      System.out.println("int: " + myNum1);
      System.out.println("double: " + myNum2);
    }
  }
  
//-------------------------------------------------------------------------------------------------------------
//                                                                                             Local and Global
public class Main {
    public static void toplama(int a , int b ,int c) {
        
        int deneme = 10;
        System.out.println("Toplama Sonucu: " + (a+b+c));
        
    }
    public static void main(String[] args) {
        toplama(10,20,30);
        System.out.println(deneme);
        
    }
    
}

public class Main {
    public static void main(String[] args) {
  
      // Code here cannot use x
  
      int x = 100;
  
      // Code here can use x
      System.out.println(x);
    }
  }

public class Main {
    public static void main(String[] args) {

    // Code here CANNOT use x

    { // This is a block

    // Code here CANNOT use x

    int x = 100;

    // Code here CAN use x
    System.out.println(x);

    } // The block ends here

// Code here CANNOT use x

   }
}
    

//-------------------------------------------------------------------------------------------------------------
//                                                                                                      Örnek_1
public class Main {
    public static boolean asalMi(int sayi) {
        
        for (int i = 2 ; i < sayi;i++) {
            
            if (sayi % i == 0){
                return false;
                
            }
        }
        return true;
        
        
    }
    public static void main(String[] args) {
        
        
        for (int i = 2 ; i < 1000 ; i++) {
            
            if (asalMi(i)){
                System.out.println(i);
                
            }
        }
        /*
        
        1'den 1000'e kadar olan sayılardan asal olanları ekrana yazdırın.
        
        Asal Sayı : 1'e ve kendisinden başka hiçbir sayıya bölünmeyen sayıya asal sayı denir.
         
        */
        
        
    }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                                      Örnek_2
import java.util.Scanner;

public class Main {
    public static int ebobBulma(int sayi1,int sayi2) {
        
        int ebob = 1;
        
        for (int i = 1; i <= sayi1 && i <= sayi2 ; i++) {
            if ((sayi1 % i == 0) && (sayi2 % i == 0) ){
                
                ebob = i;
            }
           
        }
        return ebob;
        
    }

    public static void main(String[] args) {
        // Kullanıcıdan alınan 2 sayının ebobunu bulma
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci Sayı : ");
        int birinci_sayi = scanner.nextInt();
        
        System.out.print("İkinci Sayı : ");
        int ikinci_sayi = scanner.nextInt();
        System.out.println("İki Sayının Ebobu : " + ebobBulma(birinci_sayi, ikinci_sayi));
           
    }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                                      Örnek_3
import java.util.Scanner;
public class Main {
    /*
    Method Overloading kullanak bir tane hesap makinesi tasarlamaya çalışın.
    Toplama ve Çarpma metodlarını 2 veya 3 parametre alacak şekilde tasarlayın.

    */   
    public static int cikarma(int a,int b) {
        
        return (a - b);
        
    }
    public static double bolme(int a,int b) {
        return ((double)a / b);
        
    }
    public static int toplama(int a,int b){
        
        return (a + b);
        
    }
    public static int toplama(int a,int b,int c) {
        
        return (a + b + c);
    }
    public static int carpma(int a,int b) {
        
        return a * b;
    }
    public static int carpma(int a,int b,int c) {
        return a * b * c;
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String islemler =  "1. Toplama İşlemi\n"
                           +"2. Çıkarma İşlemi\n"
                           + "3. Çarpma İşlemi\n"
                           + "4. Bölme İşlemi\n"
                           + "Çıkış için q'ya basın.";
        System.out.println("****************************************");
        System.out.println(islemler);
        System.out.println("****************************************");

        while (true) {
            System.out.print("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (islem.equals("1")) {
                System.out.print("Kaç değer toplayacaksınız ? (2 veya 3): ");
                
                int kacsayi = scanner.nextInt();
                
                if (kacsayi == 2) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayıların toplamları : " + (toplama(a, b)));
                    
                    
                }
                else if (kacsayi == 3) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    System.out.print("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayıların toplamları : " + (toplama(a, b,c)));
                    
                }
                else {
                    
                    System.out.println("Bunun için uygun metod bulunmuyor...");
                }
                
                
            }
            else if (islem.equals("2")) {
                System.out.print("a:");
                int a = scanner.nextInt();
                System.out.print("b:");
                int b = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Girilen Sayıları Farkları : " + cikarma(a, b));
                
            }
            else if (islem.equals("3")){
                System.out.print("Kaç değer çarpacaksınız ? (2 veya 3): ");
                
                int kacsayi = scanner.nextInt();
                
                if (kacsayi == 2) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayıların çarpımları : " + (carpma(a, b)));
                    
                    
                }
                else if (kacsayi == 3) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    System.out.print("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayıların çarpımları : " + (carpma(a, b,c)));
                    
                }
                else {
                    
                    System.out.println("Bunun için uygun metod bulunmuyor...");
                }
                
            }
            else if (islem.equals("4")) {
                System.out.print("a:");
                int a = scanner.nextInt();
                System.out.print("b:");
                int b = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Girilen Sayıların Bölümü : " + bolme(a, b));
                
            }
            else {
                System.out.println("Geçersiz İşlem...");
            }  
            
        }
           
    }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                                      Örnek_4
public class Main {
    public static void main(String[] args) {
      int result = sum(10);
      System.out.println(result);
    }
    public static int sum(int k) {
      if (k > 0) {
        return k + sum(k - 1);
      } else {
        return 0;
      }
    }
  }
  

  10 + toplam(9)
  10 + ( 9 + toplam(8) )
  10 + ( 9 + ( 8 + toplam(7) ) )
  ...
  10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + toplam(0)
  10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0

//-------------------------------------------------------------------------------------------------------------
//                                                                                                      Örnek_5
public class Main {
    public static void main(String[] args) {
      int result = sum(5, 10);
      System.out.println(result);
    }
    public static int sum(int start, int end) {
      if (end > start) {
        return end + sum(start, end - 1);
      } else {
        return end;
      }
    }
  }

