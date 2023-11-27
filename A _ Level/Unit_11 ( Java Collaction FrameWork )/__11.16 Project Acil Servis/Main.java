
import java.util.PriorityQueue;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        // Acil Servis Uygulaması
        
        /*
        Hastalar Acil Serviste şikayetlerine göre kuyrukta en önlere geçecek(PriorityQueue).
        
        Apandisit ----> En yüksek öncelik
        Yanık -------> Orta Öncelik
        Baş Ağrısı ---> En düşük öncelik
        
        
        new Hasta("aaa","Yanık")
        
        
        
        
        
        */
        Queue<Hasta> acilservis = new PriorityQueue<Hasta>();
        
        acilservis.offer( new Hasta("aaa","Yanık"));
        acilservis.offer( new Hasta("bbb","Baş Ağrısı"));
        acilservis.offer(new Hasta("ccc","Apandisit"));
        acilservis.offer( new Hasta("ddd","Yanık"));
        acilservis.offer(new Hasta("eee","Yanık"));
        acilservis.offer( new Hasta("fff","Apandisit"));
        
        int i = 1;
        
        while(acilservis.isEmpty() != true) {
            System.out.println("**************************************");
            System.out.println(i + ".sırada");
            System.out.println(acilservis.poll());
            System.out.println("**************************************");
            i++;
            
        }
    }
}
