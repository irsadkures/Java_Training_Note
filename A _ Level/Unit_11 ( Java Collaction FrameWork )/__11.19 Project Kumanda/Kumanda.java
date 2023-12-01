
import java.util.ArrayList;
import java.util.Iterator;


public class Kumanda implements Iterable<String>{
    
    private ArrayList<String> kanallar = new ArrayList<String>();
    
    public class KumandaIterator implements  Iterator<String> {
        private int index = 0;
        @Override
        public boolean hasNext() {
            
            if (index >= kanallar.size()){
                return false;
            }
            else {
                return true;
            }
        }

        @Override
        public String next() {
            String kanal = kanallar.get(index);
            index++;
            return kanal;
            
            
        }
        
        
        
        
        
    }
    public void kanalEkle(String kanal) {
        
        kanallar.add(kanal);
        
    }
    public void kanalSil(String kanal) {
        if (kanallar.contains(kanal)) {
            kanallar.remove(kanal);
            
        }
        else {
            System.out.println("Böyle bir kanal bulunmuyor...");
        }
        
    }
    public int kanalSayisi() {
        
        return kanallar.size();
        
    }

    @Override
    public Iterator<String> iterator() {
        
        return new KumandaIterator();
        
    }
}
