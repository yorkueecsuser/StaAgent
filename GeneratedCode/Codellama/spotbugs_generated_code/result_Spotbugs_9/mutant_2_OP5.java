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
    }
}

// Mutated Code:
class RepeatedConditionalTest {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            switch(x) { // Unreachable switch statement
                case 0:
                    System.out.println("Bug found!");
                    break;
                default:
                    System.out.println("No bug found!");
                    break;
            }
        } else {
            System.out.println("No bug found!");
        }
    }
}