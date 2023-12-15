
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
        List<Integer> list =  new LinkedList<Integer>();
        
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread çalışıyor....");
                
                for (int i = 0 ; i < 1000000 ;i++){
                    
                    if (Thread.currentThread().isInterrupted()){
                        System.out.println("Kesintiye Uğradı....");
                        return;
                        
                    }
                    
                    list.add(i);
                   
                }
                
                System.out.println("Thread kesintiye uğramadan işini bitirdi...");
                
                
                /*for(int i= 1; i <= 10;i++) {
                    System.out.println("Thread Yazıyor : " + i);
                    
                    try {
                        Thread.sleep(1000);
                        System.out.println("Uykumun " + i + ". saniyesindeyim...");
                    } catch (InterruptedException ex) {
                        System.out.println("Uykum bölündü....");
                    }
                    
                }*/
                
                
                
            }
        });
        
        t.start();
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.interrupt();
        
        
        
        
        
        
        
        
    }
}
