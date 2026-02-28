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

// Mutant 1: Duplicate the assignment statement in the catch block
catch (Exception e) {
    System.out.println("Caught an exception: " + e.getMessage());
    // BUG: AvoidInstanceofChecksInCatchClause
    if (e instanceof RuntimeException) {
        System.out.println("This is a runtime exception");
    } else {
        System.out.println("This is an I/O exception");
    }
    System.out.println("This is an I/O exception");
}

// Mutant 2: Duplicate the assignment statement in the catch block
catch (Exception e) {
    System.out.println("Caught an exception: " + e.getMessage());
    // BUG: AvoidInstanceofChecksInCatchClause
    if (e instanceof RuntimeException) {
        System.out.println("This is a runtime exception");
    } else {
        System.out.println("This is an I/O exception");
    }
    System.out.println("This is an I/O exception");
}