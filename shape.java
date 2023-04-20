public abstract class shape {
    protected String color = "red";
    protected boolean filled = true;

    public shape() {
    }

    public shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString() {
        return "Shape with color  " + this.getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }
}
 class Circly extends shape {
    private double radius;

    public Circly() {
    }

    public Circly(double radius) {
        this.radius = radius;
    }

    public Circly(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return this.radius + " - " + this.color + " - " + this.filled;
    }
}
 class Rectangl extends shape{

        protected double width = 1.0;
        protected double length = 1.0;

        public Rectangl() {
        }

        public Rectangl(double width, double length) {
            this.width = width;
            this.length = length;
        }

        public Rectangl(String color, boolean filled, double width, double length) {
            super(color, filled);
            this.width = width;
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        @Override
        public double getArea() {
            return this.width * this.length;
        }

        @Override
        public double getPerimeter() {
            return this.width + this.length;
        }

        @Override
        public String toString() {
            return this.width + " - " +  this.length + " - " + this.color + " - " + this.filled;
        }
    }
     class Square extends Rectangl {
        public Square() {
        }

        public Square(double side) {
            super(side, side);
        }

        public Square(String color, boolean filled, double side) {
            super(color, filled, side, side);
        }
        public double getSide() {
            return getWidth();
        }

        public void setSide(double side) {
            setWidth(side);
            setLength(side);
        }

        @Override
        public void setWidth(double width) {
            setSide(width);
        }

        @Override
        public void setLength(double length) {
            setSide(length);
        }

        @Override
        public String toString() {
            return " Square side=" + getSide() + ", which is a subclass of " + super.toString();
        }
      }

     class text {

        public static void main(String[] args) {
            shape s1 = new Circly("RED", true, 5.5);
            System.out.println(s1);
            System.out.println(s1.getArea());
            System.out.println(s1.getPerimeter());
            System.out.println(s1.getColor());
            System.out.println(s1.isFilled());
            System.out.println(((Circly) s1).getRadius());

            Circly c1 = (Circly)s1;
            System.out.println(c1);
            System.out.println(c1.getArea());
            System.out.println(c1.getPerimeter());
            System.out.println(c1.getColor());
            System.out.println(c1.isFilled());
            System.out.println(c1.getRadius());

            shape s3 = new Rectangl("RED", false, 4.5, 7.5);
            System.out.println(s3);
            System.out.println(s3.getArea());
            System.out.println(s3.getPerimeter());
            System.out.println(s3.getColor());
            System.out.println(((Rectangl) s3).getLength());

            Rectangl r1 = (Rectangl)s3;
            System.out.println(r1);
            System.out.println(r1.getArea());
            System.out.println(r1.getColor());
            System.out.println(r1.getLength());

            shape s4 = new Square(6.6);
            System.out.println(s4);
            System.out.println(s4.getArea());
            System.out.println(s4.getColor());
            System.out.println(((Square) s4).getWidth());

            Rectangl r2 = (Rectangl)s4;
            System.out.println(r2);
            System.out.println(r2.getArea());
            System.out.println(r2.getColor());
            System.out.println(r2.getWidth());
            System.out.println(r2.getLength());

            Square sq1 = (Square)r2;
            System.out.println(sq1);
            System.out.println(sq1.getArea());
            System.out.println(sq1.getColor());
            System.out.println(sq1.getWidth());
            System.out.println(sq1.getLength());
        }
    }


