package concepts;

public class ForeachLoop {
    public static void main(String[] arg) {
        {
            int[] marks = {125, 132, 95, 116, 110};

            int highest_marks = maximum(marks);
            System.out.println("The highest score is " + highest_marks);
            for (int i = 0; i < marks.length; i++) {
                System.out.println("after execution " + marks[i]);
            }
        }
    }

    public static int maximum(int[] numbers) {
        int maxSoFar = numbers[0];

        // for each loop
        for (int num : numbers) {  /* only iterates forward cannot do for (int i=numbers.length-1; i>0; i--) */
            num = num * 2;  //This don't change Value in Array
            if (num > maxSoFar) { // we cannot  do numbers[i] == arr[i]
                maxSoFar = num; //we cannot do return num[i] cause we don't know i(index) in case of foreach loop
            }
        }
        return maxSoFar;
    }
}

/*  ----- OUTPUT ------

The highest score is 264
after execution 125
after execution 132
after execution 95
after execution 116
after execution 110

 */
