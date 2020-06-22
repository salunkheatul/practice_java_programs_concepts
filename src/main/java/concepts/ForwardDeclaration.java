package concepts;

public class ForwardDeclaration {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.fun(5);
    }
}

class Test1 {
    void fun(int x) {
        System.out.println("forward function fun() called: x = " + x);
    }
}

/*  ----- OUTPUT ------

forward function fun() called: x = 5

 */