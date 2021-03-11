package Unite;

public abstract class Heros {
    protected int row;
    protected int col;

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getHealth() {
        return health;
    }

    public int getAtt_range() {
        return att_range;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    protected int attack;
    protected int defence;
    protected int health;
    protected int att_range;
    protected int speed;
    protected String name;
    protected boolean isAlive;

    public Heros(int row, int col, int attack, int defence, int health, int att_range, int speed, String name,boolean isAlive){
        this.row=row;
        this.col=col;
        this.attack=attack;
        this.defence=defence;
        this.health=health;
        this.att_range=att_range;
        this.speed=speed;
        this.name=name;
        this.isAlive=isAlive;
        abstract class Attac{ };
        abstract class Move{};
    }

     abstract class Attac{ };
     abstract class Move{};

}
