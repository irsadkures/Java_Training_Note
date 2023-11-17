
public class KapsamSinifi2 {
    private int privateDegisken = 30;

    public KapsamSinifi2() {
    }
    public void dahiliSinifKontrol() {
        
        DahiliSinif d = new DahiliSinif();
        
        System.out.println("Kontrol ediliyor... " + d.a);
        
        
    }
    public class DahiliSinif {
        private int privateDegisken = 20;
        private int a = 3;
        
        public void onileCarp() {
            int privateDegisken = 10;
            
            for (int i = 1 ; i< 6 ; i++) {
                //System.out.println(i + "*" + privateDegisken + " = " + (i * privateDegisken));
                //System.out.println(i + "*" + this.privateDegisken + " = " + (i * this.privateDegisken));
                System.out.println(i + "*" + KapsamSinifi2.this.privateDegisken + " = " + (i * KapsamSinifi2.this.privateDegisken));
                
            }
        }
    }
    
}
