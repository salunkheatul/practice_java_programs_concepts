package concepts;

// This class only accepts type parametes as any class
// which extends class A or class A itself.
// Passing any other type will cause compiler time error

class Bound<T extends A> {

    private T objRef;

    public Bound(T obj) {
        this.objRef = obj;
    }

    public void doRunTest() {
        this.objRef.displayClass();
    }
}

class MultiBound<T extends CarIntA & CarIntB> { //Allows Only One Class & Multiple Interface
    private T obj;

    public MultiBound(T obj) {
        this.obj = obj;
    }

    public void doRunTest() {
        this.obj.displayClass();
    }
}

interface CarIntA {
    void displayClass();
}

interface CarIntB {

}

class A {
    public void displayClass() {
        System.out.println("Inside super class A");
    }
}

class B extends A {
    public void displayClass() {
        System.out.println("Inside sub class B");
    }
}

class C extends A {
    public void displayClass() {
        System.out.println("Inside sub class C");
    }
}

class CarA implements CarIntA, CarIntB {
    public void displayClass() {
        System.out.println("Inside class CarA");
    }
}

class Bus {

}

public class GenericsBoundedType {
    public static void main(String a[]) {

        // Creating object of sub class C and
        // passing it to Bound as a type parameter.
        Bound<C> bec = new Bound<C>(new C());
        bec.doRunTest();

        // Creating object of sub class B and
        // passing it to Bound as a type parameter.
        Bound<B> beb = new Bound<B>(new B());
        beb.doRunTest();

        // similarly passing super class A
        Bound<A> bea = new Bound<A>(new A());
        bea.doRunTest();

        //passing other class object
//        Bound<Bus> busBound = new Bound<Bus>(new Bus());    //This line will Throw Error "Parameter not within its Bound"

        MultiBound<CarA> carAMultiBound = new MultiBound<CarA>(new CarA());
        carAMultiBound.doRunTest();
    }
}


/*  ----- OUTPUT ------

Inside sub class C
Inside sub class B
Inside super class A
Inside class CarA

 */