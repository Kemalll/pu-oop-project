package Unite;
import Unite.Dwarf;
import Unite.Elf;
import Unite.Heros;
import Unite.Knight;

public class Unites extends Heros {
    Heros[] army=new Heros[6];

    private Unites(int row, int col, int attack, int defence, int health, int att_range, int speed, String name,boolean isAlive) {
        super(row, col, attack, defence, health, att_range, speed, name, isAlive);
    }

    public Heros[] getArmy() {
        army[0]=new Knight(row,col,8,3,15,1,1,"K",true);
        army[1]=new Knight(row,col,8,3,15,1,1,"K",true);;
        army[2]=new Elf(row,col,5,1,10,3,3,"E",true);
        army[3]=new Elf(row,col,5,1,10,3,3,"E",true);
        army[4]=new Dwarf(row,col,6,2,12,2,2,"D",true);
        army[5]=new Dwarf(row,col,6,2,12,2,2,"D",true);
        return army;
    }
}

