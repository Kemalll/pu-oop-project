package Map;

import java.awt.*;

public class GameTile {
    public static final int TILE_SIZE = 100;

    private int row;
    private int col;
    private Color color;

    public GameTile(int row, int col, Color color) {

        this.row   = row;
        this.col   = col;
        this.color = color;
    }
    public GameTile(int row,int col){
        this.row=row;
        this.col=col;
    }

    public void render(Graphics g) {

        int tileX = this.col * TILE_SIZE;
        int tileY = this.row * TILE_SIZE;

        g.setColor(Color.BLACK);
        g.drawRect(tileX,tileY,TILE_SIZE,TILE_SIZE);
    }
}
