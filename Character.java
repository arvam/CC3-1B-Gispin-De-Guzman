package rpg;
public class Character {
/** static variables */
    static Dice dice = new Dice();
/** instance variables */
/**
* Constructor takes 4 parameters: n,s,d,i and assigns them to
* instance variables name, strength, dexterity, intelligence.
* Also uses the dice instance to assign a random
* number to maxlife. currentlife is initialized to maxlife
    */
            private String name;
            private int strength;
            private int dex;
            private int intel;

            private int maxlife;
            private int currentlife;

            public Character(String n, int s, int d, int i) {
            this.name =n;
            this.strength = s;
            this.dex=d;
            this.intel= i;

            this.maxlife = dice.roll()+50;
            this.currentlife = maxlife;


            }
            /**
            * Returns a random die roll using the roll method in the
            * Dice.java, *modified by the character's strength
            */
            public int attack() {
                int x = dice.roll()+strength;
                return x;
            }
            /**
            * Decreases currentlife by the damage parameter
            */
            public void wound(int damage) {
                currentlife -= damage;
            }
            /**
            * Increases currentlife by the heal parameter.
            * currentlife cannot be greater than maxlife
            */
            public void heal(int heal) {

               if(currentlife == maxlife){
               }
               else{
                   currentlife += heal;
               }

            }
            /**
            * Returns name
            */
            public String getName() {
                return name;
            }
            /**
            * Returns strength
            */
            public int getStrength() {
                return strength;
            }
            /**
            * Returns dexterity
            */
            public int getDexterity() {
                return dex;
            }
            /**
            * Returns intelligence
            */
            public int getIntelligence() {
                return intel;
            }
            /**
            * Returns currentlife
            */
            public int getCurrentLife() {

               return currentlife;
            }
            /**
            * Returns maxlife
            */
            public int getMaxLife() {
            return maxlife;
    }
}