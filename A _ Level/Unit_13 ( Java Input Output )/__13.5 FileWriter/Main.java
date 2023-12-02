
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
        
        FileWriter writer = null;
        
        try {
            writer  = new FileWriter("dosya.txt",true);
            
            
            writer.write("irsad\n");
            writer.write("kures\n");
            writer.write("uydemy\n");
            
            
            
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOException oluştu...");
        }
        finally {
            
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                    System.out.println("Dosya Kapatılırken bir hata oluştu...");
                }
                
            }
        }
        
        
    }
}
