package day7.Task1;

public class Task1 {
    public static void main(String[] args) {
        Plane plane1 = new Plane("Made in USSR", 1980, 20, 5);
        plane1.setYear(1977);
        plane1.setLength(33);
        plane1.fillUp(800);

        Plane plane2 = new Plane("Made in USA", 2015, 200, 10);
        plane2.setYear(1996);
        plane2.fillUp(1500);


        Plane.comparePlane(plane1, plane2);
    }
}
