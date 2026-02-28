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

        // MUTATION OPERATOR: Unreachable while loop
        // Insert an unreachable while loop into a randomly selected basic block in the program.
        // The condition of the inserted loop is always false to make it unreachable.
        boolean loopCondition = false;
        while (loopCondition) {
            // code that is never executed
        }
    }
}