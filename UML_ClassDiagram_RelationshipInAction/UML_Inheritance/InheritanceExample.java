package fgw.Extra_Topics.UML_Inheritance;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(super.getName() + " is barking.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {

        /**
         * A Dog is a type of Animal. The Dog class inherits the eat() method
         * from the Animal class and adds its own specific behavior, bark().
         * The hollow arrow in the UML diagram would point from Dog to Animal.
         */

        Dog myDog = new Dog("Buddy");
        myDog.eat(); // Output: Buddy is eating.
        myDog.bark(); // Output: Buddy is barking.
    }
}