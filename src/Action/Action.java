package Action;

import Unite.Hero;

import java.util.Random;


/**
 *This class is getting what is need to do the action
 */
public abstract class Action extends Hero {
    Random random = new Random();
    final int DICE_SIDE = 6;
    int sumR = (random.nextInt(DICE_SIDE) + random.nextInt(DICE_SIDE) + random.nextInt(random.nextInt(DICE_SIDE)));
    int attack = getAttack();
    int defence = getDefence();
    int health = getHealth();
    int att_range = getAtt_range();
    int speed=getSpeed();
    int row = getRow();
    int col = getCol();
    int Demage;

    public Action(int attack, int defence, int health, int att_range,int speed) {
        super(attack, defence, health, att_range, speed);

    }

    public Action(int health) {
        super(health);
    }


}
