package Map;

import Map.Castles.CastleFront;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Battlefield extends JFrame implements MouseListener {

    public Battlefield() {

        this.setSize(1800, 1000);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBackground(Color.LIGHT_GRAY);
    }

    /**
     * paints the bored of the gmae
     */
    public void paint(Graphics g) {
        for (int row = 0; row < 7; row++) {
            for (int col = 0; col < 9; col++) {
                g.setColor(Color.BLACK);
                g.drawRect(0, 0, 100, 100);

                GameTile tile=new GameTile(row,col);
                tile.render(g);
                g.drawRect(1000,40,500,300);

                //Creates a spawn point
                CastleFront CastleWest= new CastleFront(0,col,true);
                CastleFront CastleWest1=new CastleFront(1,col,true);
                CastleWest.render(g);
                CastleWest1.render(g);


                CastleFront CastleSagro=new CastleFront(5,col,true);
                CastleFront CastleSagro1=new CastleFront(6,col,true);
                CastleSagro.render(g);
                CastleSagro1.render(g);

            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
