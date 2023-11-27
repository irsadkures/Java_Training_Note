
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class Player {
    private String isim;
    
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
       return "|||| ID: " + id + " İsim :" + isim + " |||";
       
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((isim == null) ? 0 : isim.hashCode());
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Player other = (Player) obj;
        if (isim == null) {
            if (other.isim != null)
                return false;
        } else if (!isim.equals(other.isim))
            return false;
        if (id != other.id)
            return false;
        return true;
    }

    
}
public class Main {
    
    public static void main(String[] args) {
        
        
        HashSet<Player> player_list = new HashSet<Player>();
        
        
                
        
        Player player1 = new Player("irsad",1);
        Player player2 = new Player("kures",10);
        Player player3 = new Player("ali",6);
        Player player4 = new Player("irsad",1);
        
    
        player_list.add(player1);
        player_list.add(player2);
        player_list.add(player3);
        player_list.add(player4);
     
        
       for (Player player : player_list) {
         System.out.println(player);
        
       }
        
        
            
    }

    

    
    
}
