package Map.Castles;

import Map.GameTile;

import java.awt.*;


public abstract class Castle {
    protected int row, col;
    protected boolean isSpawn;


    public Castle(int row, int col, boolean isSpawn) {
        this.row = row;
        this.col = col;
    }

    protected Color getTileColor(int row, int col) {         //Get the spawn zone tile color
        boolean sumEven = ((row + col) % 2 == 0);
        if (sumEven) return Color.LIGHT_GRAY;
        return Color.DARK_GRAY;
    }

    public void render(Graphics g){
        int x = this.col * GameTile.TILE_SIZE;
        int y = this.row * GameTile.TILE_SIZE;

        g.drawRect(x, y, 100, 100);
        g.setColor(getTileColor(row,col));
        g.fill3DRect(x,y,GameTile.TILE_SIZE,GameTile.TILE_SIZE,true);

    }
}
