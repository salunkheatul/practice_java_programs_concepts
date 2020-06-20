package concepts;

// Java program to illustrate Constructor Chaining to
// other class using super() keyword
class Base {
    String name;

    // constructor 1
    Base() {
        this("");
        System.out.println("No-argument constructor of" +
                " base class");
    }

    // constructor 2
    Base(String name) {
        this.name = name;
        System.out.println("Calling parameterized constructor"
                + " of base");
    }
}

class SuperClassConstChaining extends Base {
    // constructor 3
    SuperClassConstChaining() {
        System.out.println("No-argument constructor " +
                "of derived");
    }

    // parameterized constructor 4
    SuperClassConstChaining(String name) {
        // invokes base class constructor 2
        super(name);
        System.out.println("Calling parameterized " +
                "constructor of derived");
    }

    public static void main(String args[]) {
        // calls parameterized constructor 4
        SuperClassConstChaining obj = new SuperClassConstChaining("test");

        // Calls No-argument constructor
        // Derived obj = new Derived();
    }
}
