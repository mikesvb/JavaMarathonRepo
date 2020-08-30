package day7.Task2;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Объявляется сбор команды\n------------------------ \nКоличество игроков в текущий момент: " + Player.countPlayers);
        int numberOfPlayers = 6;
        Player[] players = new Player[numberOfPlayers];
        for(int i=0; i<numberOfPlayers; i++){
            int randomStamina =  getRandomInt(90,100);
            Player.info();

            players[i] = new Player("Player "+i, randomStamina);
        }

        Player.info();

        Player newPlayer = new Player("Новый. Седьмой", 99);//на нём должно сработать ограничение

        System.out.println("------------------------ \nКоличество игроков в текущий момент: " + Player.countPlayers);

        System.out.println("Начинает движение один из игроков. Далее мы видим изменение его выносливости: ");

        while(true) {

            players[4].run();

            if(players[4].getStamina()==Player.MIN_STAMINA){
                System.out.println("\nУ игрока " + players[4].getName() + " закончена выносливость");
                break;
            }else{
                System.out.print(players[4].getStamina() + " ");
            }

        }
        System.out.println("------------------------ \nКоличество игроков в текущий момент: " + Player.countPlayers);

        Player.info();

    }

    public static int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max-min + 1) + min);
    }

}
