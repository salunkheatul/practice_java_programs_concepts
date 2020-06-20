package concepts;


import static java.lang.System.out;

class InitBlockBeforeConstructor {
    int x, y;

    // block to be executed before Any/Every constructor.
    {
        this.x = 1;
        this.y = 2;
        out.println("init x===> " + x);
        out.println("init y===> " + y);
    }

    // no-arg constructor
    InitBlockBeforeConstructor() {
        out.println("default x===> " + x);
        out.println("default y===> " + y);
    }

    // constructor with one argument.
    InitBlockBeforeConstructor(int x) {
        out.println("parameterized x===> " + x);
        out.println("parameterized y===> " + y);
    }

    // block to be executed after the first block
    // which has been defined above.
    {
        out.println("second init");
    }

    public static void main(String[] args) {
        // Object creation by calling no-argument
        // constructor.
        new InitBlockBeforeConstructor();

        // Object creation by calling parameterized
        // constructor with one parameter.
        new InitBlockBeforeConstructor(10);
    }
}

/*  ----- OUTPUT ------

init x===> 1
init y===> 2
second init
default x===> 1
default y===> 2
init x===> 1
init y===> 2
second init
parameterized x===> 10
parameterized y===> 2

*/