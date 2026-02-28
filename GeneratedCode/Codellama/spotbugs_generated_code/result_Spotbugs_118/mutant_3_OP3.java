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
        
        // Unreachable if statement
        if (getCondition()) {
            System.out.println("This code is unreachable");
        }
    }
    
    // Helper method to generate a condition for the unreachable if statement
    public static boolean getCondition() {
        return false;
    }
}