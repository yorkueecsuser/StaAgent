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
        boolean conditionWhile = getCondition();
        while (false) {
            System.out.println("This code is unreachable");
        }
    }

    public static boolean getCondition() {
        return false;
    }
}