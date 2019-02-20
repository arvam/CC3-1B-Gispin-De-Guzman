package rpgvamvam;

public class Wizard extends Character{
private  int maxMagic,currentMagic;
public dice die = new dice();

    public Wizard(String n, int s, int d, int i) {
        super(n, s, d, i);
        
        this.maxMagic = dice.roll();
        this.currentMagic = this.currentMagic;
        
        
    }
    
    public int castLightningBolt(){
        int dmg = 0;
        if(currentMagic >= 5){
            currentMagic -=5;
            dmg = die.roll() + super.getIntelligence();
        }else{
            System.out.println(super.getName()+" had no mana left for Lightning bolt!");
            dmg = 0;
        }
        return dmg;
    }
    
    public int castHeal(){
        int heal = ( die.roll() + super.getIntelligence());
        if(currentMagic >= 8 && super.currentlife < super.maxlife){
            if(heal+super.getCurrentLife() > super.getMaxLife()){
                heal = super.getMaxLife()-super.getCurrentLife();
                System.out.println(super.getName()+" healed for "+heal);
                currentMagic-=8;
            }else{
                System.out.println(super.getName()+" healed for "+heal);
                currentMagic-=8;
                //Return heal as normal
            }   
        }else{
            System.out.println(super.getName()+" had no magic left to cast heal!");
            heal = 10;
        }
        return heal;
    }
    

    public int getMaxMagic(){
        return maxMagic;
    }
    
    public int getCurrentMagic(){
        return currentMagic;

    }
    
}
