package Objects;

class heart {
    heart() {
        System.out.println("heart is strong");
    }
    void checkheart() {
        System.out.println("heart is still pumping");
    }
}

class Bike {
    Bike() {
        System.out.println("Bike is ready to ride");
    }
    void checkBike() {
        System.out.println("Bike is running smoothly");
    }
}

class Person {
    // 1. COMPOSITION (Tight coupling): Heart cannot exist without Person
    heart h = new heart();

    Person() {
        System.out.println("Person created with heart");
    }

    // 2. AGGREGATION (Loose coupling): Bike exists independently of Person
    void hasBike(Bike b) {
        System.out.println("Person is riding the bike");
        b.checkBike();
    }
}

class Main {
    public static void main(String[] args) {
        // Composition: Creating Person also creates Heart
        Person p = new Person();
        p.h.checkheart();

        // Aggregation: Bike is created independently and given to Person
        Bike b = new Bike();
        p.hasBike(b);

        // Demonstrating the relationship when Person is destroyed
        p = null;
        // p.h.checkheart(); // Error: NullPointerException (Heart dies with Person)

        // Bike still exists independently!
        b.checkBike();
    }
}
