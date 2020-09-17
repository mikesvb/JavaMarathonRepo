package finalTask;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//0 - нет ничего
//1 - корабль
//2 - ранил

public class Player {
    private String name;
    private int[][] myPlayground;
    private int[][] myMovePlayground;
    private List<Ship> ships;

    public void addShip(Ship ship){
        ships.add(ship);
    }

    public List<Ship> getShips() {
        return ships;
    }

    public Player(String name) {
        this.name = name;
        this.ships = new ArrayList<>();
        this.myPlayground= new int[][]{//заполняем пустотой поле
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        this.myMovePlayground= new int[][]{//заполняем пустотой поле
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
    }

    public int[][] getMyPlayground() {
        return myPlayground;
    }

    public void setPointMyPlayground(int x, int y){
        myPlayground[y][x]=1;
    }
    public void setSuccessPointMyPlayground(int x, int y){
        myPlayground[y][x]=2;
    }

    public String getName() {
        return name;
    }

    public int getSummPoints(){
        int summ=0;
        for(Ship ship:ships){
            summ+=ship.getActivePoints();
        }
        return summ;
    }


}
