import java.util.*;

class RepeatedConditionalTest {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        boolean unreachableCondition = false;
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            System.out.println("Bug found!");
        } else if (unreachableCondition) {
            System.out.println("Unreachable code!");
        } else {
            System.out.println("No bug found!");
        }
    }
}