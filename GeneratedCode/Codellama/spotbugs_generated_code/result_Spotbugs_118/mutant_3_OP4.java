import java.util.*;

class NPNullInstanceOfBug {
    public static void main(String[] args) {
        Object obj = null;
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        if (obj instanceof String) {
            System.out.println("Object is a string");
        } else {
            System.out.println("Object is not a string");
        }

        // Mutant code being added MUST be unique not generic.
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("Object is not a string");
        } else {
            System.out.println("Object is a string");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}