package finalTask;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {

        System.out.println("Начинаем игру...");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого игрока");
        String name1 = scanner.nextLine();
        System.out.println("Введите имя второго игрока");
        String name2 = scanner.nextLine();

        //String name1="Игрок 1 ";
        //String name2="Игрок 2 ";

        Player player1 = new Player(name1);

        Player player2 = new Player(name2);

        System.out.println("Игроки: " + player1.getName() + " и " + player2.getName() + " созданы");

        System.out.println("---------------------");
        System.out.println("------ВНИМАНИЕ!------");
        System.out.println("Игрок " + player1.getName() + " расставляет свои корабли. Пожалуйста, игрок " + player2.getName() + " отвернитесь.");

        Ship p1_ship4 = new Ship(player1, 4,true,4, "");

        Ship p1_ship3_1 = new Ship(player1, 3,true,3, "первого");
        Ship p1_ship3_2 = new Ship(player1, 3,true,3, "второго");

        Ship p1_ship2_1 = new Ship(player1, 2,true,2, "первого");
        Ship p1_ship2_2 = new Ship(player1, 2,true,2, "второго");
        Ship p1_ship2_3 = new Ship(player1, 2,true,2, "третьего");

        Ship p1_ship1_1 = new Ship(player1, 1,true,1, "первого");
        Ship p1_ship1_2 = new Ship(player1, 1,true,1, "второго");
        Ship p1_ship1_3 = new Ship(player1, 1,true,1, "третьего");
        Ship p1_ship1_4 = new Ship(player1, 1,true,1, "четвёртого");


        System.out.println("---------------------");
        System.out.println("------ВНИМАНИЕ!------");
        System.out.println("Игрок " + player2.getName() + " расставляет свои корабли. Пожалуйста, игрок " + player1.getName() + " отвернитесь.");

        Ship p2_ship4 = new Ship(player2, 4,true,4, "");

        Ship p2_ship3_1 = new Ship(player2, 3,true,3, "первого");
        Ship p2_ship3_2 = new Ship(player2, 3,true,3, "второго");

        Ship p2_ship2_1 = new Ship(player2, 2,true,2, "первого");
        Ship p2_ship2_2 = new Ship(player2, 2,true,2, "второго");
        Ship p2_ship2_3 = new Ship(player2, 2,true,2, "третьего");

        Ship p2_ship1_1 = new Ship(player2, 1,true,1, "первого");
        Ship p2_ship1_2 = new Ship(player2, 1,true,1, "второго");
        Ship p2_ship1_3 = new Ship(player2, 1,true,1, "третьего");
        Ship p2_ship1_4 = new Ship(player2, 1,true,1, "четвёртого");

        System.out.println("---------------------");
        System.out.println("Рыба - карась, игра началась! =)");
        System.out.println("---------------------");

        Random random = new Random();
        int rand = random.nextInt(2);

        int currentPlayer;

        Player current;
        if(rand==1) {
            currentPlayer=1;
            current=player1;
        }else{
            currentPlayer=2;
            current=player2;
        }
        System.out.println("Первым ходит " + current.getName());
        System.out.println("---------------------");


        while (true) {
            boolean skipMoveOther=false;

            System.out.println("[" + current.getName() + "] Ваш ход");

            String inputString = scanner.nextLine();

            if (currentPlayer == 1) {

                List<Ship> currentShips= player2.getShips();
                for(Ship ship:currentShips){
                    if(ship.getActivePoints()>0) {//проверяем на активные палубы
                        for (String str : ship.getPointsArray()) {
                            if (str.equals(inputString)) {
                                String[] splitStr = str.split(",");
                                if(player2.getMyPlayground()[Integer.parseInt(splitStr[1])][Integer.parseInt(splitStr[0])]==1) {
                                    ship.setActivePoints(ship.getActivePoints() - 1);

                                    player2.setSuccessPointMyPlayground(Integer.parseInt(splitStr[0]), Integer.parseInt(splitStr[1]));

                                    skipMoveOther = true;
                                    if(ship.getActivePoints()==0){
                                        if(player2.getSummPoints()!=0) {
                                            System.out.println("Утопил! " + player2.getName() + " пропускает ход");
                                        }else{
                                            System.out.println("Утопил! ");
                                        }
                                    }else{
                                        System.out.println("Попадание. " + player2.getName() + " пропускает ход");
                                    }
                                }
                            }
                        }
                    }
                }

            } else {
                List<Ship> currentShips= player1.getShips();
                for(Ship ship:currentShips){
                    if(ship.getActivePoints()>0) {//проверяем на активные палубы
                        for (String str : ship.getPointsArray()) {
                            if (str.equals(inputString)) {
                                String[] splitStr = str.split(",");
                                if(player1.getMyPlayground()[Integer.parseInt(splitStr[1])][Integer.parseInt(splitStr[0])]==1) {
                                    ship.setActivePoints(ship.getActivePoints() - 1);

                                    player1.setSuccessPointMyPlayground(Integer.parseInt(splitStr[0]), Integer.parseInt(splitStr[1]));

                                    skipMoveOther = true;
                                    if(ship.getActivePoints()==0){
                                        if(player1.getSummPoints()!=0) {
                                            System.out.println("Утопил! " + player1.getName() + " пропускает ход");
                                        }else{
                                            System.out.println("Утопил! ");
                                        }
                                    }else{
                                        System.out.println("Попадание. " + player1.getName() + " пропускает ход");
                                    }
                                }
                            }
                        }
                    }
                }
            }


            if (currentPlayer == 1) {
                if(player2.getSummPoints()==0){
                    System.out.println("Победил " + player1.getName());
                    break;
                }
            }else{
                if(player1.getSummPoints()==0){
                    System.out.println("Победил " + player2.getName());
                    break;
                }
            }


            //System.out.println("Активных пойнтов у игрока 1 - " + player1.getSummPoints());
            //System.out.println("Активных пойнтов у игрока 2 - " + player2.getSummPoints());

            if(!skipMoveOther) {
                System.out.println("Мимо!");
                if (currentPlayer == 1) {
                    currentPlayer++;
                    current = player2;
                } else {
                    currentPlayer--;
                    current = player1;
                }
            }

        }



        System.out.println("---------------------");
        System.out.println("[] - пустота");
        System.out.println("[+] - корабль");
        System.out.println("[X] - подбитый корабль");
        System.out.println("---------------------");
        System.out.println("Карта " + player1.getName());
        for (int i = 0; i < player1.getMyPlayground().length; i++) {
            for(int j=0; j< player1.getMyPlayground()[i].length; j++){
                if(player1.getMyPlayground()[i][j]==1){
                    System.out.print("[+]");
                }else  if(player1.getMyPlayground()[i][j]==2){
                    System.out.print("[X]");
                }else{
                    System.out.print("[ ]");
                }
                    System.out.print("\t");
            }
            System.out.println("\r");
        }
        System.out.println("---------------------");
        System.out.println("Карта " + player2.getName());
        for (int i = 0; i < player2.getMyPlayground().length; i++) {
            for(int j=0; j< player2.getMyPlayground()[i].length; j++){
                if(player2.getMyPlayground()[i][j]==1){
                    System.out.print("[+]");
                }else  if(player2.getMyPlayground()[i][j]==2){
                    System.out.print("[X]");
                }else{
                    System.out.print("[ ]");
                }
                System.out.print("\t");
            }
            System.out.println("\r");
        }

    }
}
