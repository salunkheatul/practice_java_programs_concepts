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

    public void print4(Short a, Short b) {
        out.print("print 4  ====> ");
        out.println(a + b);
    }

    public void print5(byte a, byte b) {
        out.print("print 5  ====> ");
        out.println(a + b);
    }

    public void print6(double a, double b) {
        out.print("print 6  ====> ");
        out.print(a + b);
        out.print("   ");
        out.println(a + Double.valueOf(b).intValue());
    }

    public void print7(float a, float b) {
        out.print("print 6  ====> ");
        out.print(a + b);
        out.print("   ");
        out.println(a + Float.valueOf(b).intValue());
    }

    public void print8(long a, long b) {
        out.print("print 6  ====> ");
        out.print(a + b);
        out.print("   ");
        out.println(a + Long.valueOf(b).intValue());
    }

    public static void main(String[] args) {
        WideningPrimitiveConversion wideningPrimitiveConversion = new WideningPrimitiveConversion();
        wideningPrimitiveConversion.print1();
        wideningPrimitiveConversion.print2();
        wideningPrimitiveConversion.print3();
        short a = 10;
        short b = 30;
        wideningPrimitiveConversion.print4(a, b);
        byte p = 100;
        byte q = 100;
        wideningPrimitiveConversion.print5(p, q);
        double r = 1.99;
        double s = 1.99;
        wideningPrimitiveConversion.print6(r, s);
        float x = 125.250f;
        float y = 100.250f;
        wideningPrimitiveConversion.print7(x, y);
        long m = 1500L;
        long n = 1500L;
        wideningPrimitiveConversion.print8(m, n);
    }
}

/*  ----- OUTPUT ------

print 1  ====> YO
print 2  ====> 155
print 3  ====> L  O
print 4  ====> 40
print 5  ====> 200
print 6  ====> 3.98   2.99
print 6  ====> 225.5   225.25
print 6  ====> 3000   3000

 */