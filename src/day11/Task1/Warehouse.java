package day11.Task1;

public class Warehouse {
    private int countOrder=0;
    private int balance=0;

    public Warehouse(int countOrder, int balance) {
        this.countOrder = countOrder;
        this.balance = balance;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return ("Количество собранных заказов " + countOrder + " / доход от доставленных заказов " + balance);
    }
}
