package Unite;


import Map.GameTile;

import java.awt.*;

public abstract class Hero {


    public Hero(int attack, int defence, int health, int att_range, int speed) {
    }
    public Hero(int health){
    }
    public Hero(int row,int col){
    }

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

    protected int row;
    protected int col;
    protected int attack;
    protected int defence;
    protected int health;
    protected int att_range;
    protected int speed;
    protected String name;
    protected boolean isAlive;

    /**
     * Creates a hero who is used in the game
     */
    public Hero(int row, int col, int attack, int defence, int health, int att_range, int speed, String name, boolean isAlive){
        this.row=row;
        this.col=col;
        this.attack=attack;
        this.defence=defence;
        this.health=health;
        this.att_range=att_range;
        this.speed=speed;
        this.name=name;
        this.isAlive=isAlive;
    }

    public void render(Graphics g){
        int x = this.col+ GameTile.TILE_SIZE;
        int y =this.row + GameTile.TILE_SIZE;

        g.setColor(Color.WHITE);
        g.fillRect(x,y,95,95);
        g.setColor(Color.RED);
        g.drawString(this.name,10,10);
    }

}
