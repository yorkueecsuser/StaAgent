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

        // Add unreachable if statement
        if (getCondition()) {
            System.out.println("Unreachable code executed!");
        } else {
            System.out.println("No unreachable code executed!");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}