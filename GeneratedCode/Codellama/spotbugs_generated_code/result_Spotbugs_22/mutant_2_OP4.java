import java.util.Objects;

class EqBug {
    public static void main(String[] args) {
        // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2)); // Output: true
    }
}

// Mutant code for Unreachable if-else statement
class EqBugMutant {
    public static void main(String[] args) {
        // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
        Object obj1 = new Object();
        Object obj2 = new Object();
        boolean condition = getCondition();
        if (condition) {
            System.out.println(obj1.equals(obj2)); // Output: true
        } else {
            // Do nothing
        }
    }

    private static boolean getCondition() {
        return false;
    }
}