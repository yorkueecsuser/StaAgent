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

// Mutant_1: Renaming user-defined variable "x" to "a"
class RepeatedConditionalTest {
    public static void main(String[] args) {
        int a = 0;
        int y = 1;
        if (a == 0 || a == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            System.out.println("Bug found!");
        } else {
            System.out.println("No bug found!");
        }
    }
}

// Mutant_2: Renaming user-defined variable "y" to "b"
class RepeatedConditionalTest {
    public static void main(String[] args) {
        int x = 0;
        int b = 1;
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            System.out.println("Bug found!");
        } else {
            System.out.println("No bug found!");
        }
    }
}

// Mutant_3: Renaming user-defined variable "x" to "c"
class RepeatedConditionalTest {
    public static void main(String[] args) {
        int c = 0;
        int y = 1;
        if (c == 0 || c == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            System.out.println("Bug found!");
        } else {
            System.out.println("No bug found!");
        }
    }
}