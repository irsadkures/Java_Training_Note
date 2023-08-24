//-------------------------------------------------------------------------------------------------------------
//                                                              sayı - string bastırmak ve yorum satırına almak
public class Main {
  public static void main(String[] args) {
    //string ve sayıyı ekrana bastırmak......
    System.out.println("Alimi-irşad koyun olamalı kuş olmamalı, çünkü koyum yavrusuna süt verir. kuş yavrusuna kay verir");
    System.out.println(50000);

    /* Yorum satırına almak => kodun çalışmasını etkilemiyor
       iki şeşit yorum satırına alma kuralı var
       1.Yorum bir satır olsa =>    // simgesi kullanılıyor
       2.yorum 2 veya 2den fazla olsa =>  / * yorum * / iki simge arasına yazılıyor

    */ 
  }
} 
//-------------------------------------------------------------------------------------------------------------
//                                                                     int -- float -- char -- boolean --string

public class Main {
  public static void main(String[] args) {
    int myNum = 5;               // integer (whole number)
    float myFloatNum = 5.99f;    // floating point number
    char myLetter = 'D';         // character
    boolean myBool = true;       // boolean
    String myText = "Hello";     // String    
    System.out.println(myNum);
    System.out.println(myFloatNum);
    System.out.println(myLetter);
    System.out.println(myBool);
    System.out.println(myText);

  }
}

//-------------------------------------------------------------------------------------------------------------
//                                              byte -- short -- int -- long -- float -- double sayı aralıkları

public class Main {
  public static void main(String[] args) {

    byte myNum = 100;             //-128 - 127
    System.out.println(myNum);

    short myNum = 5000;           //-32768 - 32767
    System.out.println(myNum);

    int myNum = 100000;           //-2147483648 - 2147483647
    System.out.println(myNum);

    long myNum = 15000000000L;    //Veri longtürü -9223372036854775808 ile 9223372036854775807 arasındaki tam sayıları saklayabilir. Bu, int değeri depolamak için yeterince büyük olmadığında kullanılır. Değeri "L" ile bitirmeniz gerektiğini unutmayın.
    System.out.println(myNum);
    
    // floatve veri doubletürleri kesirli sayıları saklayabilir. Değeri, değişkenler için "f" ve çiftler için "d" ile sonlandırmanız gerektiğini unutmayın:
    float myNum = 5.75f;
    System.out.println(myNum);

    double myNum = 19.99d;
    System.out.println(myNum);
    
    //Bir kayan noktalı sayı, 10'un kuvvetini belirtmek için "e" harfine sahip bilimsel bir sayı da olabilir:
    float f1 = 35e3f;
    double d1 = 12E4d;
    System.out.println(f1);
    System.out.println(d1);
    
  }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                              // değişken tanımlama çeşitleri

public class Main {
  public static void main(String[] args) {
    int x, y, z;            
    x = y = z = 50;
    System.out.println(x + y + z);
    
    int x = 5;
    int y = 6;
    int z = 50;
    System.out.println(x + y + z);


    int x = 5, y = 6, z = 50;
    System.out.println(x + y + z);
  }
}

//-------------------------------------------------------------------------------------------------------------
//                                                                                                      boolean
public class Main {
  public static void main(String[] args) {
    boolean isJavaFun = true;
    boolean isFishTasty = false;    
    System.out.println(isJavaFun);
    System.out.println(isFishTasty);


    int x = 10;
    int y = 9;
    System.out.println(x > y); // returns true, because 10 is higher than 9

    System.out.println(10 > 9); // returns true, because 10 is higher than 9

    int x = 10;
    System.out.println(x == 10); // returns true, because the value of x is equal to 10

    System.out.println(10 == 15); // returns false, because 10 is not equal to 15

    int myAge = 25;
    int votingAge = 18;
    System.out.println(myAge >= votingAge);

    
  }
}
//-------------------------------------------------------------------------------------------------------------
//                                  Widening Casting    byte -> short -> char -> int -> long -> float -> double  
public class Main {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0

  }
}
//-------------------------------------------------------------------------------------------------------------
//                                  Narrowing Casting   double -> float -> long -> int -> char -> short -> byte

