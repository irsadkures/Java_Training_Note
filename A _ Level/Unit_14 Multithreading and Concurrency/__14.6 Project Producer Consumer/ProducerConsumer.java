
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProducerConsumer {
    Random random = new Random();
    
    BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
    
    
    public void produce() {
        
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            try {
                Integer value =  random.nextInt(100);
            
                queue.put(value);
                
                System.out.println("Producer Üretiyor : " + value);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
    }
    public void consume(){
        
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                Integer value =  queue.take();
                System.out.println("Consumer tüketiyor : " + value);
                
                System.out.println("Queue Size: " + queue.size());
                
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
            
        }
    }
   
    
    
}
