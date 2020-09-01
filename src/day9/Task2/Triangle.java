package day9.Task2;

public class Triangle extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double p = (this.sideA + this.sideB + this.sideC) / 2;
        return Math.sqrt(p * (p-this.sideA) * (p-this.sideB) * (p-this.sideC));
    }

    @Override
    public double perimeter() {
        return (this.sideA + this.sideB + this.sideC);
    }
}