public class Main {
  public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                 byte -- short -- int -- long
public class Main {
    public static void main(String[] args) {
        // byte --> short --> int --> long
        short i = 100;
        byte j = 2;
        int k = 4;
        
        long d = i + j + k;
        System.out.println(d);        
    }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                             float --- double
public class Main {
    public static void main(String[] args) {
        // Double : 64 bit - 8 byte
        // Float : 32 bit - 4 byte     
        // Otomatik Dönüştürme :  int --> float ---> double       
       double sayi1 = 70.25;
       double sayi2 = 60d;
       double sayi3 = 80.2;
       
       float a = 70.25f;
       float b = 60f;
       float c = 80.2f;
        System.out.println("Ortalama: " + (sayi1 + sayi2 + sayi3) / 3 );
        System.out.println("Ortalama2: " + (a + b + c) / 3 );      
    }
}

//-------------------------------------------------------------------------------------------------------------
//                                                                                 byte -- short -- int -- long
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = a * 2;
        int c = a * b * 2;
        int toplam = a + b + c;
        toplam = toplam - 5;
        System.out.println("Toplam = " + toplam);          
    }
}

//-------------------------------------------------------------------------------------------------------------
//                                                                                                char - string
public class Main {
  public static void main(String[] args) {

    char myGrade = 'B';
    System.out.println(myGrade);

    char myVar1 = 65, myVar2 = 66, myVar3 = 67;
    System.out.println(myVar1);
    System.out.println(myVar2);
    System.out.println(myVar3);

    String greeting = "Hello World";
    System.out.println(greeting);

  }
}  
//-------------------------------------------------------------------------------------------------------------
//                                                                                               int and string
public class Main {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    int z = x + y;
    System.out.println(z);

    String x = "10";
    String y = "20";
    String z = x + y;  // z will be 1020 (a String)

    String x = "10";
    int y = 20;
    String z = x + y;  // z will be 1020 (a String)
  }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                                  add strings
public class Main {
  public static void main(String args[]) {
    String firstName = "irşad";
    String lastName = "küreş";
    System.out.println(firstName + " " + lastName); 


    String firstName = "irşad ";
    String lastName = "küreş";
    System.out.println(firstName.concat(lastName));  

    String firstName = "irşad ";
    String lastName = "küreş";
    String fullName = firstName + lastName;
    System.out.println(fullName); 

  }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                                       string
public class Main {
  public static void main(String[] args) {
    String greeting = "Hello";
    System.out.println(greeting);

    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length()); // karekter sayısını gösterir...

    String txt = "Hello World";
    System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
    System.out.println(txt.toLowerCase());   // Outputs "hello world"
    
