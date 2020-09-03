package day11.Task1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Courier implements Worker{
    private int salary=0;
    private Warehouse warehouse;
    private int k=1;//коэффициент

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary+=100*k;
        warehouse.setBalance(warehouse.getBalance()+1000);
        if(warehouse.getBalance()==1000000){
            bonus();
            System.out.println("Баланс склада на текущий момент : " + warehouse.getBalance());
            System.out.println("Заказов : " + warehouse.getCountOrder());
            System.out.println("------------------------------");
            this.k=2;
        }
    }

    @Override
    public void bonus() {
        System.out.println("Курьеру выдан бонус в виде двойной оплаты за 1000000");
        System.out.println("Зарплата на этот момент " + salary);
    }

    public int getSalary() {
        return salary;
    }
}
