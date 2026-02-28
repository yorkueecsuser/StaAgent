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
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Unreachable code added");
        } else {
            System.out.println("Unreachable code added");
        }
    }

    public boolean getCondition() {
        return false;
    }
}