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
            
            // Unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; false; i++) {
                System.out.println("This is an unreachable for loop");
            }
        }
    }
    
    // Helper method to get condition
    public static boolean getCondition() {
        return Math.random() < 0.5;
    }
}