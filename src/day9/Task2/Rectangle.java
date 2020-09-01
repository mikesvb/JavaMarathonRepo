package day9.Task2;

public class Rectangle extends Figure{
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return (sideA * sideB);
    }

    @Override
    public double perimeter() {
        return (2*(sideA + sideB));
    }
}
