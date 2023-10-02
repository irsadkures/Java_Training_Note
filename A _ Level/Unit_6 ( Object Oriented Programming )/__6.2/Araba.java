
public class Araba {
    
    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;
    
    
    
    public void setModel(String model) {
        
        this.model = model;
        
        
    }
    public String getModel(){
        return this.model;
    }

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the kapilar
     */
    public int getKapilar() {
        return kapilar;
    }

    /**
     * @param kapilar the kapilar to set
     */
    public void setKapilar(int kapilar) {
        
        if (kapilar < 0) {
            System.out.println("Kapı sayısı 0'dan küçük olamaz.");
            
        }
        else {
            this.kapilar = kapilar;
            
        }
    }

    /**
     * @return the tekerlekler
     */
    public int getTekerlekler() {
        return tekerlekler;
    }

    /**
     * @param tekerlekler the tekerlekler to set
     */
    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    
}
