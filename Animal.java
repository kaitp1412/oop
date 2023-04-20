public  abstract class Animal {
    public abstract String MakeSound () ;
}
interface Ediable {
    String HowtoEat();
}
class Tiger extends Animal implements Ediable {

    @Override
    public String MakeSound() {
        return "Tiger : Grrrrrrr" ;
    }
    @Override
    public String HowtoEat(){
        return "Can not eat " ;
    }
}
class Chicken extends Animal implements Ediable {
    @Override
    public String MakeSound(){
        return "Chicken : cluck - cluck " ;
    }
    @Override
    public String HowtoEat(){
        return "Chicken : could be fried " ;
    }
}
class check {
    public static void main(String[] args) {
        Animal [] animals = new Animal[2] ;
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.MakeSound());
            if ( animal instanceof Chicken){
                Ediable ediable = (Chicken) animal ;
                System.out.println(ediable.HowtoEat());
            }
        }
    }
}
abstract class Fruit implements Ediable {
}
class Apple extends Fruit {
    @Override
    public String HowtoEat(){
        return "apple could be slided";
    }
}
class Orange extends Fruit{
    @Override
    public String HowtoEat(){
        return "Orange could be slided";
    }
}
class checkFruit{
    public static void main(String[] args) {
        Fruit [] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits){
            if (fruit instanceof Apple){
                Ediable ediable = (Apple) fruit;
                System.out.println(ediable.HowtoEat());
            }
        }
    }
}