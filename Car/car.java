package Car;

abstract class Vehicle {
    private String brand;
    private String color;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public abstract void start();

    public abstract void accelerate();

    public abstract void stop();

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
}

class Car extends Vehicle {
    public Car(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void start() {
        System.out.println("Car starts");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerates");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle starts");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle accelerates");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stops");
    }
}

class Truck extends Vehicle {
    public Truck(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void start() {
        System.out.println("Truck starts");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck accelerates");
    }

    @Override
    public void stop() {
        System.out.println("Truck stops");
    }
}

 class Main {
    public static void main(String[] args) {
        Car car = new Car("bugati", "Aqua");
        Motorcycle motorcycle = new Motorcycle("Honda", "Black red");
        Truck truck = new Truck("Volvo", "Ehite");

        System.out.println("Car:");
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Color: " + car.getColor());
        car.start();
        car.accelerate();
        car.stop();

        System.out.println();

        System.out.println("Motorcycle:");
        System.out.println("Brand: " + motorcycle.getBrand());
        System.out.println("Color: " + motorcycle.getColor());
        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.stop();

        System.out.println();

        System.out.println("Truck:");
        System.out.println("Brand: " + truck.getBrand());
        System.out.println("Color: " + truck.getColor());
        truck.start();
        truck.accelerate();
        truck.stop();
    }
}
