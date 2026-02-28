import java.util.Objects;

class EqBug {
    public static void main(String[] args) {
        // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2)); // Output: true

        // Mutant code
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("Unreachable if branch");
        } else {
            System.out.println("Reachable else branch");
        }
    }

    private static boolean getCondition() {
        // This method always returns false, making the if branch unreachable
        return false;
    }
}