package day7.Task1;

public class Plane {

    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Plane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info(){
        System.out.println("Изготовитель: " + getManufacturer() + " , год выпуска: "+ getYear() +" , длина: "+ getLength() +", вес: "+ getWeight() + ", объем топлива в баке: " + getFuel());
    }

    public void  fillUp(int fuel){
        setFuel(getFuel()+fuel);
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuel() {
        return fuel;
    }


    public static void comparePlane(Plane plane1, Plane plane2){

        int planeLength1=plane1.getLength();
        int planeLength2=plane2.getLength();

        if (planeLength1>planeLength2){
            System.out.println("У самолёта " + plane1.getManufacturer() + " длина больше чем у " + plane2.getManufacturer());
        }else if (planeLength1<planeLength2){
            System.out.println("У самолёта " + plane2.getManufacturer() + " длина больше чем у " + plane1.getManufacturer());
        }else if(planeLength1==planeLength2){
            System.out.println("У самолётов длины разные");
        }


    }
}
