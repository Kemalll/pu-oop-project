package Unite;

import Map.GameTile;

import java.awt.*;

public class Knight extends Heros {
    public Knight(int row,int col,int attack,int defence,int  health, int att_range, int speed, String name,boolean isAlive) {
        super(row, col, attack, defence, health, att_range, speed, name,isAlive);
//        this.attack=8;
//        this.defence=3;
//        this.health=15;
//        this.att_range=1;
//        this.speed=1;
//        this.name="K";
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
