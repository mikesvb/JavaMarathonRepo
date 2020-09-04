package day11.Task1;

public class Picker implements Worker {
    private int salary=0;
    public Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary+=80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
        if(warehouse.getCountOrder()==1500){
            bonus();

        }
    }

    @Override
    public void bonus() {
        System.out.println("Сборщику выдан бонус в виде тройной оплаты");
        System.out.println("Заработанные деньги на этот момент были " + salary);
        salary*=3;

        System.out.println("Заработанные деньги  на этот момент стали " + salary);
        System.out.println("Баланс склада на текущий момент : " + warehouse.getBalance());
        System.out.println("Заказов : " + warehouse.getCountOrder());
        System.out.println("------------------------------");
    }

    public int getSalary() {
        return salary;
    }
}
