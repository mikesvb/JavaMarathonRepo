package day6.Task2;

public class Task2 {
    public static void main(String[] args) {
        Plane plane = new Plane("Made in USSR", 1980, 20, 5);
        plane.setYear(1977);
        plane.setLength(33);
        plane.fillUp(800);
        plane.info();
    }
}
