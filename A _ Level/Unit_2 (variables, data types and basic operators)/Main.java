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