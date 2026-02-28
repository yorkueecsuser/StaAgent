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
            
            // Mutant code being added
            boolean condition = getCondition();
            if (condition) {
                System.out.println("This is an unreachable code");
            }
        }
    }
    
    private static boolean getCondition() {
        // this method is used to generate a non-final variable to avoid unreachable statement error
        return false;
    }
}