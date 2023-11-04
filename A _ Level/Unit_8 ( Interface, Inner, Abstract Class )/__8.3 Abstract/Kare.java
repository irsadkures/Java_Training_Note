
public class Kare extends Sekil{
    private int kenar;
    
    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar = kenar;
        
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim() + " alanı " + (kenar * kenar) + " dir ");
        
        
    }
    public void cevre_hesapla() {
        
        System.out.println(getIsim() + "in çevresi " + (4 * kenar));
        
    }
}
