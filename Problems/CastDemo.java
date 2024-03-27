package Problems;

class Animal{
    void eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}
class cat extends Animal{
    void meow(){
        System.out.println("cat method");
    }
}
public class CastDemo {
    public static void main(String[] args) {
        //parentclass objname= new childclass name(); upcasting
        //childclassname objname = (childclassname) ohjname;
        Animal obj1= new Dog();
        Dog obj2= (Dog) obj1;
        obj2.bark();
        obj2.eat();

        Animal obj3= new cat();
        cat obj4=(cat) obj3;
        obj4.eat();
        obj4.meow();

    }

    
}
