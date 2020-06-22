package concepts;

public class BreakContinueReturnGoTo {
    public void printNum() {
        // Initially loop is set to run from 0-9
        for (int i = 0; i <= 10; i++) {
            // If the number is even
            // skip and continue
            if (i <= 3 & i % 2 == 0) {
                System.out.println("Going to Continue");
                continue;
            }

            outer:
            // terminate loop when i is 10.
            if (i == 10) {
                System.out.println("Going to Break");
                break outer; //Goto Replacement
            }

            System.out.println("i: " + i);
        }
        System.out.println("Loop complete.");  //In-case of Break statement this will be Printed for 10th Loop.
        // if we replace Break with Return at line no 17 this will not be printed
    }

    public static void main(String args[]) {
        BreakContinueReturnGoTo breakContinueReturnGoTo = new BreakContinueReturnGoTo();
        breakContinueReturnGoTo.printNum();
    }
}


/*  ----- OUTPUT ------

Going to Continue
i: 1
Going to Continue
i: 3
i: 4
i: 5
i: 6
i: 7
i: 8
i: 9
Going to Break
i: 10
Loop complete.

 */