    String txt = "Please locate where 'locate' occurs!";
    System.out.println(txt.indexOf("locate")); // Outputs 7   bir dizgede (boşluk dahil) belirtilen bir metnin ilk geçtiği yerin dizininiindexOf() (konumu) döndürür :
  }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                 Strings - Special Characters
Escape character	       Result	          Description
      \'	                 '	            Single quote
      \"	                 "	            Double quote
      \\	                 \	            Backslash

public class Main {
  public static void main(String[] args) {
    String txt = "We are the so-called \"Vikings\" from the north.";
    System.out.println(txt);
    String txt = "It\'s alright.";
    System.out.println(txt);
    String txt = "The character \\ is called backslash.";
    System.out.println(txt);
  }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                 Strings - Special Characters
Code	      Result	
\n	        New Line	
\t	        Tab	
\b	        Backspace	


public class Main {
  public static void main(String[] args) {
    String txt = "Hello\nWorld!";
    System.out.println(txt);
  }
}

public class Main {
  public static void main(String[] args) {
    String txt = "Hello\tWorld!";
    System.out.println(txt);
  }
}

public class Main {
  public static void main(String[] args) {
    String txt = "Hel\blo World!";
    System.out.println(txt);
  }
}

//-------------------------------------------------------------------------------------------------------------
// 
Operator	          Name	                  Description	                         Example	
+	               Addition	             Adds together two values	                  x + y	
-	               Subtraction	         Subtracts one value from another	          x - y	
*	               Multiplication	       Multiplies two values	                    x * y	
/	               Division	             Divides one value by another	              x / y	
%	               Modulus	             Returns the division remainder	            x % y	
++	             Increment	           Increases the value of a variable by 1	    ++x	
--	             Decrement	           Decreases the value of a variable by 1	    --x
                                                                                                 Operatörler
public class Main {
    public static void main(String[] args) {
        /*
        + ---> Toplama Operatörü
        - ---> Çıkarma Operatörü
        / ---> Bölme Operatörü
        * ---> Çarpma Operatörü
        % ---> Kalan Operatörü

        */
        
        System.out.println(3 + 4.2);
        System.out.println(3 - 5f);
        System.out.println(10 / 4.0);
        System.out.println(3 * 4.5);
        System.out.println(10 % 4);    
        
        System.out.println((3f / 4) + (4 * 5));              
    }
}


public class Main {
  public static void main(String[] args) {
    int x = 5;
    ++x;
    System.out.println(x);
  }
}


public class Main {
  public static void main(String[] args) {
    int x = 5;
    --x;
    System.out.println(x);
  }
}
//-------------------------------------------------------------------------------------------------------------
// 

Operator	      Example	       Same As	
=	              x = 5	          x = 5	
+=	            x += 3	        x = x + 3	
-=	            x -= 3	        x = x - 3	
*=	            x *= 3	        x = x * 3	
/=	            x /= 3	        x = x / 3	
%=	            x %= 3	        x = x % 3	


public class Main {
  public static void main(String[] args) {
    int x = 5;
    System.out.println(x);
  }
}

public class Main {
  public static void main(String[] args) {
    int x = 5;
    x += 3;
    System.out.println(x);
  }
}

public class Main {
  public static void main(String[] args) {
    int x = 5;
    x -= 3;
    System.out.println(x);
  }
}

public class Main {
  public static void main(String[] args) {
    int x = 5;
    x *= 3;
    System.out.println(x);
  }
}

public class Main {
  public static void main(String[] args) {
    double x = 5;
    x /= 3;
    System.out.println(x);
  }
}

public class Main {
  public static void main(String[] args) {
    int x = 5;
    x %= 3;
    System.out.println(x);
  }
}

//-------------------------------------------------------------------------------------------------------------
// 

Operator	             Name	                      Example	
==	                  Equal to	                  x == y	
!=	                  Not equal	                  x != y	
>	                    Greater than	              x > y	
<	                    Less than	                  x < y	
>=	                  Greater than or equal to	  x >= y	
<=	                  Less than or equal to	      x <= y

public class Main {
  public static void main(String[] args) {
    int x = 5;
    int y = 3;
    System.out.println(x == y); // returns false because 5 is not equal to 3
  }
}

public class Main {
  public static void main(String[] args) {
    int x = 5;
    int y = 3;
    System.out.println(x != y); // returns true because 5 is not equal to 3
  }
}

public class Main {
  public static void main(String[] args) {
    int x = 5;
    int y = 3;
    System.out.println(x > y); // returns true because 5 is greater than 3
  }
}

public class Main {
  public static void main(String[] args) {
    int x = 5;
    int y = 3;
    System.out.println(x < y); // returns false because 5 is not less than 3
  }
}

public class Main {
  public static void main(String[] args) {
    int x = 5;
    int y = 3;
    System.out.println(x >= y); // returns true because 5 is greater, or equal, to 3
  }
}

public class Main {
  public static void main(String[] args) {
    int x = 5;
    int y = 3;
    System.out.println(x <= y); // returns false because 5 is neither less than or equal to 3
  }
}

//-------------------------------------------------------------------------------------------------------------
// 

Operator	         Name	                         Description	
&& 	               Logical and	                 Returns true if both statements are true	x < 5 &&  x < 10	
|| 	               Logical or	                   Returns true if one of the statements is true	x < 5 || x < 4	
!	                 Logical not	                 Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

public class Main {
  public static void main(String[] args) {
    int x = 5;
    System.out.println(x > 3 && x < 10); // returns true because 5 is greater than 3 AND 5 is less than 10
  }
}

public class Main {
  public static void main(String[] args) {
    int x = 5;
    System.out.println(x > 3 || x < 4); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
  }
}

public class Main {
  public static void main(String[] args) {
    int x = 5;
    System.out.println(!(x > 3 && x < 10)); // returns false because ! (not) is used to reverse the result
  }
}

//-------------------------------------------------------------------------------------------------------------
//                                                                                           input -- scan data
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yas1 = scanner.nextInt();
        int yas2 = scanner.nextInt();
        int yas3 = scanner.nextInt();   
        System.out.println("yas1 : " + yas1 + " yas2: " + yas2 + " yas3: " + yas3 );     
        /*int yas = scanner.nextInt();
        scanner.nextLine(); // Dummy
        String isim = scanner.nextLine();
        System.out.println("Yaş: " + yas);
        System.out.println("İsim: " + isim);*/    
    }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                                      örnek_1
import java.util.Scanner;
public class  Main {
    public static void main(String[] args) {
         /*
        Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indeksini bulun.

        Beden Kitle İndeksi : Kilo / Boy(m) * Boy(m)
    
        */
         Scanner scanner = new Scanner(System.in);
         
         System.out.print("Kilonuzu Girin:");
         int kilo = scanner.nextInt();
         System.out.print("Boyunuzu Girin:(Örnek :  1,72)");
         double boy = scanner.nextDouble();      
         double bki = kilo / (boy * boy);  
         System.out.println("Beden Kitle Indeksiniz : " + bki);         
    }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                                      örnek_2
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        // Kullanıcıdan Aldığınız iki sayının değerlerini değiştirin.
        Scanner scanner = new Scanner(System.in);
        int birinci_sayi;
        int ikinci_sayi;
        System.out.print("Birinci Sayı : ");
        birinci_sayi = scanner.nextInt();
        System.out.print("İkinci Sayı : ");
        ikinci_sayi = scanner.nextInt();
        System.out.println("Değiştirilmeden Önce....");
        System.out.println("Birinci Sayı : " + birinci_sayi + " İkinci Sayı : " + ikinci_sayi);
        int gecici = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici;
        System.out.println("Değiştirildikten Sonra....");
        System.out.println("Birinci Sayı : " + birinci_sayi + " İkinci Sayı : " + ikinci_sayi);
    }
}
//-------------------------------------------------------------------------------------------------------------
//                                                                                                      örnek_3
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Birinci Kenar : ");
        a = scanner.nextInt();
        System.out.print("İkinci Kenar : ");
        b = scanner.nextInt();
        
        double h = Math.sqrt(a * a + b * b);
        System.out.println("Hipotenüs : " + h);
    }
}

//-------------------------------------------------------------------------------------------------------------
//                                                                                                      örnek_4
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        /*

        Bir aracın kilometrede ne kadar yaktığı ve kaç kilometre yol yaptığı bilgilerini alın ve 
        sürücünün toplam ne kadar ödemesini gerektiğini hesaplayın.

        */
        Scanner scanner = new Scanner(System.in);     
        System.out.print("Aracınız kilometre kaç kuruş yakıyor? (Örnek : 0,32):");
        double kurus = scanner.nextDouble();
        System.out.print("Aracınızla kaç kilometre gittiniz ? :");
        int km = scanner.nextInt();
        System.out.println("Toplam ödemeniz gereken tutar : " + (kurus * km) + " tl dir...");
    }
}