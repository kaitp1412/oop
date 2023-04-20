public abstract class People {
    String name ;
    int Age ;
    boolean gender ;
    public People(String name , int age , boolean gender ) {
        this.name = name;
        this.Age = age ;
        this.gender = gender;
    }
    public abstract void eat();
    public abstract void sleep() ;
    public abstract void study();
}
interface Student {
    void registerCourse (String course);
    void attendClass();

}
interface Employee {
    void work ();
    void takeABreak();

}
class StudentImpl extends People implements Student{
    public StudentImpl (String name , int age , boolean gender ){
        super(name,age,gender);
    }
    @Override
    public void eat(){
        //
    }
    @Override
    public void sleep(){
        //
    }
    @Override
    public void study() {
        //
    }
    @Override
    public void registerCourse(String coures){
        //
    }
    @Override
    public void attendClass(){
        //
    }
}
class te {
    public static void main(String[] args) {
        StudentImpl student = new StudentImpl("Tuan Anh", 25, true);
        student.eat();
        student.sleep();
        student.registerCourse("Programming Node JS");
        student.attendClass();
    }
}