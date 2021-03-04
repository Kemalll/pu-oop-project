package Map;

import Map.Castles.CastleSagro;
import Map.Castles.CastleWest;

import javax.swing.*;
import java.awt.*;

public class Battlefield extends JFrame {

    public Battlefield() {

        this.setSize(1800, 1000);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBackground(Color.LIGHT_GRAY);
    }

    public void paint(Graphics g) {
        for (int row = 0; row < 7; row++) {
            for (int col = 0; col < 9; col++) {
                g.setColor(Color.BLACK);
                g.drawRect(0, 0, 100, 100);

                GameTile tile=new GameTile(row,col);
                tile.render(g);

                CastleWest CastelW=new CastleWest(1,col,true);
                CastelW.render(g);


                CastleSagro CastleS=new CastleSagro(5,col,true);
                CastleS.render(g);


                g.drawRect(1000,40,500,300);
            }
        }
    }
}
