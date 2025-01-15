package OOPsPrinciples;

abstract class GameCharacter{
    abstract void attack();
    void takeDamage(int damage){
        System.out.println("Taking " + damage + "damage");
    }
}
class Warrior extends GameCharacter{
    @Override
    void attack() {
        System.out.println("Warrior attacks with a sword!");
    }
}
class Mage extends GameCharacter{
    @Override
    void attack() {
        System.out.println("Mage casts a fireball spell!");
    }
}
public class GameCharacters {
    public static void main(String[] args) {
        GameCharacter warrior = new Warrior();
        GameCharacter mage = new Mage();
        warrior.attack();//output: Warrior attacks with a sword!
        mage.attack(); //output: Mage casts a fireball spell!
    }
}
