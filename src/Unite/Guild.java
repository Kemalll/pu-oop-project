package Unite;

public abstract class Guild {
    protected int attack;
    protected int defence;
    protected int health;
    protected int att_range;
    protected int speed;
    protected String side;

    public Guild(int attack,int defence,int health,int att_range,int speed,String side){
        this.attack=attack;
        this.defence=defence;
        this.health=health;
        this.att_range=att_range;
        this.speed=speed;
        this.side=side;
    }
}
