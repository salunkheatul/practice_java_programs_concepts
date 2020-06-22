package concepts;

import static java.lang.System.out;

public class ArrayDefaultValues {
    public static void main(String[] args) {
        out.println("String array default values:");
        String str[] = new String[5];
        for (String s : str)
            out.print(s + " ");

        out.println("\n\nInteger array default values:");
        int num[] = new int[5];
        for (int val : num)
            out.print(val + " ");

        out.println("\n\nDouble array default values:");
        double dnum[] = new double[5];
        for (double val : dnum)
            out.print(val + " ");

        out.println("\n\nBoolean array default values:");
        boolean bnum[] = new boolean[5];
        for (boolean val : bnum)
            out.print(val + " ");

        out.println("\n\nReference Array default values:");
        ArrayDefaultValues arrayDefaultValues[] = new ArrayDefaultValues[5];
        for (ArrayDefaultValues val : arrayDefaultValues)
            out.print(val + " ");
    }
}

/*  ----- OUTPUT ------

    String array default values:
        null null null null null

        Integer array default values:
        0 0 0 0 0

        Double array default values:
        0.0 0.0 0.0 0.0 0.0

        Boolean array default values:
        false false false false false

        Reference Array default values:
        null null null null null

 */