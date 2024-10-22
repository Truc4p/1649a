package fgw.Extra_Topics.UML_Realization;

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }
}

public class RealizationExample {
    public static void main(String[] args) {

        /**
         * A Bird realizes the Flyable interface, which means it provides an implementation
         * for the fly() method defined in the interface. The dashed line with a hollow
         * arrow in the UML diagram would point from Bird to Flyable.
         */
        
        Bird myBird = new Bird("Sparrow");
        myBird.fly(); // Output: Sparrow is flying.
    }
}