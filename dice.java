
package rpgvamvam;

import java.util.Random;
public class dice {
     private Random r;
  
    
    
    
    
    public dice() {
        r= new Random();
        
        
    }
    
    public int roll() {
       int x = r.nextInt(6)+1;
       return x;
    }

    

}

