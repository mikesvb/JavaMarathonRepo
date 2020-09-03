package day11.Task1;

public class Picker implements Worker {
    private int salary=0;
    public Warehouse warehouse;
    private int k=1;//коэффициент

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary+=80*k;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
        if(warehouse.getCountOrder()==1500){
            bonus();
            this.k=3;
        }
    }

    @Override
    public void bonus() {
        System.out.println("выдан бонус в виде тройной оплаты");
        System.out.println("Зарплата на этот момент " + salary);
        System.out.println("Баланс склада на текущий момент : " + warehouse.getBalance());
        System.out.println("Заказов : " + warehouse.getCountOrder());
        System.out.println("------------------------------");
    }

    public int getSalary() {
        return salary;
    }
}
