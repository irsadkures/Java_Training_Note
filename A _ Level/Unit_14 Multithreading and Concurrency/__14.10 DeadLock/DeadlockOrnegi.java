
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class DeadlockOrnegi {
    private Hesap hesap1 = new Hesap();
    private Hesap hesap2 = new Hesap();
    private Random random = new Random();
    
    private Lock lock1 = new ReentrantLock();
    
    private Lock lock2 = new ReentrantLock();
    
    
    public void LocklariKontrolEt(Lock a,Lock b) {
        
        boolean a_elde_edildi = false;
        boolean b_elde_edildi = false;
        
        while(true) {
            
            a_elde_edildi = a.tryLock();
            b_elde_edildi = b.tryLock();
            
            if (a_elde_edildi == true && b_elde_edildi == true) {
                
                return;
            }
            if (a_elde_edildi == true) {
                
                a.unlock();
            }
            if (b_elde_edildi == true) {
                b.unlock();
            }
            
        }
        
        
    }
    
    public void thread1Fonksiyonu(){
        
        LocklariKontrolEt(lock1, lock2);
        
        
        
        for (int i = 0; i < 5000 ; i++) {
            
            Hesap.paraTransferi(hesap1, hesap2, random.nextInt(100));
            
        }
        lock1.unlock();
        lock2.unlock();
      
        
    }
    public void thread2Fonksiyonu(){
        
        LocklariKontrolEt(lock2, lock1);

        for (int i = 0; i < 5000 ; i++) {
            
            Hesap.paraTransferi(hesap2, hesap1, random.nextInt(100));
            
        }
        lock2.unlock();
        lock1.unlock();
       
       
    }
    public void threadOver(){
        System.out.println("Hesap1 Bakiye : " + hesap1.getBakiye() + " Hesap2 Bakiye : " + hesap2.getBakiye());
        
        System.out.println("Toplam Bakiye : " + (hesap1.getBakiye() + hesap2.getBakiye()));
        
    }
}
