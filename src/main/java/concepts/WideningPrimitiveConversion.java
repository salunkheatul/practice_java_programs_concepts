package concepts;

import static java.lang.System.out;

public class WideningPrimitiveConversion {
    public void print1() {
        out.print("print 1  ====> ");
        out.println("Y" + "O");
    }

    public void print2() {
        out.print("print 2  ====> ");
        out.println('L' + 'O');
    }

    public void print3() {
        out.print("print 3  ====> ");
        out.print('L');
        out.print("  ");
        out.println('O');
    }

    public static void main(String[] args) {
        WideningPrimitiveConversion wideningPrimitiveConversion = new WideningPrimitiveConversion();
        wideningPrimitiveConversion.print1();
        wideningPrimitiveConversion.print2();
        wideningPrimitiveConversion.print3();
    }
}

/*  ----- OUTPUT ------

print 1  ====> YO
print 2  ====> 155
print 3  ====> L  O

 */