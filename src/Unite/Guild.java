package Unite;

public abstract class Guild {
    protected int row;
    protected int col;
    protected int attack;
    protected int defence;
    protected int health;
    protected int att_range;
    protected int speed;
    protected String name;

    public Guild(int row,int col,int attack,int defence,int health,int att_range,int speed,String name){
        this.row=row;
        this.col=col;
        this.attack=attack;
        this.defence=defence;
        this.health=health;
        this.att_range=att_range;
        this.speed=speed;
        this.name=name;
    }

}
