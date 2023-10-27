
public class Main {
    
    public static void main(String[] args) {
        
        String a = "irşad";
        String b = new String("irşad");
        
        
        System.out.println(b);     
        System.out.println("Harf Sayısı: " + b.length());      
        System.out.println("0.indeks : "+ b.charAt(0));
        System.out.println("2.indeks : "+ b.charAt(2));
        System.out.println("Son eleman : "+ b.charAt(b.length()-1));
        System.out.println(b.startsWith("Mu"));
        System.out.println(b.endsWith("CO"));        
        System.out.println(b.indexOf('a'));
        System.out.println(b.lastIndexOf('a'));       
        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());
//----------------------------------------------------------------------------       
        /*for (int i = 0; i < b.length();i++) {
            
            System.out.println(b.charAt(i));
            
        }*/

//----------------------------------------------------------------------------
        
        
        /*String a1 = "1923";
        
        int b1 = Integer.parseInt(a1);
        
        System.out.println(b1 - 42);*/
        
       /* int b1 = 1923;
        String a1 = String.valueOf(b1);
        
        System.out.println(a1);*/
//----------------------------------------------------------------------------       
        
        String a1 = "irşad";
        String a2 = "irşad";
        
        if (a1 == a2 ) {
            System.out.println("Eşitler");
        }

        String b1 = new String("irşad");
        String b2 = new String("irşad");
        
        if (b1.equals(b2)) {
            System.out.println("Eşitler");
        }
      
        
        
        
        
        
        
        
        
    }
    
}
