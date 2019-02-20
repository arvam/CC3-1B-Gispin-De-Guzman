
package rpgvamvam;


public class RPGWiz
{

  
    public static void main(String[] args) {

        
        Character c1 = new Character("Harry Potter",5,50,50);     
        Character c2 = new Wizard("Wizard Voldemort",5,50,50);
        
        
        
        int round = 1;
        
       do{
        System.out.println("Round "+ round);
        System.out.println(c1.getName()+"'s health : "+c1.getCurrentLife());
        System.out.println(c2.getName()+"'s health : "+c2.getCurrentLife());
        
        int dmg1=c1.attack();
        c2.wound(dmg1);
        
        int dmg2=c2.attack();
        c1.wound(dmg2);
        
        System.out.println(c1.getName()+" attacks " + c2.getName() + " for " + dmg1);
        System.out.println(c2.getName()+" cast lightning bolt " + c1.getName() + " for " + dmg2);
        
        System.out.println(c1.getName()+"'s health : "+c1.getCurrentLife());
        System.out.println(c2.getName()+"'s health : "+c2.getCurrentLife());
        
        /*System.out.println("Round 2");
        
        System.out.println(c1.getName()+"'s health : "+c1.getCurrentLife());
        System.out.println(c2.getName()+"'s health  : "+c2.getCurrentLife());
        
        int dmg3=c1.attack();
        c2.wound(dmg3);                  
        int dmg4=c2.attack();
        c1.wound(dmg4);
        
        System.out.println(c1.getName()+" attacks " + c2.getName() + " for " + dmg3 );
        System.out.println(c2.getName()+" cast lightning bolt " + c1.getName() + " for " + dmg4);
        
        System.out.println("Round 3");
        
        System.out.println(c1.getName()+"'s health : "+c1.getCurrentLife());
        System.out.println(c2.getName()+"'s health : "+c2.getCurrentLife());
        
         int dmg5=c1.attack();
        c2.wound(dmg5);
        
        int dmg6=c2.attack();
        c1.wound(dmg6);
        
        System.out.println(c1.getName()+" attacks " + c2.getName() + " for " + dmg5);
        System.out.println(c2.getName()+" cast lightning bolt " + c1.getName() + " for " + dmg6);
        */
        
        if(c1.getCurrentLife()<c2.getCurrentLife()){
            System.out.println(c2.getName()+ " Wins! ");
        }else if(c1.getCurrentLife()>c2.getCurrentLife()){
            System.out.println(c1.getName() + " Wins! ");
        }else if(c1.getCurrentLife()==c2.getCurrentLife()){
            System.out.println( " Its a Draw! ");
       }
        round++;
        
        }while(c1.getCurrentLife()>=0 && c2.getCurrentLife()>=0);
    }
}

    