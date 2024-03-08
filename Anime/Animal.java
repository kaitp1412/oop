package Anime;

abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void say();

    public abstract void move();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Dog : gâu gâu");
    }

    @Override
    public void move() {
        System.out.println("Dog runs");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Cat: nghèo.........");
    }

    @Override
    public void move() {
        System.out.println("Cat nhảy");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Bird: chisp chíp ");
    }

    @Override
    public void move() {
        System.out.println("Bird fling...........");
    }
}

 class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        Bird bird = new Bird("Tweety", 1);

        System.out.println("Dog:");
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        dog.say();
        dog.move();

        System.out.println();

        System.out.println("Cat:");
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        cat.say();
        cat.move();

        System.out.println();

        System.out.println("Bird:");
        System.out.println("Name: " + bird.getName());
        System.out.println("Age: " + bird.getAge());
        bird.say();
        bird.move();
    }
}