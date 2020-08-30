package day7.Task2;

public class Player {
    private String name;//выносливость
    private int stamina;//выносливость
    public final static int MAX_STAMINA = 100;
    public final static int MIN_STAMINA = 0;

    static int countPlayers = 0;

    public Player(String name, int stamina) {
        System.out.println("Создаётся игрок: "+name);
        this.name = name;
        this.stamina = stamina;
        if(countPlayers>=6){
            System.out.println("На поле уже находится 6 игроков. Новый игрок на ушел в зрители");
        }else{
            System.out.println("Создан игрок: "+name);
            countPlayers++;
        }

    }

    public int getStamina() {
        return this.stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public String getName() {
        return name;
    }

    public void run(){
        if(getStamina()>0) {
            this.setStamina(--stamina);
            if (getStamina() == 0) {
                countPlayers--;
            }
        }else{//если игрока вызвали с нулём
            System.out.println("Игрок "+ getName() +" больше бегать не может. Устал, отдыхает");
        }
    }

    public static void info(){
        if(countPlayers<6){
            System.out.println("Команды неполные, еще есть " + (6 - countPlayers) + " свободных мест");
        }else{
            System.out.println("Мест в командах больше нет");
        }



    }
}
