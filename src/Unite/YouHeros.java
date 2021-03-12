package Unite;

public class YouHeros extends Hero {
    Hero[] army=new Hero[6];

    private YouHeros(int row, int col, int attack, int defence, int health, int att_range, int speed, String name, boolean isAlive) {
        super(row, col, attack, defence, health, att_range, speed, name, isAlive);
    }

    /**
     * The heroes that every player will have in the beginning of the game
     * @return the units and there power scores
     */

    public Hero[] getArmy() {
        army[0]=new Knight(getRow(),getCol(),8,3,15,1,1,"K",true);
        army[1]=new Knight(getRow(),getCol(),8,3,15,1,1,"K",true);;
        army[2]=new Elf(getRow(),getCol(),5,1,10,3,3,"E",true);
        army[3]=new Elf(getRow(),getCol(),5,1,10,3,3,"E",true);
        army[4]=new Dwarf(getRow(),getCol(),6,2,12,2,2,"D",true);
        army[5]=new Dwarf(getRow(),getCol(),6,2,12,2,2,"D",true);
        return army;
    }
}

