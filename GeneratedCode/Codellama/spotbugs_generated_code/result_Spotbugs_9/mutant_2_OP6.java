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

        // Mutant code
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This code is unreachable");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}