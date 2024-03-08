package Shape;

abstract class Shape {
    private String color;
    private int borderWidth;

    public Shape(String color, int borderWidth) {
        this.color = color;
        this.borderWidth = borderWidth;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public String getColor() {
        return color;
    }

    public int getBorderWidth() {
        return borderWidth;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, int borderWidth, double width, double height) {
        super(color, borderWidth);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, int borderWidth, double radius) {
        super(color, borderWidth);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, int borderWidth, double side1, double side2, double side3) {
        super(color, borderWidth);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("black", 2, 4, 6);
        Circle circle = new Circle("blue", 1, 4);
        Triangle triangle = new Triangle("green", 3, 3, 4, 5);

        System.out.println("Rectangle:");
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Border Width: " + rectangle.getBorderWidth());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        System.out.println();

        System.out.println("Circle:");
        System.out.println("Color: " + circle.getColor());
        System.out.println("Border Width: " + circle.getBorderWidth());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println();

        System.out.println("Triangle:");
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Border Width: " + triangle.getBorderWidth());
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}
