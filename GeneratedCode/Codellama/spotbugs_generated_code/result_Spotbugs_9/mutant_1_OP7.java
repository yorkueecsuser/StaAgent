import java.util.*;

class RepeatedConditionalTest {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            System.out.println("Bug found!");
        } else {
            System.out.println("No bug found!");
        }

        // Unreachable while loop
        boolean condition = getCondition(); // non-final variable
        while (false) { // unreachable loop
            // this code will never execute
            System.out.println("This code is unreachable!");
        }
    }
}