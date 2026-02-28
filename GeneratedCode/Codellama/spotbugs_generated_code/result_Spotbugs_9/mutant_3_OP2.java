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

// Mutant 1: Duplicate assignment of variable x
int x = 0;
int y = 1;
if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
    System.out.println("Bug found!");
} else {
    System.out.println("No bug found!");
}

// Mutant 2: Duplicate assignment of variable y
int x = 0;
int y = 1;
if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
    System.out.println("Bug found!");
} else {
    System.out.println("No bug found!");
}