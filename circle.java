public class circle {
    private double radius;
    private String color;

    public circle() {
    }

    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
    public String toString() {
        return getArea() + "";
    }
}
 class Cylinder extends circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder() {
        super();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTotalArea() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return getTotalArea() + "";
    }
}


 class c {
        public static void main(String[] args) {
            circle circle = new circle();
            circle.setRadius(2);
            System.out.println("Area circle :" + circle.getArea());

            Cylinder cylinder = new Cylinder(circle.getRadius(), circle.getColor(), 5);
            System.out.println("Total is: " + cylinder.getTotalArea());
        }
}


