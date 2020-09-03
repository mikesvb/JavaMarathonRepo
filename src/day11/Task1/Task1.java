package day11.Task1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(0,0);

        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        System.out.println("Работа началась...");
        for (int i = 0; i < 3000; i++) {
            picker.doWork();
            courier.doWork();
            warehouse.toString();
        }

        System.out.println("Сборщик собрал " + warehouse.getCountOrder() + " заказов. И заработал " + picker.getSalary());

        System.out.println("Курьер доставил " + warehouse.getCountOrder() + " заказов. И заработал " + courier.getSalary());

        System.out.println("Общее количество заказов " + warehouse.getCountOrder());
        System.out.println("Баланс склада " + warehouse.getBalance());
    }
}
