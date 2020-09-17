package finalTask;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ship {
    private int points;
    private boolean isActive;
    private int activePoints;
    private String[] pointsArray;
    public Player player;
    public String title;

    public Ship(Player player, int points, boolean isActive, int activePoints, String title) {
        this.points = points;
        this.isActive = isActive;
        this.activePoints = activePoints;
        this.player = player;
        this.title = title;
        this.pointsArray = new String[points];

        setPointsArray(points);
        player.addShip(this);
    }

    public void setPointsArray(int points){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты "+ title +" " + points + "-x палубного корабля");
        while (true) {
            String string = scanner.nextLine();

            String[] stringSplit = string.split(";");

            if (stringSplit.length != points) {
                System.out.println("Количество координат не подходит для данного корабля. Вы ввели: " + string);
                System.out.println("Повторите ввод заново");

            } else {
                //System.out.println("Количество координат ("+ points +") подходит. Разбираемся с точками и границами...");
                boolean isError=false;
                int i=1;
                int preX=0;
                int preY=0;
                boolean isVertical=false;
                boolean isHorizintal=false;
                for (String str:stringSplit){
                    //проверка дублей в массиве
                    if(!isError){
                        //System.out.println("Проверка дублей в итерации " + i);
                        if(i>1){
                            if(str.equals(stringSplit[0])){
                                System.out.println("Ошибка. Присутствуют дублирующие координаты");
                                isError=true;
                            }
                        }
                        if(i>2){
                            if(str.equals(stringSplit[1])){
                                System.out.println("Ошибка. Присутствуют дублирующие координаты");
                                isError=true;
                            }
                        }
                        if(i>3){
                            if(str.equals(stringSplit[2])){
                                System.out.println("Ошибка. Присутствуют дублирующие координаты");
                                isError=true;
                            }
                        }
                    }

                    //конец проверки дублей
                    String[] splitStr = str.split(",");
                    if(splitStr.length==2) {
                        Integer y=null;
                        Integer x = Integer.parseInt(splitStr[0]);
                        try{
                            y = Integer.parseInt(splitStr[1]);
                        }catch (NumberFormatException e){
                            System.out.println("Некорректная запись точки. Введите число");
                            isError=true;
                        }
                        if (!isError && checkPoint(x, y)) {
                            //System.out.println("Точка "+ i +" не занята, подходит (" + str +")");
                            if(i>1){//проверка с предыдущей координатой
                               if(!isVertical && !isHorizintal) {//узнаём горизонтальность/вертикальность
                                   if (x == preX) {
                                       isVertical=true;
                                     //  System.out.println("Корабль рисуется вертикальным");
                                   }else{
                                       isHorizintal=true;
                                     //  System.out.println("Корабль рисуется горизонтальным");
                                   }
                               }
                                if(isVertical && !isHorizintal){
                                    if(y-preY==1 || y-preY==-1){
                                       // System.out.println("Проверка оси Y... Координаты идут последовательно");
                                    }else{
                                        isError=true;
                                        System.out.println("Проверка оси Y... Координаты не последовательны");
                                    }
                                }

                                if(!isVertical && isHorizintal){
                                    if(x-preX==1 || x-preY==-1){
                                       // System.out.println("Проверка оси X... Координаты идут последовательно");
                                    }else{
                                        isError=true;
                                        System.out.println("Проверка оси X... Координаты не последовательны");
                                    }
                                }

                            }
                            preX = x;
                            preY = y;
                        }else{
                            System.out.println("Неудовлетворяющая полям координата " + i + " ("+ str + ")");
                            isError=true;
                        }
                    }else{
                        System.out.println("Некорректная координата " + i + " ("+ str + ")");
                        isError=true;
                    }
                    i++;
                }

                if(!isError){

                    //записываем корабль на карту
                    int j=0;
                    for (String str:stringSplit) {
                        pointsArray[j++]=str;
                        String[] splitStr = str.split(",");
                        setPoint(Integer.parseInt(splitStr[0]), Integer.parseInt(splitStr[1]));
                    }

                    break;
                }else{
                    System.out.println("Повторите ввод");
                }

            }
        }

        System.out.println("Успешно. Идём дальше");

    }


    private boolean checkNumberPoint(int x,int y){
        if(x<0 || x>10){
            return false;
        }

        if(y<0 || y>10){
            return false;
        }

        return true;
    }

    private boolean checkPoint(int x,int y){

        if(!checkNumberPoint(x,y)){
            System.out.println("Точка ("+ x +", "+y +") не удовлетворяет условиям размещения на игровом поле. Ошибка координат (игровое поле (0-9)*(0-9))");
            return false;
        }

        if(player.getMyPlayground()[y][x]==1){
            System.out.println("Точка("+ x +", "+ y +") уже занята");
            return false;
        }

        /*тут проверить координаты вокруг установленной точки, чтобы не было рядом заполненных*/

            if(getPoint(x-1,y)==1 ||
            getPoint(x-1,y-1)==1 ||
            getPoint(x,y-1)==1 ||
            getPoint(x+1,y)==1 ||
            getPoint(x+1,y+1)==1 ||
            getPoint(x,y+1)==1 ||
            getPoint(x+1,y-1)==1 ||
            getPoint(x-1,y+1)==1){
                System.out.println("Точка("+ x +", "+ y +") находится рядом с ранее установленным кораблём. Продолжить установку не возможно. Измените позиции");
                return false;
            }


        /*конец проверки*/

        return true;
    }

    private int getPoint(int x,int y){
        if(x<0 || y<0 || y>9 || x>9){
            return 0;
        }
        return player.getMyPlayground()[y][x];
    }
    private void setPoint(int x,int y){
            player.setPointMyPlayground(x,y);
    }

    public String[] getPointsArray() {
        return pointsArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(pointsArray);
    }

    public int getActivePoints() {
        return activePoints;
    }

    public void setActivePoints(int activePoints) {
        this.activePoints = activePoints;
    }
}
