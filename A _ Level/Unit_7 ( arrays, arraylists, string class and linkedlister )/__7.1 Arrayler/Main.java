
import java.util.Scanner;

public class Main {

    public static void arrayi_bastir(int[] array) {
        
        for (int i = 0; i < array.length ; i++ ) {
            System.out.println("Element " + (i+1) + ":" + array[i]);
            
        }
   
    }
    public static double ortalamabul(int[] array) {
        int toplam = 0;
        
        for (int i = 0; i < array.length ; i++) {
            toplam += array[i];
            
        }
        return ((double)toplam / array.length);
        
        
    }
    public static void main(String[] args) {
//----------------------------------------------------------------------- 
        
        //int[] a = {10,20,30,40,50,60};
        //double[] b = {10.2,20.3,30.4,40.23,50.7,60.2};

        //int[] a = new int[5];
        //a[5] = 32;
        //a[9] = 50;
                
//-----------------------------------------------------------------------  
         
        /* 
         int[] a = {10,20,30,40,50,60};
         System.out.println(a[0]);
         System.out.println(a[2]);
         System.out.println(a[6]); */

//-----------------------------------------------------------------------
        /*int[] a = new int[5];
        for (int i = 0; i < 5 ; i++) {
            
            a[i] = i * 4 + 2;
            
        }
        for (int i = 0; i < 5 ; i++) {
            
            System.out.println(a[i]);
                       
        }*/
//-----------------------------------------------------------------------
        /*int[] a = new int[5];
        
        Scanner scanner =  new Scanner(System.in);
        for (int i = 0; i < 5 ; i++) {
            a[i] = scanner.nextInt();
            
         }
        for (int i = 0; i < 5 ; i++) {
            
            System.out.println(a[i]);
                       
        }*/
//-----------------------------------------------------------------------

        //int[] b = {10,20,30,40,50,60};
        //System.out.println("Arrayimizin Uzunluğu : " + b.length);
//-----------------------------------------------------------------------
        //int[] b = {10,20,30,40,50,60};
        //arrayi_bastir(b);

//-----------------------------------------------------------------------
        //int[] b = {10,20,30,40,50,60};       
        //System.out.println("Ortalama: " + ortalamabul(b));
           
        
    }
    
    
    
}
