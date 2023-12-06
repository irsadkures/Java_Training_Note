
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;


public class ObjeyiYaz {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("irsad kures",1234, "Bilgisayar Mühendisliği");
        Ogrenci ogrenci2 = new Ogrenci("ali devlet",678, "Matematik");
        Ogrenci ogrenci3 = new Ogrenci("arkin",123, "Bilgisayar Mühendisliği");
        
        Ogrenci[] ogrenci_array = {ogrenci1,ogrenci2,ogrenci3};
        ArrayList<Ogrenci> ogrenci_list = new ArrayList<Ogrenci>(Arrays.asList(ogrenci_array));
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))){

           out.writeObject(ogrenci_array);
           out.writeObject(ogrenci_list);
           
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı...");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken IOException Oluştu...");
        }
    }
    
}
