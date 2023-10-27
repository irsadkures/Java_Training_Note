
import java.util.ArrayList;


public class Main {
    public static void yazdir(ArrayList<String> a) {
        
        for (int i = 0; i < a.size() ; i++) {
            
            System.out.println("Element " + (i+1) + ": " + a.get(i));
            
        }
    }
    public static void main(String[] args) {
      
        ArrayList<String> arraylist = new ArrayList<String>();
                
        arraylist.add("ali");
        arraylist.add("irşad");
        arraylist.add("küreş");
        arraylist.add("techdil");
        arraylist.add("erkin");
        arraylist.add("küreş");
        
        System.out.println(arraylist.get(0));  // ali
        System.out.println(arraylist.get(3));  // techdil
        System.out.println(arraylist.get(4));  // erkin
        
        System.out.println(arraylist.size());                // 6
        System.out.println(arraylist.indexOf("küreş"));    // 2
        System.out.println(arraylist.lastIndexOf("küreş")); // 5
        System.out.println(arraylist.lastIndexOf("halid"));  // -1

        arraylist.remove(1);  //irşad  
        arraylist.remove("ali");  //ali

        arraylist.set(2,"ahmat");
       
        yazdir(arraylist);
       
        
    }
}
