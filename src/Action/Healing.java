package Action;
import java.util.Random;

public class Healing extends Action {

    public Healing(int health) {
        super(health);
    }int Heal(int health) {
        this.health = health;
        random=new Random();
       int heal=random.nextInt((6)+1);                       //Gets the value of healing
       return heal+health;                                         //Returns how much will be health
    }
}
