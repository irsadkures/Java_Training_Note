
public class Kopek extends Hayvan {
    
    private int dis_sayisi;
    
    public Kopek(String isim,int kilo,int boy,int bacak_sayisi,int dis_sayisi){
        
        super(isim, kilo, boy, bacak_sayisi);
        
        this.dis_sayisi = dis_sayisi;
        
        
    }
    public void harekete_gec(int hiz) {
        System.out.println("Köpek " + hiz + " ile hareket ediyor...");
    }
    public void kos(int hiz) {
        
        System.out.println("Köpek koşuyor....");
        
        harekete_gec(hiz);

    }

    /**
     * @return the dis_sayisi
     */
    public int getDis_sayisi() {
        return dis_sayisi;
    }

    /**
     * @param dis_sayisi the dis_sayisi to set
     */
    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }
    
}
