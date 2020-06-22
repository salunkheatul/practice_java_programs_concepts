package concepts;

public class Enums {
    enum Color {
        red(1), blue(2), green(3);

        int value;

        Color(int i) {
            value = i;
        }

        public int getIntValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Color c1 = Color.blue;
        System.out.println(c1.getIntValue());

        System.out.println(Color.red.getIntValue());

        System.out.println(c1);
    }
}

/*  ----- OUTPUT ------

2
1
blue

 */