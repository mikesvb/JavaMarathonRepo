package day11.Task1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Courier implements Worker{
    private int salary=0;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary+=100;
        warehouse.setBalance(warehouse.getBalance()+1000);
        if(warehouse.getBalance()==1000000){
            bonus();


        }
    }

    @Override
    public void bonus() {
        System.out.println("Курьеру выдан бонус в виде двойной оплаты за 1000000");
        System.out.println("Заработанные деньги на этот момент были " + salary);
        salary*=2;

        System.out.println("Заработанные деньги  на этот момент стали " + salary);
        System.out.println("Баланс склада на текущий момент : " + warehouse.getBalance());
        System.out.println("Заказов : " + warehouse.getCountOrder());
        System.out.println("------------------------------");
    }

    public int getSalary() {
        return salary;
    }
}
