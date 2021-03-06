package concepts;

class ConstChaining {
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    ConstChaining() {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }

    // parameterized constructor 2
    ConstChaining(int x) {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }

    // parameterized constructor 3
    ConstChaining(int x, int y) {
        System.out.println(x * y);
    }

    public static void main(String args[]) {
        // invokes default constructor first
        new ConstChaining();
    }
}


/*  ----- OUTPUT ------

75
5
The Default constructor

*/