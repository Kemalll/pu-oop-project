package Action;

public class Attack extends Action {
    public Attack(int attack, int defence, int health, int att_range, int speed) {
        super(attack, defence, health, att_range, speed);
        boolean isInRange = false;
    }

    /**
     * Getting what it needs from Action to execute the attack command
     * @return the dmg taken in the fight
     */
    int Fight(int attack, int defence, int health, int att_range, int speed, boolean isInRange) {

        this.attack = attack;
        this.defence = defence;
        this.health = health;
        this.att_range = att_range;
        this.speed = speed;
        //Conditions of the dmg
        if (sumR == health) {
            attack = 0;
            return  Demage = attack - defence;
        } else if (sumR == 0) {
            attack = attack / 2;
            Demage = attack - defence;
        }  else{
        Demage = attack - defence;
        }
        return Demage - health;
    }
}


