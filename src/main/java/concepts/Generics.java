package concepts;

class Test<T> {
    // An object of type T is declared
    T obj;

    Test(T obj) {
        this.obj = obj;
    }  // constructor

    public T getObject() {
        return this.obj;
    }
}

class MultiTest<T, U> {
    // An object of type T is declared
    T obj1;
    U obj2;

    public MultiTest(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public U getObj2() {
        return obj2;
    }
}

class Car {
    String carName;

    public Car(String carName) {
        this.carName = carName;
    }
}

// Driver class to test above
class Generics {
    public <T> void getGeneric(T obj){
        System.out.println("Class: "+obj.getClass().getName()+" Obj:"+obj);
    }

    public static void main(String[] args) {
        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        Test<String> sObj =
                new Test<String>("Generic");
        System.out.println(sObj.getObject());

        //Instance of Car Type
        Test<Car> carObj = new Test<Car>(new Car("Hyundai"));
        System.out.println(carObj.getObject().carName);

        //Multi Parameter Generic
        MultiTest<Integer, Car> multiTestObj = new MultiTest<Integer, Car>(1186, new Car("WagonR"));
        System.out.println("Car No: " + multiTestObj.getObj1() + " Model: " + multiTestObj.getObj2().carName);
        Generics generics = new Generics();
        generics.getGeneric(multiTestObj);
    }
}


/*  ----- OUTPUT ------

15
Generic
Hyundai
Car No: 1186 Model: WagonR
Class: concepts.MultiTest Obj:concepts.MultiTest@610455d6

 */