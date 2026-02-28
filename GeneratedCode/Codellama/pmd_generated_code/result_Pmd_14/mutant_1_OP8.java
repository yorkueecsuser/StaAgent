import java.util.*;

class AvoidInstanceofChecksInCatchClause {
    public static void main(String[] args) {
        try {
            // some code that throws an exception
            throw new Exception("Test exception");
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
            // BUG: AvoidInstanceofChecksInCatchClause
            if (e instanceof RuntimeException) {
                System.out.println("This is a runtime exception");
            } else {
                System.out.println("This is an I/O exception");
            }
        }
    }
}

/*
 * Mutation Operator: Renaming
 * Description: Renaming user-defined variables declared in a program. If there exist multiple variables, we randomly select one for the mutation. The new name of the variable will be in the form of [a-z].
 *
 * Original Code:
 * catch (Exception e) {
 *     System.out.println("Caught an exception: " + e.getMessage());
 *     // BUG: AvoidInstanceofChecksInCatchClause
 *     if (e instanceof RuntimeException) {
 *         System.out.println("This is a runtime exception");
 *     } else {
 *         System.out.println("This is an I/O exception");
 *     }
 * }
 *
 * Mutated Code:
 * catch (Exception a) {
 *     System.out.println("Caught an exception: " + a.getMessage());
 *     // BUG: AvoidInstanceofChecksInCatchClause
 *     if (a instanceof RuntimeException) {
 *         System.out.println("This is a runtime exception");
 *     } else {
 *         System.out.println("This is an I/O exception");
 *     }
 * }
 */